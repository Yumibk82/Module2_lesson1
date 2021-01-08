import java.util.Scanner;
public class MoneyChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input money in dollar");
        double money=input.nextDouble();
        double rate=23000;
        double vn=23000*money;
        System.out.println(vn);
    }
}
