public class MyProgram {



    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        double num3 = 3.1;
        double num4 = 5.6;
        //calling a not returning method
        sumNumbers(num1,num2);
        //calling a returning method
        int total = sumNumbersReturn(num1, num2);

        //Overloading: requires the parameters to be used in the correct order
        //Using two integers
        sumNumbers(num1, num2);
        //Using two doubles
        sumNumbers(num3, num4);
        //Using an integer and a double
        sumNumbers(num1, num3);
        // why would sumNumbers(num3, num1) fail?

        //Using two doubles and two integers
        sumNumbers(num3, num4, num1, num2);
        //Are the above numbers out of sequence?


    }

    //Example where data is not returned
    public static void sumNumbers(int a, int b){
        int sum = a + b;
        System.out.println("Sum of " + a + "," + b + " is " + sum);
    }

    //Example where returning a value back to the main method
    public static int sumNumbersReturn(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Overloading using the same method title as the first method used in these examples
    public static void sumNumbers(double a, double b){
        double sum = a + b;
        System.out.println("Sum of " + a + "," + b + " is " + sum);
    }

    public static void sumNumbers(int a, double b){
        double sum = a + b;
        System.out.println("Sum of " + a + "," + b + " is " + sum);
    }

    public static void sumNumbers(double a, double b, int c, int d){
        double sum = a + b + c + d;
        System.out.println("Sum of " + a + "," + b + " is " + sum);
    }
}
