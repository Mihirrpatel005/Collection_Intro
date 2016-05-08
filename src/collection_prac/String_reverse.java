package collection_prac;

public class String_reverse {

	public static void main(String ar[]) {

		String[] test = { "a", "b", "c", "d" };

		String s="mihir";
		
		int lenght = test.length;
		System.out.println(lenght);
		int rev = lenght;

		for (int i = 0; i < lenght / 2; i++) {

			String c = test[i];
			test[i] = test[rev - 1];
			test[rev - 1] = c;
			rev--;
		}
		for (int j = 0; j < lenght; j++) {

			System.out.println(test[j]);
		}

	}
}
