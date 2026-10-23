package ex2.view;

import ex2.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calcule = new Calculadora();

        calcule.somar(2, 3);
        calcule.somar(4, 2);
        calcule.somar(1, 2, 3); 
    }
}
