import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hesap mak.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Please enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(("Please select sign to use. +,-,*,/,%,for square(^)"));
        String input = sc.next();
        char cha = input.charAt(0);
        char[] sign = {'+','-','*','/','%','^'};
        if (cha == sign[0]) {
            c = Math.abs(a) + Math.abs(b);
            System.out.printf("Sum of 2 numbers : %d",c);
        }
        else if (cha == sign[1]) {
            c = Math.abs(a) - Math.abs(b);
            System.out.printf("Subtraction of 2 numbers : %d",c);
        }
        else if (cha == sign[2]) {
            c = Math.abs(a) * Math.abs(b);
            System.out.printf("Multiplication of 2 numbers : %d",c);
        }
        else if (cha == sign[3]) {
            c = Math.abs(a) / Math.abs(b);
            System.out.printf("Division of 2 numbers : %d",c);
        } else if (cha == sign[4]) {
            c = Math.abs(a) % Math.abs(b);
            System.out.printf("Modulus of 2 numbers : %d",c);
        }
        else if (cha == sign[5]) {
            double e,p;
            e = (double) a;
            p = (double) b;
            double d = Math.pow(e,p);
            System.out.printf("Power of 2 numbers : %.2f",d);
        }
        }
    }