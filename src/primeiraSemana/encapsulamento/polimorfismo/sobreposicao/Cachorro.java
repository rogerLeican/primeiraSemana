package primeiraSemana.encapsulamento.polimorfismo.sobreposicao;

public class Cachorro extends Animal{


    @Override
    public void locomover() {
        System.out.println("correndo...");
    }

    @Override
    public void emitirSom() {
        System.out.printf("latindo...");

    }
}
