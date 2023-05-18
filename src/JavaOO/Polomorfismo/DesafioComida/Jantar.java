package JavaOO.Polomorfismo.DesafioComida;

public class Jantar {
    public static void main(String[] args) {
        Pessoa joão = new Pessoa("João",110.5);
        Arroz arroz = new Arroz(30.8);
        feijão feijão = new feijão(15.6);
        Sorvete sorvete = new Sorvete(400.6);

        joão.Comer(arroz);
        joão.Comer(feijão);
        joão.Comer(sorvete);

        System.out.println(joão.getPeso());
    }
}
