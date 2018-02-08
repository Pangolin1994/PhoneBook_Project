import java.util.*;
import java.util.stream.Collectors;

class Mapping {
	private String search;
	public static HashMap<String, String> hm;
	
	Mapping(String name) {
		init();
		search = name;
	}
	
	private static void init() {
		hm = new HashMap<>(6);
		hm.put("+8 800 2000 500", "Иванов И.И.");
		hm.put("+8 800 200 600", "Иванов И.И.");
		hm.put("+8 800 2000 700", "Петров П.П.");
		hm.put("+8 800 2000 800", "Сидоров С.С.");
		hm.put("+8 800 2000 900", "Сидоров С.С.");
		hm.put("+8 800 2000 000", "Сидоров С.С.");
	}
	
	public boolean containsValue(String name) {
		return hm.containsValue(name);
	}
	
	public boolean nameIsPresent() {
		if (!hm.containsValue(search)) {
			System.out.println("Данное имя в БД отсутствует");
			return false;
		}
		return true;
	}
	
	private ArrayList<String> returnPhones() {
		List<String> set = hm.entrySet()
				             .stream()
				             .filter(entry -> Objects.equals(entry.getValue(), search))
							 .map(Map.Entry::getKey)
				             .collect(Collectors.toList());
		Iterator<String> it = set.iterator();
		ArrayList<String> result = new ArrayList<>();
		while (it.hasNext())
			result.add(it.next());
		return result;
	}
	
	public void runApplication() {
		ArrayList<String> phones = new ArrayList<>();
		if (nameIsPresent())
			phones = returnPhones();
		for (String phone : phones)
			System.out.println(phone);
	}
}