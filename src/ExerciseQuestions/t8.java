package ExerciseQuestions;

import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入数值");
        int b= a.nextInt();
        if (b%2==0){
            System.out.println("是偶数");
        }else {
            System.out.println("是奇数");
        }
    }
}
