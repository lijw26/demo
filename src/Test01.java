public class Test01 {
    public static void main(String[] args){
        int a= 10;
        int b =20;
        int c =0;
        c=a+b;
        System.out.println("c=a+b="+a); //a=10 b=20 c=30
        c+=a ;      //
        //c+=a 对比c=a+c的好处自在于+=不会改变c的数据类型
        System.out.println("C+A="+c); //a=10 b=20 c=40
        c-=a ;
        System.out.println("C-A="+c); //a=10 b=20 c=30
        c*=a;
        System.out.println("c*a="+c); //c=300
        c/=a;
        System.out.println("C/A="+c); //c=30

        a=10;
        c=15;
        c%=a;
        System.out.println("c%a="+c); //c=5=ob101
        c<<=2;
        System.out.println("c<<a="+c); //c=0b10100=16+4=20
        c>>=2;
        System.out.println("c>>a="+c); //c=0b101=5
        c>>=2;
        System.out.println("c>>a="+c); //c=ob1=1
        c&=a;
        System.out.println("c&a="+c); // a=ob1010,c=0=ob0000
        c^=a;
        System.out.println("c^a="+c); // c=ob1010=10
        c|=a;
        System.out.println("c|a="+c); //c=ob1010
        System.out.println(+a);
        System.out.println(+c);
    }
}
