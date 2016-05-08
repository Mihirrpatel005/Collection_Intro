package collection_prac;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MIHIR005
 *
 */
public class Concurrenthashmap_test {

	static ConcurrentHashMap<Integer, AtomicInteger> Cmap = new ConcurrentHashMap<>();

	static void addtest() {
		for (int name : Cmap.keySet()) {
			for (int i = 0; i < 5; i++) {
				Cmap.get(name).getAndIncrement();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurrentHashMap<Integer, Integer> Cmap1 = new ConcurrentHashMap<>();

		for (int i = 0; i < 14; i++) {

			Cmap1.put(i, i);
			Cmap.put(i, new AtomicInteger());
		}

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(Concurrenthashmap_test::addtest);
		service.submit(Concurrenthashmap_test::addtest);

		service.awaitTermination(1, TimeUnit.SECONDS);
		service.shutdown();

		//System.out.println(Cmap);

		Iterator cit = Cmap.entrySet().iterator();
		Iterator cit1 = Cmap1.entrySet().iterator();
		System.out.println(Cmap1);
		while (cit1.hasNext()) {

			Cmap1.put(0, 14);
			Entry e = (Entry) cit1.next();
			Cmap1.put(0, 123);
			System.out.println("key1::" + e.getKey() + " :: value1:" + e.getValue());
		}
		System.out.println(Cmap1);

		while (cit.hasNext()) {

			// Cmap.put(0, 14);
			Entry e = (Entry) cit.next();
			Cmap.put(0, new AtomicInteger());
			// System.out.println("key::" + e.getKey() + " :: value:" +
			// e.getValue());
		}
	}
}
