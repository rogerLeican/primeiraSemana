package primeiraSemana.encapsulamento.modificadoreDeAcesso.publico;

import primeiraSemana.encapsulamento.modificadoreDeAcesso.protegido.MondialCafeteira;

//Alt + J alterar varia palavras
public class Cafeteira {

    public String cor;
    private double quantidaDeLitros;
    private boolean ligada;
    boolean visibilidadePacote;

    private void tocarMusica(){
        System.out.println("tocando musica...");
    }

    public void LigarDesligarCafeteira(){
        if (!ligada){
            setLigada(true);
            System.out.printf("Passando café");
        }else{
            setLigada(false);
            System.out.printf("desligando");
        }

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuantidadeLitros() {
        return quantidaDeLitros;
    }

    public void setQuantidadeLitros(double quantidaDeLitros) {
        this.quantidaDeLitros = quantidaDeLitros;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }


}
