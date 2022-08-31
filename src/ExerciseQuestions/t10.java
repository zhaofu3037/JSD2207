package ExerciseQuestions;

import java.util.Scanner;

public class t10 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入身高");
        double height= a.nextDouble();
        System.out.println("请输入体重");
        double weight=a.nextDouble();
        double BMI=weight/(height*height);
        if (BMI<18.5){
            System.out.println("过轻");
        }else if (BMI>=18.5 || BMI<23){
            System.out.println("正常");
        }else if (BMI>=23 || BMI<25 ){
            System.out.println("偏胖");
        } else if (BMI>30 || BMI<40 ){
            System.out.println("重度肥胖");
        } else if (BMI>40 ) {
            System.out.println("极度肥胖");
        }


    }
}
