package com.company;


public class Main {

    public static void main(String[] args) {
//        triangularSequence(4);
//        from1ToN(4);
//        fromAToB(2, 4);
//        System.out.println(sumOfNumbers(1234));
        checkIsItANaturalNumber(10, 2);
    }

    //1
    static void triangularSequence(int n) {
        StringBuilder sum = new StringBuilder();

        if (n == 1) System.out.print(1 + " ");
        else {
            for (int i = 0; i < n; i++) {
                sum.append(n).append(" ");
            }
            triangularSequence(n - 1);
            System.out.print(sum);
        }
    }

    //2
    static void from1ToN(int n) {
        if (n >= 1) {
            from1ToN(n - 1);
            System.out.print(n + " ");
        }
    }

    //3
    static void fromAToB(int a, int b) {
        if (a > b) {
            fromAToB(a, b + 1);
            System.out.print(b + " ");
        } else if (a < b) {
            fromAToB(a, b - 1);
            System.out.print(b + " ");
        } else System.out.print(b + " ");
    }

    //5
    static int sumOfNumbers(int n) {
        int sum = n % 10;
        if (n / 10 > 0) {
            sum += sumOfNumbers(n / 10);
            return sum;
        } else return n;
    }

    //6
    private static void checkIsItANaturalNumber(int n,int var) {
        if (n % var != 0) {
            var++;
            checkIsItANaturalNumber(n, var);
        } else if (n % var == 0) {
            if (n==var) System.out.print("simple number");
            else System.out.print("not simple number");
        }
    }

}
