package primeiraSemana.encapsulamento.polimorfismo.sobreposicao;

public class Passarinho extends Animal  {

    @Override
    public void locomover() {
        System.out.println("voando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("piu, piu");
    }
}
