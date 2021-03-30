public class Welcome {
    public static void main(String[] args){
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0;i < greeting.length(); i++)//控制下行符号长度,i=0跟greeting等长
            System.out.print("-");
        System.out.println();
    }
}
