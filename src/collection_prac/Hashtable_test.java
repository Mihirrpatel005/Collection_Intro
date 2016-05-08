package collection_prac;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

class item {

	int id;
	String name;

	public item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof item)) {
			return false;
		}
		item it = (item) obj;
		return it.getId() == this.getId() && it.getName() == this.getName();

	}

	public int hashCode() {
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Hashtable_test {

	public static void main(String[] arg) {

		Hashtable<item, String> itemtable = new Hashtable<>();

		item i1 = new item(1, "item1");
		item i2 = new item(2, "item2");
		item i3 = new item(3, "item1");

		itemtable.put(i1, "awesome ");
		itemtable.put(i2, "yup good");
		// itemtable.put(i3, "okkkok");

		System.out.println(itemtable.containsKey(i3));

		System.out.println(itemtable);

		Set itemset = itemtable.entrySet();
		Iterator<item> iitem = itemset.iterator();
		while (iitem.hasNext()) {

			Map.Entry<item, String> itemmap = (Entry<item, String>) iitem.next();
			System.out.println(
					itemmap.getKey().getId() + " item name " + itemmap.getKey().getName() + ":::" + itemmap.getValue());
			//itemtable.put(i3, "yup good");

		}

		Hashtable<Integer, String> ht1 = new Hashtable<>();
		// ht1.put(null, "");
		ht1.put(1, "mihir");

		int i;
		for (i = 0; i < 14; i++) {
			ht1.put(i, "mihir" + i);
		}

		// System.out.println(set);

		Enumeration<Integer> keys = ht1.keys();
		int key;

		while (keys.hasMoreElements()) {
			key = keys.nextElement();
			System.out.println(key + " " + ht1.get(key));
			ht1.put(45, "mihir45");

		}
		// when i doing enumeration that time 45 key value doesn't print because
		// of the its store in new max level..

		// System.out.println(ht1);
		Set<?> set = ht1.entrySet();
		Iterator<?> it = set.iterator();
		while (it.hasNext()) {

			// it.remove();
			// Map.Entry ob = (Map.Entry) it.next();
			// ht1.put(16, "mihir");
			// System.out.println(ob.getKey() + " " + ob.getValue());
		}

		// System.out.println(it);

		HashSet<Object> hset = new HashSet<>();
		hset.add("mihir4");

		// System.out.println(ht1.isEmpty());// table is empty or what
		/*
		 * System.out.println(ht1.containsKey(11)); check the key exits or nor
		 * System.out.println(ht1.containsValue("mihir11"));
		 */ // check the value exits or not
		// System.out.println(ht1.values().remove("mihir0"));

		Hashtable<Integer, String> h2 = new Hashtable<>();
		h2.putAll(ht1);
		// System.out.println(ht1);

		// System.out.println(ht1.get(0).hashCode());
		// System.out.println(ht1.values().removeAll(hset));//remove what they
		// have in set
		// System.out.println(ht1);
		// System.out.println(ht1.values().retainAll(hset));//only that contain
		// without remove all
		// System.out.println(ht1);
		// System.out.println(h2.contains("mihir4"));

	}
}
