package ExerciseQuestions;

import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入数值1");
        int a1= a.nextInt();
        System.out.println("请输入数值2");
        int b1=a.nextInt();
        System.out.println("请输入数值3");
        int c1=a.nextInt();
        int d=a1>b1?a1:b1;
        int e=d>c1?d:c1;
        System.out.println(e);
    }
}
