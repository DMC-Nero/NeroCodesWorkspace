package org.java.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C023_HashMapUserDefined {

	public static void main(String[] args) {
		Map<Integer , C022_Student> map = new HashMap<>();
		map.put(1, new C022_Student("Nero","DMC"));
		map.put(2, new C022_Student("Hero","DMG"));
		map.put(3, new C022_Student("Zero","AMG"));
		
		System.out.println(map);
	}

}
