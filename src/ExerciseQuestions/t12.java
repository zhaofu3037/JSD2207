package ExerciseQuestions;
import java.util.Scanner;
public class t12 {
    public static void main(String[] args) {

        System.out.println("请输入你要判断的数字：");
        double input = new Scanner(System.in).nextDouble();
        //2.调用求绝对值的方法并拿到方法执行后的结果（返回值）
        double result = getAbsNum(input);
        //3.打印求出的结果
        System.out.println(input+"的绝对值是："+result);
    }

    private static double getAbsNum(double input) {
        if(input >=0){//如果是非负数
            return input;//返回本身的值
        }else{//如果是负数
            return -input;//则值取反
        }
    }


}
