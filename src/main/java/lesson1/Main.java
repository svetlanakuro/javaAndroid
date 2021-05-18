package lesson1;

public class Main {

    public static void main(String[] args) {
        byte b = 10;
        short s = -2;
        int i = b + s;
        System.out.println(i);
        long l = 1000000L;
        float f = 2.50f;
        double d = f / l;
        System.out.println(d);
        char c = '\u2021';
        boolean val = true;
        System.out.println(c);
        System.out.println(val);

        System.out.println(compute(2.50f,3.00f,4.50f,5.00f));
        System.out.println(check10and20(10,-4));
        checkPositiveNegative(-8);
        System.out.println(checkNegative(-8));
        greetings("Name Surname");
        System.out.println(checkLeapYear(2021));
    }

    private static float compute(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean check10and20(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private static void checkPositiveNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " is positive number");
        } else {
            System.out.println(x + " is negative number");
        }
    }

    private static boolean checkNegative(int x) {
        if (x <= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void greetings(String userName) {
        System.out.println("Привет, " + userName);
    }

    private static String checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? (year + " год - високосный") : (year + " год - не високосный");
    }
}
