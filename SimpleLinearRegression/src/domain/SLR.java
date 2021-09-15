package domain;
import java.util.Scanner;

public class SLR extends Implementing{
    public static void main(String[] args){
        
        int datos = 0;
        double individual = 0;
        Scanner sc = new Scanner(System.in);
        
        Implementing valor = new Implementing();
        
        System.out.println("Ingrese el num de datos para X y Y: \n");
        datos = sc.nextInt();
        valor.inputData(datos);        
        
        valor.beta1();
        valor.beta0();
        
        System.out.println("\nIngrese el valor individual(X): ");
        individual = sc.nextDouble();
        valor.regression(individual);
        
    }
}
