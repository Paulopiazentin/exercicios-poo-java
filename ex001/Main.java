package ex001;


public class Main {
        public static void main (String[] args) {

            Mamifero m = new Mamifero();
            Reptil r = new Reptil ();
            Peixe p = new Peixe();
            Ave a = new Ave();
            Cachorro k = new Cachorro();
            Canguru c = new Canguru();
            Cobra o = new Cobra();
            Tartaruga t = new Tartaruga();
            Goldfish g = new Goldfish();
            Arara f = new Arara();

            System.out.println("\nCachorro");
            k.emitirSom();
            k.locomover();
            k.alimentar();


            System.out.println("\nCanguru");
            c.emitirSom();
            c.locomover();
            c.alimentar();

            System.out.println("\nCobra");
            o.emitirSom();
            o.locomover();
            o.alimentar();

            System.out.println("\nTartaruga");
            t.emitirSom();
            t.locomover();
            t.alimentar();

            System.out.println("\nGoldfish");
            g.emitirSom();
            g.locomover();
            g.alimentar();
            g.soltarBolha();

            System.out.println("\nArara");
            f.emitirSom();
            f.locomover();
            f.alimentar();
            f.fazerNinho();


        }
}