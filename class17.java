public class class17{
    public static void main(String[] args){
        int x=1;
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            if (i>=1 && i<=5 && j>=1 && j<=5){
                System.out.print(" 0 ");
                x=x-1;
            } else {
                System.out.print(" . ");
            }
        }
         System.out.println();
    }

}
}