package ejercicio2_l1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Massana
 */
public class Ejercicio2_L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner key = new Scanner(System.in);
        System.out.println("¡BIENVENIDO!");
        do {
            menu();
            System.out.print("\nINGRESE OPCION: ");
            opcion = key.nextInt();
            switch (opcion) {
                case 1:
                    ahorcado();
                    break;
                case 2:
                    System.out.println("Hasta pronto :(");
                    break;
                default:
                    System.out.println("Opcion invalida...\n");
                    break;
            }
        } while (opcion != 2);
    }
    
    public static void ahorcado(){
        Scanner key = new Scanner(System.in);
        String[] array = new String[3];
        array[0] = "celular";
        array[1] = "elemento";
        array[2] = "progra";
        Random generador = new Random();
        String palabra = array[generador.nextInt(3)];
        System.out.println(palabra);
        char[] array2 = new char[palabra.length()];

        System.out.println("\nUsted tiene un maximo de 10 intentos... Aprovechelo.\n\t ¡Que comienze el juego!\n");
        
        for (int intentos = 0; intentos < 10; intentos++) {
            System.out.println("\nIntento: " + intentos);
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print("[ " + array2[i] + "]");
            }
            System.out.println("\nIngrese una letra: ");
            char letra = key.next().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if (letra == palabra.charAt(i)) {
                    array2[i] = letra;
                }
                
            }
            String victoria = new String(array2);
            if (victoria.equals(palabra) && intentos < 10) {
                for (int i = 0; i < palabra.length(); i++) {
                    System.out.print("[ " + array2[i] + "]");
                }
                System.out.println("\nGANO");
                break;
            }
            else if(intentos == 9){
                System.out.println("PERDIO :(");
            }
        }
    }

    public static void menu(){
        System.out.println("\n*******AHORCADO*******");
        System.out.println("1. JUGAR.");
        System.out.println("2. SALIR.");
        System.out.println("*******AHORCADO*******");
    }
    
}
