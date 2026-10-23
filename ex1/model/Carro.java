package ex1.model;

public class Carro implements Veiculo{
    public String nome;

    @Override 
    public void mover(){
        System.out.println("O carro está dirigindo");
    }
    
}