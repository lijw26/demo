package ArrayTest;

/**
 *计算不规则数组
 */

public class Array023LotteryArray {
    public static void main(String[] args){
        final int NMAX = 10;

        //形成三角数组
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++){
            //第n行有n+1个数的数组，第一行，n = 0, 有1个数字
            odds[n] = new int[n + 1];
        }

        //填充数组
        for (int n = 0; n < odds.length; n++){
            for (int k = 0; k < odds[n].length; k++){   //这句出问题了，发现是line17误写为 n < NMAX
                //
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++){
                    lotteryOdds = lotteryOdds *(n - i + 1) / i;
                }

                odds[n][k] = lotteryOdds;
            }
        }

        //输出数组
        for (int[] row : odds){
            for (int odd : row){
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }

    }
}
