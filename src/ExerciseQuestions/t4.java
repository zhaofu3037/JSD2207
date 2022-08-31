package ExerciseQuestions;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入父亲的身高");
        int father= a.nextInt();
        System.out.println("请输入母亲的身高");
        int mather=a.nextInt();
        int baby=(father+mather+13)/2;
        System.out.println(baby);


    }
}
