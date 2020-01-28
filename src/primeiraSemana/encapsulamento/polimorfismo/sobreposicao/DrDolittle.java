package primeiraSemana.encapsulamento.polimorfismo.sobreposicao;

public class DrDolittle {

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        Passarinho p = new Passarinho();

        System.out.println("\n");
        System.out.println("Cachorro " );
        c.locomover();

        System.out.println("\n");
        System.out.println("Canguru " );
        k.locomover();

        System.out.println("\n");
        System.out.println("Passarinho " );
        p.locomover();


    }


}
