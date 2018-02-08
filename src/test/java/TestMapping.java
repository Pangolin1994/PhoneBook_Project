import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMapping {
	private Mapping map;
	
	@BeforeAll
	public void init(String name) {
		map = new Mapping(name);
	}
	
	@Test
	public void testContains() {
		assertEquals(true, map.containsValue("Сидоров С.С."));
		assertFalse(map.containsValue("Воробьёв В.В."));
	}
}
