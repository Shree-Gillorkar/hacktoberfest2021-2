/* Java program to find if x is a
 perfect square.*/
class PerfectSquare {

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {

			int sr = (int)Math.sqrt(x);
			
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
		int x = 2502;

		if (isPerfectSquare(x))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}

