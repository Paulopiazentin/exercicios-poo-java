package ex001;

public class Cobra extends Reptil{
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo pequenos animais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sssssss");
    }
}