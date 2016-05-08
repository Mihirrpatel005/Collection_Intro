package collection_prac;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakMap_test {

	public static void main(String[] args) {

		Map<Order, Integer> hs1 = new WeakHashMap<>();

		hs1.put(new Order(1, "mihir"), 1);
		hs1.put(new Order(1, "mihir"), 2);

		Order o4 = new Order(1, "kkk");
		hs1.put(o4, 300);
		System.out.print(hs1.size());

		System.gc();
		Runtime.getRuntime().gc();
		System.out.print(" " + hs1.size());

		WeakHashMap<Integer, Integer> wmap = new WeakHashMap<>();

		wmap.put(1, 2);

	}

}

class Order {

	int id;
	String name;

	public Order(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;

	}

}