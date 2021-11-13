public class ADAM {
	static int number1 = 103;

	public static void main(String[] args) 
	{
		ADAM obj = new ADAM();
		
		int number2 = obj.reverse(number1);
		
		int sqr_number_1 = number1 * number1;
		System.out.println("Square value of " + number1 + ": " + sqr_number_1);
		
		int sqr_number_2 = number2 * number2;
		System.out.println("Square value of " + number2 + ": " + sqr_number_2);
		
		int rev_sqr_number_1 = obj.reverse(sqr_number_1);
		obj.compare(sqr_number_2, rev_sqr_number_1);

	}

	public int reverse(int no) 
	{
		int rev_no = 0;
		for (int number = no; number > 0; number = number / 10) {
			int reminder = number % 10;
			rev_no = (rev_no * 10) + reminder;
		}
		System.out.println("Reverse value of " + no + ": " + rev_no);
		return rev_no;
	}

	public void compare(int a, int b) 
	{
		if (a == b) 
		{
			System.out.println(number1 + " is adam number");
		} else 
		{
			System.out.println(number1 + " is not adam number");
		}
	}
}

//Output
Reverse value of 103: 301
Square value of 103: 10609
Square value of 301: 90601
Reverse value of 10609: 90601
103 is adam number
//