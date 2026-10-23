package ex2.model;

public class Calculadora {
    public void somar(int n1, int n2){
        int r; 
        r = n1+n2;
        System.out.println(n1 + "+" + n2 + "=" + r);
    }

    public void somar(int n1, int n2, int n3){
        int r; 
        r = n1+n2+n3;
        System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + r);
    }

        public void somar(double n1, double n2){
        double r; 
        r = n1+n2;
        System.out.println(n1 + "+" + n2 + "=" + r);
    }
}
