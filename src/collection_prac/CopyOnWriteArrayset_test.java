package collection_prac;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayset_test {

	public static void main(String[] args) {

		CopyOnWriteArraySet<Integer> copyset = new CopyOnWriteArraySet<>();

		CopyOnWriteArraySet<Integer> copyset1 = new CopyOnWriteArraySet<>();
		System.out.println(copyset1.add(1));
		System.out.println(copyset1.add(1));
		System.out.println(copyset1.add(1));
		System.out.println(copyset1.add(1));

		System.out.println(copyset1);
		Iterator<Integer> it = copyset1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			copyset1.add(2);
			System.out.println("inside>>>>>>>>>>>>>"+copyset1);
		}
		System.out.println(copyset1);

		Publisher cricNext = new Publisher();

		SubScriber raj = new SubScriber("RAJ");
		SubScriber adom = new SubScriber("ADOM");

		cricNext.addSubscriber(raj);
		cricNext.addSubscriber(adom);

		cricNext.notifySubs("FOUR");
		cricNext.notifySubs("SIX");

	}

}

class Publisher {

	private CopyOnWriteArraySet setOfSubs = new CopyOnWriteArraySet();

	public void addSubscriber(SubScriber sub) {
		setOfSubs.add(sub);
	}

	public void notifySubs(String score) {
		Iterator itr = setOfSubs.iterator();
		while (itr.hasNext()) {
			SubScriber sub = (SubScriber) itr.next();
			sub.receive(score);

			// itr.remove(); // not allowed, throws
			// UnsupportedOperationException
		}
	}
}

class SubScriber {

	private String _name;

	public SubScriber(String name) {
		this._name = name;
	}

	public void receive(String score) {
		//System.out.printf("[%s] Event received : %s %n", _name, score);
	}
}
