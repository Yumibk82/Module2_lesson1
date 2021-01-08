import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input a factor ");
        int a=input.nextInt();
        System.out.println("Please input b factor ");
        int b=input.nextInt();


        if((a==0)&&(b==0)){
            System.out.println("Multiple root of linear equation");
        }else if((a==0)&&(b!=0)){
            System.out.println("The Equation has not root");
        }else {
            System.out.println("The root is " +(-b/a));
        }

    }
}
