package person.test_001.main;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		int count = 100;
		for (int i = 0; i < 10; i++, count = i % 2 == 0 ? count * 10 : count + 0) {
			System.out.println("\nCount: " + count);
			testLinkedHashMap(count);
			testHashMap(count);
			testLinkedHashMap(count);
			testHashMap(count);
		}
	}

	public static void testHashMap(int count) {
		HashMap<String, String> map = new HashMap<String, String>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			map.put("a" + i, "v" + (i + 1));
		}
		long spend = System.currentTimeMillis() - start;
		System.out.println("HashMap Spend: " + spend);
	}

	public static void testLinkedHashMap(int count) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			map.put("a" + i, "v" + (i + 1));
		}
		long spend = System.currentTimeMillis() - start;
		System.out.println("LinkedHashMap Spend: " + spend);
	}
}
