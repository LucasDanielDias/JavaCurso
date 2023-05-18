package JavaOO.Polomorfismo.DesafioComida;

public class Pessoa {
    private String nome;
    private double peso;
    public Double Comer(Comida comida){
        this.peso += comida.getPeso();
        return peso;
    }
    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
