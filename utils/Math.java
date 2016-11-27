package utils;

public class Math {
    public static long factorial(int number){
        if(number == 0){
            return 1;
        }
        return number*Math.factorial(number - 1);
    }
    public static long factorialLoop(int number) {
        long sum = 1;
        while (number > 0) {
            sum *= number;
            --number;
        }
        return sum;
    }
}
