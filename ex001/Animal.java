package ex001;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membro;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso(){return peso;}
    public void setPeso(float peso) {this.peso = peso;}
    
    public float getIdade(){return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public float getMembro(){return membro;}
    public void setMembro(int membro) {this.membro = membro;}
}