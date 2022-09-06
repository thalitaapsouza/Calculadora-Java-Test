/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author thaap
 */
public class CalculadoraTestes {

    public void TesteSoma() {
        int soma = 0;

        CalculadoraOperacoes calc = new CalculadoraOperacoes();
        soma = calc.somar(2, 8);
        System.out.println(soma);

        //Cenario de teste 1: Soma de dois valores 
        soma = calc.somar(4, 0);
        System.out.println(soma);
//Cenario de testes 2: Soma de dois valores sendo um zero 

        soma = calc.somar(0, 0);
        System.out.println(soma);

//Cenario de teste 3: Soma de dois valores sendo que ambos sao zero
        soma = calc.somar(8, -2);
        System.out.println(soma);
//Cenario de teste 4: Soma de dois valores sendo um negativo
    }

    public void TesteSubtracao() {
        int sub = 0;

        CalculadoraOperacoes calc = new CalculadoraOperacoes();
        sub = calc.subtrair(10, 6);
        System.out.println(sub);
        //Cenario de teste 1: Subtraçao de dois valores
        
         sub = calc.subtrair( 8, 0);
        System.out.println(sub);
        //Cenario de testes 2: Subtraçao de dois valores sendo um zero 
        
            sub = calc.subtrair(0, 0);
        System.out.println(sub);
        //Cenario de teste 3: Subtraçao de dois valores sendo que ambos sao zero
  sub = calc.subtrair(8, -2);
        System.out.println(sub);
        //Cenario de teste 4: Subtraçao de dois valores sendo um negativo
        
    }
    public void TesteMultiplicaçao() {
        int mult = 0;

          CalculadoraOperacoes calc = new CalculadoraOperacoes();
        mult = calc.multiplicacao(45, 3);
        System.out.println(mult);
        //Cenario de teste 1: Multiplicacao de dois valores
        
           mult = calc.multiplicacao( 20, 0);
        System.out.println(mult);
                //Cenario de testes 2: Multiplicacao de dois valores sendo um zero 
           mult = calc.multiplicacao(0, 0);
        System.out.println(mult);
         //Cenario de teste 3: Multiplicaçao de dois valores sendo que ambos sao zero
         mult = calc.multiplicacao(2, -30);
        System.out.println(mult);
        //Cenario de teste 4: Multiplicacao de dois valores sendo um negativo
        
               
 }
    public void TesteDivisao() {
        double div = 0;
        
          CalculadoraOperacoes calc = new CalculadoraOperacoes();
        div = calc.divisao(9, 3);
        System.out.println(div);
        //Cenario de teste 1: divisao de dois valores
        
           div = calc.divisao ( 0, 9);
        System.out.println(div);
                //Cenario de testes 2: divisao de dois valores sendo um zero 
           div = calc.divisao(0, 0);
        System.out.println(div);
         //Cenario de teste 3: divisao de dois valores sendo que ambos sao zero
         div = calc.divisao(4, -2);
        System.out.println(div);
        //Cenario de teste 4: divisao de dois valores sendo um negativo
    }  
        
         


   }

