/*
  demonstrates array
  @author
   */
import java.util.*;

public class Array013LotteryDrawing {
    public  static void main(String[] args){
        //输入接口
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();  //输入数量设置为变量k

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();  //定义数组范围

        //创建一个由1到n的数组
        int[] numbers = new int[n];
        for (int i= 0 ; i < numbers.length ; i++){
            numbers[i] = i+1;  //得到第一个元素是number[0] = 1 ;
        }

        //创建k个数字作为数组2
        int[] result = new int[k];  //仅需最后生成result的k个数
        for (int i=0 ; i < result.length ; i++){
            int r = (int) (Math.random() * n); //生成n个随机数字，赋值给变量r

            //随机位置抽取数字
            result[i] = numbers[r];  //抽取n个随机数字中的前k个

            //将最后的数字填到随机位置
            numbers[r] = numbers[n-1];
            n--;
        }
        System.out.println("");

        //输出数组
        Arrays.sort(result);
        System.out.println("生成彩票的致富号码!!!");

        for (int r : result){
            System.out.println(r);  //逐个输出数组r
        }




    }



}
