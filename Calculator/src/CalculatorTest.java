public class CalculatorTest {

public static void main(String args[])

	{

		int num1,num2,result=0;

		Calculator c=new Calculator();

		Scanner sc=new Scanner(System.in);

		while(true){

			System.out.println("Enter two Numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();			

			System.out.println("Enter the operator");
			char op = reader.next().charAt(0);

			switch(op)
			{
		   case '+':
			result=c.add(num1, num2);
			break;

		  case '-':
			result=c.subtract(num1, num2);
			break;

		  case '*':
			result=c.mul(num1, num2);
			break;		

		   case '/':
			result=c.div(num1, num2);
			break;
			
		  default:

			System.out.println("Invalid operator");		

		}

	System.out.println(num1+" "+op+" "+num2+" = "+result);			

	}

}

}
