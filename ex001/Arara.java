package ex001;

public class Arara extends Ave{
    
    @Override
    public void locomover() {System.out.println("voando");}
    
    @Override
    public void alimentar() {System.out.println("Comendo");}
    
    @Override
    public void emitirSom() {System.out.println("som de Arara");}
    
    @Override
    public void fazerNinho() {System.out.println("fazendo Ninho");}
}