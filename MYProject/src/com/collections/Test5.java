package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();

		m.put("AR", "Aurnachal Pradesh");
		m.put("AR", "Itanagar");

		m.put("AS", "Assam ");
		m.put("AS", "Dispur ");

		m.put("BR", "Bihar");
		m.put("BR", "Patna");

		m.put("GA", "Goa");
		m.put("GA", "Panaji");

		m.put("GJ", "Gujarat");
		m.put("GJ", "Gandhi Nagar");

		m.put("TG", "Telangana");
		m.put("TG", "Hyderabad");

		m.put("TN", "Tamil Nadu");
		m.put("TN", "Chennai");

		m.put("KL", "Kerala");
		m.put("KL", "Thiruvanathapuram");

		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.containsKey("TG"));
		System.out.println(m.containsValue("Andhara"));

		System.out.println("*****************************************");
		Set<Map.Entry<String, String>> entry = m.entrySet();

		for (Map.Entry<String, String> en : entry) {
			System.out.println(en.getKey() + " -> " + en.getValue());

		}
	}

}
