import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileio {
    public static void main(String[] args) throws FileNotFoundException
    {
        int[] arr =new int[10];
        int i=0;
        Scanner sr=new Scanner(new File("h:\\NumberList.txt"));
        while (sr.hasNextInt()){
            arr[i]=sr.nextInt();
            i++;
        }
        sr.close();
        System.out.printf("读取了%d个数\n",i);
        for (int j=0;j<i;j++){
            System.out.println(arr[j]);
    }
    }
}
