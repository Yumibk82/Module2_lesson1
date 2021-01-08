import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input year to check");
        int year=input.nextInt();
        boolean result=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    result=true;
                }
                }else result=true;
            }
        if(result){
            System.out.println(year+" is leap year");
        }else
            System.out.println(year+" is not leap year");

    }

}
