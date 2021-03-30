package ArrayTest;

import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

import java.util.Arrays;

/**
 * 计算年利率的二维数组
 * 6个利率梯度、10年余额
 */
public class Array022 {
    public static void main(String[] args){
        //设置基底利率的常量、利率梯度、年梯度
        final double STARTRATE = 10;
        final int NRATES =6;
        final int NYEARS =10;

        //将利率设置为10%-15%
        double[] interestRates = new double[NRATES];
        for (int j = 0; j < interestRates.length; j++){
            interestRates[j] = (STARTRATE + j)/100;
        }
        //System.out.println(Arrays.toString(interestRates));

        //设置数组的行列范围
        double[][] balances = new double[NYEARS][NRATES];

        //将首行全部设为本金10000
        for (int j = 0; j < balances[0].length; j++){
            balances[0][j] = 10000;
        }

        //计算10年各利率利息
        //设置循环实现逐行填充,从第二行开始
        for (int i = 1; i < balances.length; i++){
            for (int j = 0; j < balances[i].length; j++){
                //读取上一年该利率的余额
                double oldBalance = balances[i-1][j];

                 //利息= 前余额*interestRate[j]
                //double interest = oldBalance * interestRates[j];

                //balances[i][j] = oldBalance + interest ;

                //余额=前余额*（interestRates[j]+1）
                balances[i][j] = (interestRates[j] +1) *  oldBalance;
                }
            }
        //列出各利率
        for (int j = 0; j < interestRates.length; j++){
            System.out.printf("%9.0f%%", 100 * interestRates[j]);
        }
        System.out.println();

        //列出具体余额：逐行输出,确定精度
        for (double[] row : balances){
            for (double b : row){
                System.out.printf("%10.2f", b);
            }

            System.out.println();
        }

        System.out.println(balances[3][3]);
        //输出所有数组
        //System.out.println(Arrays.deepToString(balances)); //方式不对，无法使用
        }
    }

