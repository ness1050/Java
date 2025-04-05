package Java;

import java.util.Scanner;

public class Basic {
    
    public static void main(String [] args) {
        Basic b = new Basic();
        //System.out.println(b.task1());
        //b.task2();
        int a = 96;
        int c = -2;
        //b.arthimetic(a, c);
        //b.swap(a, c);
        //b.temp();
        //b.bitwise(a, c);

        if (a % 2 == 0) {
            System.out.println("number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }


    public void bitwise(int a, int b) {
        /*if (a < b || a > 0) {
            System.out.println("One of condition is met");
        }*/

        if (a > 0 && b > 0) {
            System.out.println("The value is zero");
        } else {
            System.out.println("Only one condition is true but requires both to be true or false");
        }
    }
    public void temp() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in Celsiuse to convert to farenheiet: ");
        int input = scan.nextInt();
        if (input > 0) {
            int f = (input * 9 / 5) + 32;
            System.out.println("The given temperature in farenheit is : " + f);
        }
    }
    
    public void swap(int a , int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After");
        a = a - b;
        b = a + b;
        a = b -  a;
        System.out.println(a);
        System.out.println(b);
        
        
    }

    public void arthimetic(int a , int b) {

        int sum = a + b;
       
        float multiplication = a * b;
        float division = (float)a / b;
        int sub = a - b;
        int module = a % b;

        System.out.println("Addition of a and b: " + sum);
        System.out.println("Subtraction of a and b: " + sub);
        System.out.println("Multiplication of a and b: " + multiplication);
        System.out.println("Divsion of a and b: " + division);
        System.out.println("Module of a and b: " + module);

    }


    public void task2() {
        int a = 2;
        float b = 3.0f;
        short c = -11232;
        long d = 1232131221;
        System.out.println("A " + a + "\n" + b + "\n" + c + "\n"+ d + "\n");

    }
    public String task1() {
        return ("Hello world");
    }

}
