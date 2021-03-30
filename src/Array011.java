import java.util.Arrays;

public class Array011 {
    public  static void main(String[] args){
        double [] myList ={ 1,2,3,4};
        /* 记得 type element = array ,type后面是有[]的；

        type[] 变量 = new type[array];
        #这句有两个内容：1、新生成一个array；2、将这个array赋值给变量

        for (type element : array){
            System.out.println(element);
        }
         */

        //循环myList中的每一个元素， for each循环语句
        for (double element: myList){
            System.out.println(element);
        }
        /*
        for (type 变量 ：array){
            System.out.println(变量);
        }
         */

        //更简单的输出array中的所有元素，调用Arrays.toString(变量)
        System.out.println(Arrays.toString(myList));
    }
}
