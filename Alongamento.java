#projeto_P2
import java.util.ArrayList;
import java.util.Scanner;

public class Alongamento {
    public static void main(String[] args) {
            ArrayList<String> exercicios_alongamento = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean sair = false;

            while (!sair) {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar alogamento");
                System.out.println("2. Listar alogamento");
                System.out.println("3. Marcar alogamento realizado");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\n");

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do alogamento para adicionar: ");
                        String alogamento = scanner.nextLine();
                        exercicios_alongamento.add(alogamento);
                        System.out.println("Alongamento adicionado!");
                        break;

                    case 2:
                        System.out.println("Lista de alongamentos:");
                        for (int i = 0; i < exercicios_alongamento.size(); i++) {
                            System.out.println(i + ". " + exercicios_alongamento.get(i));
                        }
                        break;

                    case 3:
                        System.out.print("Digite o índice do alongamento que já foi feito: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();
                        if (indice >= 0 && indice < exercicios_alongamento.size()) {
                            exercicios_alongamento.remove(indice);
                            System.out.println("Alongamento removido! Feito com sucesso, parabéns!");
                        } else {
                            System.out.println("Índice não válido!");
                        }
                        break;

                    case 4:
                        sair = true;
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção não válida! Tente novamente escolhendo alguma opção da lista.");
                }
            }

            scanner.close();
        }
    }