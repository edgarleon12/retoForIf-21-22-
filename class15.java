public class class15{
    public static void main(String[] args){
        int x=0;
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            if ( j>=2 && j<=20 && i>=2 && i<=20){
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