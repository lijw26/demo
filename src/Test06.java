import java.util.Scanner;

/*创建一个输入型计数文件
只接受5~20内的数，范围外的提醒
 */

public class Test06 {
    public static void main(String[] args){
        System.out.println
                ("Please input a number." +
                        "If it's bigger than 5,it will count to 19:");
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){
            int x = in.nextInt();
            System.out.println("Your input:"+x);
            int a =x;
            if (a>5){
                if (a<21){
                    int sum =0;
                    int number=0;

                    while (a<19) {
                        number++;
                        a++;
                        sum = sum + a;
                        System.out.print(number);
                        System.out.print(" Counting : " + a);
                        System.out.println(",Sum : " + sum);
                    }
                }else{
                        System.out.println("Too large!");
                }
            }else{
                System.out.println("Number is less than 5.");
            }
        }
    }
}
