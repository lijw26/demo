public class Logic {
    public static void main(String[] args){
        int a=5;
        boolean b =(a>4)&&(a++<6);
        //boolean b =(a<4)&&(a++<6);
        // 里面b的输出结果为false，因a<4为false，因此不执行a++，故a输出为5
        System.out.println("使用短路逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);
    }
}
