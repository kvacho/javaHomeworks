import java.util.Scanner;

public class Main {

    public static boolean prime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int usj(int a, int b) {
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        // N1 - 3
//        int sum = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("The sum of numbers divisible by 5 in the range of [10; 100] is " + sum);
//
//        if (sum < 10) {
//            System.out.println("ერთნიშნა");
//        } else if (sum < 100) {
//            System.out.println("ორნიშნა");
//        } else if (sum < 1000) {
//            System.out.println("სამნიშნა");
//        } else if (sum < 10000) {
//            System.out.println("ოთხნიშნა");
//        } else {
//            System.out.println("ამხელა ვერ იქნება, ელსის ხათრით ვწერ");
//        }
//
//        // I don't know if I was allowed, but I looked into java documentation and found that creating functions is similar to c++
//        if (prime(sum)) {
//            System.out.println("მარტივია");
//        }
//        else {
//            System.out.println("შედგენლილია");
//        }

        // N4
//        Scanner input = new Scanner(System.in);
//        int a;
//        int b;
//        a = input.nextInt();
//        b = input.nextInt();
//        System.out.println(usj(a, b));

        // N5
//        for (int number = 100; number <= 999; number++) {
//            int sum = 0;
//            int temp = number;
//            while (temp != 0) {
//                sum += temp % 10;
//                temp /= 10;
//            }
//            if (sum != 0 && number % sum == 0) {
//                System.out.println(number + " იყოფა თავის ციფრთა ჯამზე: " + sum);
//            }
//        }

        // N6
//        int num = 2;
//        int b = 1;
//        int temp = 0;
//        System.out.println("0\n" + "1");
//        for (int i = 0; i < 8; i++) {
//            temp = num + b;
//            b = num;
//            num = temp;
//            System.out.println(b);
//        }
    }
}
