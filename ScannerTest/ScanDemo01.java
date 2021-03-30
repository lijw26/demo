import java.util.Scanner;

public class ScanDemo01 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数：");

        if (scan.hasNextInt()){
            i = scan.nextInt();
            System.out.println("整数数据："+i);
        } else {
            System.out.println("输入数据非整数！！！");
        }

        System.out.println("输入小数：");
        if (scan.hasNextFloat()){
            f = scan.nextFloat();
            float sum = i + f;
            System.out.println("小数数据："+sum);
        }else{
            System.out.println("输入的不是小数!!!");
        }
        scan.close();
    }
}
