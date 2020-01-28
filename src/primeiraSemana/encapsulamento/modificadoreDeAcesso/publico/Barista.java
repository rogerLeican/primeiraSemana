package primeiraSemana.encapsulamento.modificadoreDeAcesso.publico;

import primeiraSemana.encapsulamento.modificadoreDeAcesso.protegido.MondialCafeteira;
import primeiraSemana.encapsulamento.modificadoreDeAcesso.protegido.Philco30temp;

public class Barista {

    public static void main(String[] args) {

        Philco30temp p = new Philco30temp();

        //p.tocarMusicaPhilco();

        MondialCafeteira oc = new MondialCafeteira();

        oc.getDançar();
        //oc.dançar();






    }



}
