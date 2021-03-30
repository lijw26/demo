public class Array01 {
    public static void main(String[] args){
        double [] myList = { 1,2,3,4};

        //逐个输出合理调用“.length”,适用for each循环语句
        for (int i =0 ; i <myList.length; i++){
            System.out.println(myList[i]);
        }

        //计算所有总和
        double total = 0;
        for (int i = 0 ; i<myList.length ; i++){
            total += myList[i];
        }
        System.out.println("Total is : "+total);

        // 查找最大元素
        /*核心：逐个与前部分最大的比较，一直到最后一个
        myList[i] > 前部分最大，输出myList[i]
         */
        double max = myList[0];
        for (int i = 1 ; i < myList.length ; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("The max number is : "+max);
    }
}
