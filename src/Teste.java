import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da operação que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");

        int opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Digite os números que deseja somar");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            soma.calcula(numero1, numero2);
            System.out.println();



        }


    }
}
