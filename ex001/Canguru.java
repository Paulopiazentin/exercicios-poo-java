package ex001;

public class Canguru extends Mamifero{
    @Override
    public void locomover() {
        System.out.println("Pula");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Canguru");
    }
}