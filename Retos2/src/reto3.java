import java.util.Scanner;

public class reto3{

    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);
      
        double [][] valor = new double[4][4]; 
        /*int filas, columnas;*/
        String [][] nombre = new String[4][4];
/* utilizamos un bucle for dentro de otro bucle for, el
primer bucle recorrerá las filas de la matriz y el segundo bucle, recorrerá las
columnas de la misma,*/  

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
              System.out.println("Digite el producto: ["+i+j+"]");
              nombre[i][j]=lectura.next();
              System.out.println("Digite el precio del producto ["+i+j+"]");
              valor[i][j]=lectura.nextDouble();
            }
          }
          for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
              System.out.print("El id es"+i+nombre[i][j]+"\t");
              System.out.print(valor[i][j]+"\t");
            }
          }
        lectura.close();

        


    }

    
}
