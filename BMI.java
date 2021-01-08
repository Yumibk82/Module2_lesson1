import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input weight ");
        float weight=input.nextFloat();
        System.out.println("please input height ");
        float height=input.nextFloat();
        float bmi=weight/(height*height);
        System.out.println(bmi);

        if(bmi<18.5){
            System.out.println("underweight");
        }else if((18.5<=bmi)&&(bmi<25)){
            System.out.println("normal");
        }else if((25.0<=bmi)&&(bmi<30.0)){
            System.out.println("overweight");
        }else if(bmi>=30.0)
            System.out.println("Obese");
    }
}
