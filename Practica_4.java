/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_4;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad en pesos: ");
        int pesos = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        double precioDolar;
        precioDolar = 17.31;
        double precioEuro;
        precioEuro = 18.26;
        
        double cantDolares = pesos/precioDolar;
        double cantEuro = pesos/precioEuro;
        
        System.out.println("La cantidad en dolares es: " + cantDolares);
        System.out.println("La cantidad en euros es: " + cantEuro);   
    }
    
}
