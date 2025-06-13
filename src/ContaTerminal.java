import java.util.Scanner;

public class ContaTerminal {
    public static void account() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String AccountAgency = scanner.nextLine();

        System.out.println("\nPor favor, digite o número da Conta: ");
        int AccountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nPor favor, insira seu nome: ");
        String AccountName = scanner.nextLine();

        System.out.println("\nPor favor, insira seu saldo: ");
        Float AccountBalance = scanner.nextFloat();

        // Printl the stuff

        System.out.println("\nOlá ".concat(AccountName)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(AccountAgency).concat(" ,conta ")
                .concat(String.valueOf(AccountNumber)).concat(" e seu saldo ")
                .concat(String.valueOf(AccountBalance)).concat(" já está disponível para saque."));
    }

    public static void main(String[] args) {
        account();

    }
}
