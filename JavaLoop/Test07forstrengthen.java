public class Test07forstrengthen {
    public static void main(String[] args){
        int[] number ={10,20,30,40,50};

        for (int x : number){
            if (x==30){
                //break;
                continue;
            }
            System.out.println(x+", ");

        }


        String[] names={"A","B","C","D"};
        for ( String name:names){
            System.out.print(name+"+ ");
        }
    }
}
