package contador;
import java.util.Scanner;

import Exception.ParametroInvalido;

public class Contador {
    public Contador(Scanner scanner){
        
        System.out.println("digite Primeiro Numero:");
        int primeiroNumero=scanner.nextInt();
        System.out.println("digite segundo Numero:");
        int segundoNumero=scanner.nextInt();
        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametroInvalido e) {
            
            e.printStackTrace();
        }

    }
   private static void contar(int primeiroNumero, int segundoNumero) throws ParametroInvalido{

    int diferencaEntreParametros= segundoNumero-primeiroNumero;
    if(diferencaEntreParametros<=0) throw new ParametroInvalido("primeiro numero deve ser menor que o segundo");
    System.out.println("a contagem sera ate o numero "+ diferencaEntreParametros);
    for (int index = 0; index <= diferencaEntreParametros; index++) {
        System.out.println("numero :" +index);
    }
   }
   
}
