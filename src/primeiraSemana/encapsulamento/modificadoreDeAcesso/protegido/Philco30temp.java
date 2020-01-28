package primeiraSemana.encapsulamento.modificadoreDeAcesso.protegido;

import primeiraSemana.encapsulamento.modificadoreDeAcesso.publico.Cafeteira;

public class Philco30temp extends Cafeteira {

    public Philco30temp() {//melltodo construtor
        setCor("inox");
        setQuantidadeLitros(1.5);
        setLigada(false);
    }

    public void esquentarCafe() {
        if (isLigada()) {

            System.out.printf("esquantando o café");
        } else {
            System.out.println("ligar cafeteira");
        }
    }


    protected void tocarMusicaPhilco() {
        System.out.println("Tocando Musica...");
    }




}
