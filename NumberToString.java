import java.util.Scanner;
public class NumberToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a number");
        int num = input.nextInt();

        String[] arr1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arr3 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if ((num < 0) || (num >= 1000)) {
            System.out.println("please input a num is between 1 to 999");
        }
        if (num < 10) {
            System.out.println(arr1[num]);
        } else if (num < 20) {
            System.out.println(arr2[num % 10]);
        } else if (num < 100) {
            if (num % 10 == 0) {
                System.out.println(arr3[num / 10 - 2]);
            } else {
                System.out.println(arr3[num / 10 - 2] + " " + arr1[num % 10]);
            }
        } else if (num < 1000) {
            if (num % 100 == 0) {
                System.out.println(arr1[num / 100] + " " + "hundred");
            } else if (num < 110) {
                System.out.println("one hundred " + arr1[num % 100]);
            } else if (num < 120) {
                System.out.println("one hundred " + arr2[(num % 100) % 10]);
            } else if (num % 100 < 10)
                System.out.println(arr1[num / 100] + " " + "hundred" + " " + arr1[num % 100]);
            else if ((num % 100) % 10 == 0) {
                System.out.println(arr1[num / 100] + " " + "hundred" + " " + arr3[(num % 100) / 10 - 2]);
            } else
                System.out.println(arr1[num / 100] + " " + "hundred" + " " + arr3[(num % 100) / 10 - 2] + " " + arr1[(num % 100) % 10]);
        }
    }
}

