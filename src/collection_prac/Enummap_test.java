package collection_prac;

import java.util.EnumMap;

public class Enummap_test {

	enum state {
		start, running, inprogress, finish, cancel;

	}

	public static void main(String[] args) {

		System.out.println(Enum_Status.DID_NOT_RUN);
		System.out.println(Enum_Status.getStatus(1));

		EnumMap<state, String> emap = new EnumMap<>(state.class);

		emap.put(state.start, "start order");
		emap.put(state.inprogress, "inprogress order");
		emap.put(state.finish, "finish order");
		emap.put(state.running, "running order");
		emap.put(state.cancel, "cancel order");

		System.out.println(emap);
	}
}
