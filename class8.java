public class class8{
    public static void main(String[] args){
        int x=22;
    for (int i=1; i<=21;i= i+1){
        for (int j=1;j<=21;j=j+1){
            if (j==i || j==x-i){
                System.out.print(" 0 ");
                
            } else {
                    System.out.print(" . ");
                }
        }
         System.out.println();
    }

}
}