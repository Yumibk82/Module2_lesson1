import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input month want to check");
        int month= input.nextInt();

        if((month<=0)||(month>=13)){
            System.out.println("please input number between 1 to 12");
        }else if((month>=1)&&(month<=12)){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("The "+month+"has 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("The "+month+"has 30 days");
                    break;
                case 2:
                    System.out.println("The "+month+"has 28 or 29 days");
            }
        }


    }
}
