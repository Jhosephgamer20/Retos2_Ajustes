import java.util.Scanner;

public class reto4 {

  public static void main(String[] args){        
    int filas,columnas;

    Scanner lectura = new Scanner(System.in);
    System.out.println("digite la cantidad de filas de su matriz");
    filas=lectura.nextInt();
    System.out.println("digite la cantidad de columnas de su matriz");
    columnas=lectura.nextInt();

    String[][] matrizE = new String[filas][columnas];
    
    for(int i=0; i<filas; i++){
      for(int j=0; j<columnas; j++){
        System.out.println("Digite el emoji de la poisición ["+i+j+"]");
        matrizE[i][j]=lectura.next();
      }
    }
    for(int i=0; i<filas; i++){
      for(int j=0; j<columnas; j++){
        System.out.println(matrizE[i][j]+"\t");
      }
    }
  }
}  
