package primeiraSemana.encapsulamento.modificadoreDeAcesso.protegido;

import primeiraSemana.encapsulamento.modificadoreDeAcesso.publico.Cafeteira;

public class MondialCafeteira   {

    private String cor;
    private double quantidadeLitros;
    private boolean ligada;

    protected void dancar() {
        System.out.println("dançando");
    }

    public  void getDançar(){

        dancar();

    }
}
