package primeiraSemana.encapsulamento.interface2;

public class controleMondial implements InterfaceCafeteira {

    private String cor;
    private double litros;
    private boolean ligada;

    public controleMondial() {//melltodo construtor
        setCor("Preta");
        setLitros(1.5);
        setLigada(false);
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

    public void esquentarCafe(){
        if( isLigada() ){

            System.out.printf("esquantando o café");
        }else{
            System.out.println("ligar cafeteira");
        }
    }


    private String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    private double getLitros() {
        return litros;
    }

    private void setLitros(double litros) {
        this.litros = litros;
    }

    private boolean isLigada() {
        return ligada;
    }

    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
