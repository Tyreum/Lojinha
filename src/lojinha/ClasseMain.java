
package lojinha;

import java.util.Scanner;

/**
 *
 * @author ETECIA
 */
public class ClasseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Carrinho carro = new Carrinho();
    
    Scanner scan = new Scanner(System.in);
    
        System.out.println("=================================");
        System.out.println("Início do processo");
        System.out.print("Nome do carro: ");
        carro.nome = scan.next();
        System.out.print("Cor do carro: ");
        carro.cor = scan.next();
        System.out.print("Motor do carro: ");
        carro.motor = scan.next();
        System.out.print("Modelo do carro: ");
        carro.modelo = scan.next();
        System.out.print("Com turbo?: ");
        carro.turbo = scan.next();  
        System.out.println("Fim do processo");
        System.out.println("=================================");
        System.out.println("Nome do carro: " + carro.nome);
        System.out.println("Cor do carro: " + carro.cor);
        System.out.println("Motor do carro: " + carro.motor);
        System.out.println("Modelo do carro" + carro.modelo);
        System.out.println("Turbo: " + carro.turbo);
        System.out.println("==================================");
    }
    
}
