import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao nosso programa!");

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite seu estado civil:");
        String estadoCivil = scanner.nextLine();

        System.out.println("\nRevise os dados ");

        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Estado civil: " + estadoCivil);

        scanner.close();
    }
}
