package primeiraSemana.encapsulamento.staticoFinal;

import java.util.Scanner;

public class AreaCirculo {

    public static  double PI = 3.14;//constante declarar como final

    //A = PI*r2;


    public static void calculaArea(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o raio");

        int raio = entrada.nextInt();

        double area = PI * (Math.pow(raio,2));

        System.out.println(area);

        entrada.close();
    }


}
