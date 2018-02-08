import java.util.Scanner;

public class Main {
	public static void main(String[] argc) {
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		while (search.isEmpty())
			search = sc.nextLine();
		Mapping mp = new Mapping(search);
		mp.runApplication();
	}
}
