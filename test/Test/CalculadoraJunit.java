/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import calculadora.CalculadoraOperacoes;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author thaap
 */
public class CalculadoraJunit {

    @SuppressWarnings("deprecation")
    @Test
    public void TesteSoma() {
        int soma = 0;

        CalculadoraOperacoes calc = new CalculadoraOperacoes();
        //Cenario de teste do junit  1: Soma de dois valores reais
        soma = calc.somar(2, 8);
        System.out.println(soma);
        Assert.assertEquals(10, soma);

        //Cenario de teste do junit : Soma de dois valores sendo um deles zero 
        soma = calc.somar(4, 0);
        System.out.println(soma);
        Assert.assertEquals(4, soma);

//Cenario de teste do junit  3: Soma de dois valores sendo que ambos são zero
        soma = calc.somar(0, 0);
        System.out.println(soma);
        Assert.assertEquals(0, soma);

//Cenario de teste do junit  4: Soma de dois valores sendo um negativo
        soma = calc.somar(8, -2);
        System.out.println(soma);
        Assert.assertEquals(6, soma);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void TesteSubtracao() {
        int sub = 0;

        CalculadoraOperacoes calc = new CalculadoraOperacoes();

        //Cenario de teste do junit 1: Subtraçao de dois valores
        sub = calc.subtrair(10, 6);
        System.out.println(sub);
        Assert.assertEquals(4, sub);

        sub = calc.subtrair(20, 0);
        System.out.println(sub);
        Assert.assertEquals(20, sub);

        //Cenario de teste do junit  2: Subtraçao de dois valores sendo um zero 
        sub = calc.subtrair(0, 0);
        System.out.println(sub);
        Assert.assertEquals(0, sub);

        //Cenario de teste do junit  3: Subtraçao de dois valores sendo que ambos sao zero
        sub = calc.subtrair(27, -2);
        System.out.println(sub);
        Assert.assertEquals(29, sub);

        //Cenario de teste do junit  4: Subtraçao de dois valores sendo um negativo
    }

    @SuppressWarnings("deprecation")
    @Test
    public void TesteMultiplicaçao() {
        int mult = 0;
        CalculadoraOperacoes calc = new CalculadoraOperacoes();
        //Cenario de teste do junit  1: Multiplicacao de dois valores
        mult = calc.multiplicacao(10, 3);
        System.out.println(mult);
        Assert.assertEquals(30, mult);

        //Cenario de teste do junit  2: Multiplicacao de dois valores sendo um zero 
        mult = calc.multiplicacao(20, 0);
        System.out.println(mult);
        Assert.assertEquals(0, mult);
        //Cenario de teste do junit  3: Multiplicaçao de dois valores sendo que ambos sao zero

        mult = calc.multiplicacao(0, 0);
        System.out.println(mult);
        Assert.assertEquals(0, mult);

        //Cenario de teste do junit  4: Multiplicacao de dois valores sendo um negativo
        mult = calc.multiplicacao(2, -12);
        System.out.println(mult);
        Assert.assertEquals(10, mult);

    }

    @SuppressWarnings("deprecation")
    @Test
    public void TesteDivisao() {
        double div = 0;

//Cenario de teste do junit  1: divisao de dois valores
        CalculadoraOperacoes calc = new CalculadoraOperacoes();
        div = calc.divisao(6, 3);
        System.out.println(div);
        Assert.assertEquals(2, div);

        //Cenario de teste do junit  2: divisao de dois valores sendo um zero 
        div = calc.divisao(0, 9);
        System.out.println(div);
        Assert.assertEquals(0, div);

        //Cenario de teste do junit  3: divisao de dois valores sendo que ambos sao zero
        div = calc.divisao(0, 0);
        System.out.println(div);
        Assert.assertEquals(0, div);

        //Cenario de teste do junit  4: divisao de dois valores sendo um negativo
        div = calc.divisao(6, -2);
        System.out.println(div);
        Assert.assertEquals(2, div);

    }

}
