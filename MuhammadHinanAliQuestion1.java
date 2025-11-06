public class MuhammadHinanAliQuestion1
{
    public static void main(String[] args)
    {
        average(24, 56, 22, 28);
        average(2, 5, 2 ,8.0);
        average(12.5, 9.254, 18.65, 28.0);
    }//method

	/**
		The average method displays the sum of all numbers passed
	*/

    public static void average(double number1, double number2, double number3, double number4)
    {

     System.out.println("The Average of "+number1+" , "+number2+" , "+number3+" , "+number4+" is : "+ ((number1+number2+number3+number4) / 4));


    }// method
}// class