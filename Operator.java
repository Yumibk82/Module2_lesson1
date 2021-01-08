import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please input width ");
        int width =input.nextInt();
        System.out.println("Please input height ");
        int height=input.nextInt();

        int area=width*height;
        System.out.println("area is "+area);
    }
}
