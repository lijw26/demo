import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  //从键盘接收数据
        System.out.println("我问：");

        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("肥宅说: "+str2);

        }
        scan.close();


    }
}
