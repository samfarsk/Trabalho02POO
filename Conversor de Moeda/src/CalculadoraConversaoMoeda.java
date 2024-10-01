import java.util.Scanner;

public class CalculadoraConversaoMoeda {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ConversorMoeda conversor = new ConversorMoeda();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Selecione a moeda de origem:");
            exibirMoedas();
            Moeda moedaDe = selecionarMoeda();

            System.out.println("Selecione a moeda de destino:");
            exibirMoedas();
            Moeda moedaPara = selecionarMoeda();

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            double resultado = conversor.converter(moedaDe, moedaPara, valor);
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", valor, moedaDe, resultado, moedaPara);

            System.out.print("Deseja realizar outra conversão? (s/n): ");
            if (!scanner.next().equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }

    private static void exibirMoedas() {
        Moeda[] moedas = Moeda.values();
        for (int i = 0; i < moedas.length; i++) {
            System.out.printf("%d - %s%n", i, moedas[i]);
        }
    }

    private static Moeda selecionarMoeda() {
        while (true) {
            try {
                int escolha = scanner.nextInt();
                return Moeda.values()[escolha];
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.out.print("Opção inválida, tente novamente: ");
            }
        }
    }
}
