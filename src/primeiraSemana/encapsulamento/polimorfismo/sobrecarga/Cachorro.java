package primeiraSemana.encapsulamento.polimorfismo.sobrecarga;

import primeiraSemana.encapsulamento.polimorfismo.sobreposicao.Animal;

public class Cachorro  {

    public void reagir(boolean dono,String frase){
        if(dono && "Dark".equalsIgnoreCase(frase)){
            System.out.println("abanado o rabo");
            System.out.println("\n latindo..");
        }else{
            System.out.println("Rosnando");
            System.out.println("mostrando os dentes");
        }
    }

    public void reagir(double horario){
        if (horario<7){
            System.out.println("ignorando..");
        }else{
            System.out.println("reagindo..");
        }

    }


}
