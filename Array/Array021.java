package ArrayTest;
import java.util.Arrays;

/**
 * 多维数组简单输入、输出
 * 测试多维数组的基本规则
 */
public class Array021 {
    public static void main(String[] args){
        //int[][] 变量 = new int[][];
        //一维与多维数组都需要new后才能使用；
        int [][] balances =
                {
                        {1, 2, 3, 4 },
                        {5, 6, 7, 8 },
                        {9, 10,11,12},
                        {13,14,15,16},
                };

        //指定元素输出，4行3列 = 15
        int a = balances[3][2];
        System.out.println(""+a);

        //快速输出多维数组的元素列表，区别于一维数组的Arrays.toString(变量)
        System.out.println("\n"+Arrays.deepToString(balances));
    }
}
