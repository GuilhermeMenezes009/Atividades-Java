import java.util.Scanner;

public class ClassificacaoIMC  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu gênero (M/F/N): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao = "";

        if (genero == 'M') {
            if (imc >= 40) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 30 && imc < 40) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 25 && imc < 30) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 20 && imc < 25) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
        } else {
            if (imc >= 39) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 38.9 && imc < 39) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 28.9 && imc < 38.9) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 23.9 && imc < 28.9) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
        }

        System.out.println("Classificação: " + classificacao);
    }
}