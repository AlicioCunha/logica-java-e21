import java.util.Scanner;

import java.util.Locale;

/*
Fazer um programa para ler as medidas da base e altura de um retângulo.
Em seguida,  mostrar o valor da área, perímetro e diagonal deste retângulo,
com quatro casas  decimais, conforme exemplo.

Exemplo:
 Entrada:       Saída:
5.0             AREA = 20.0000
4.0             PERIMETRO = 18.0000
                DIAGONAL = 6.4031

 */
public class CalculaRetangulo {

    public static void main(String[] args) {
        // Configurando a entrada de dados para aceitar PONTO
        Locale.setDefault(Locale.US);
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o valor da base");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimeto = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n",  perimeto);
        System.out.printf("DIAGONAL = %.4f%n",  diagonal);
    }
}
