package MayenRuano;

public class Ejercicio4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 21; i++){
          for(int j = 1; j <= 21; j++){
            if(j>=8 && j<=14){
                System.out.print(" - ");
            }
            else{
                System.out.print(" . ");
            }
          }
          System.out.println();
        }
    }   
}