import  java.util.Scanner;

public class ScannerFish {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("恶雕在路上见到了哭哭的李嘉文\n问他：");

        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            String str3 = str2.substring(1,3);  // 3-1=2，“你委屈吗”输出“委屈”
            System.out.println("李嘉文忍不住说："+str3);
        }
        System.out.println("恶雕问：");
        if (scan.hasNextLine()){
            String str4 = scan.nextLine();
            String str5 = str4.substring(0,1);
            System.out.println("李嘉文哭着说："+str5+"!");
        }
        scan.close();

    }

}
