import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Compra> listaDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        double limiteDoCartao = leitura.nextDouble();
        double saldoRestante = limiteDoCartao;

        while (true) {
            leitura.nextLine();
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            if (valor > saldoRestante) {
                System.out.println("O limite do cartão é insuficiente para realizar essa compra");
                break;
            } else {
                saldoRestante -= valor;
                listaDeCompras.add(new Compra(descricao, valor));
                System.out.println("\nCompra realizada com sucesso!\n");
            }

            System.out.println("Digite 1 para continuar ou 0 para sair!");
            int opcao = leitura.nextInt();

            if (opcao == 0) {
                break;
            }
        }
        System.out.println("Compras realizadas: ");
        for (Compra compra : listaDeCompras) {
            System.out.println(compra);
        }
        System.out.printf("Saldo restante: R$ %.2f\n", saldoRestante);
        leitura.close();
    }
}
