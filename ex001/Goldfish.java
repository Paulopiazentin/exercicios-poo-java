package ex001;

public class Goldfish extends Peixe {
   
    @Override
    public void locomover() {System.out.println("Nadando");}
    
    @Override
    public void alimentar() {System.out.println("Comendo");}
    
    @Override
    public void emitirSom() {System.out.println("som de peixe");}
    
    @Override
    public void soltarBolha() {System.out.println("blu blu blu");}
}