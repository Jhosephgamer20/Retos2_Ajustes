import java.util.*;
public class reto2 {
    public static void main(String[] args) {
        int n = 0;
       

        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el numero de competidores");
        n = lectura.nextInt();
        

        int[] tiempo = new int [n];/*Esta acción nos permite reservar un espacio en memoria llamado vector. */
        String[] nombre = new String[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite el nombre del competidor "+i);
            nombre[i] = lectura.next();

            System.out.println("Digite el tiempo de " +nombre[i]);
            tiempo[i] = lectura.nextInt();
        }
        for(int i = 0; i < tiempo.length; i++){
            System.out.println("Los tiempos de los competidores son "+tiempo[i]+ "s de "+nombre[i]);
        }
        lectura.close();
    }
}