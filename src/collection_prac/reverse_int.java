package collection_prac;

public class reverse_int {

	public static void main(String ar[]) {

		int n = 3214;

		int reverse = reverse(n);
		System.out.println(reverse);

	}

	static int reverse(int n) {

		int mod,result=0;
		while (n != 0) {
			 mod= n % 10;
			n = n / 10;
			result=(result*10)+mod;
		}
		return result;

	}

}
