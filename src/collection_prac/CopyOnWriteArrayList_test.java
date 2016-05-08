package collection_prac;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_test {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> clist = new CopyOnWriteArrayList<>();
		clist.add(1);
		clist.add(1);
		clist.add(1);
		clist.add(1);
		System.out.println(clist);

		Iterator<Integer> it = clist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			clist.add(2);
			//System.out.println(clist);
		}
		System.out.println(clist);

	}

}
