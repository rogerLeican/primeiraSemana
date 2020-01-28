package primeiraSemana.encapsulamento.polimorfismo.sobreposicao;

public class Canguru extends Animal{


    @Override
    public void locomover() {
        System.out.printf("Pulando..");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de canguru");
    }
}
