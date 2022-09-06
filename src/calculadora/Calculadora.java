package calculadora;

/**
 *
 * @author thaap
 */
public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Teste de soma");
        
        CalculadoraTestes teste = new CalculadoraTestes();
        teste.TesteSoma();
        
        System.out.println("Teste de subtracao");
        teste.TesteSubtracao();
        
          System.out.println("Teste de multiplicaçao");
        teste.TesteMultiplicaçao();
        
        System.out.println("Teste de Divisão");
        teste.TesteDivisao();
    }

}
