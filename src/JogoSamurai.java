import java.util.Scanner;

public class JogoSamurai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Samurai jogador1 = new Samurai("Jogador 1", 30, 10, 6, 3, 2);
        Samurai jogador2 = new Samurai("Jogador 2", 30, 10, 6, 3, 2);
        java.util.Random random = new java.util.Random();

        while (jogador1.getVida() > 0 && jogador2.getVida() > 0) {
            // Rolar dados
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            System.out.println("\n--- Nova Rodada ---");
            System.out.println(jogador1.getNome() + " rolou: " + dado1);
            System.out.println(jogador2.getNome() + " rolou: " + dado2);
            Samurai primeiro, segundo;
            int jogadasPrimeiro = 1, jogadasSegundo = 1;
            if (dado1 > dado2) {
                primeiro = jogador1;
                segundo = jogador2;
                jogadasPrimeiro = 2;
                System.out.println(jogador1.getNome() + " ganhou o dado e terá 2 jogadas!");
            } else if (dado2 > dado1) {
                primeiro = jogador2;
                segundo = jogador1;
                jogadasPrimeiro = 2;
                System.out.println(jogador2.getNome() + " ganhou o dado e terá 2 jogadas!");
            } else {
                primeiro = jogador1;
                segundo = jogador2;
                System.out.println("Empate no dado! Cada um terá 1 jogada.");
            }

            // Jogadas do primeiro
            for (int i = 0; i < jogadasPrimeiro && jogador1.getVida() > 0 && jogador2.getVida() > 0; i++) {
                System.out.println("\nVez de " + primeiro.getNome() + " (Jogada " + (i+1) + "/" + jogadasPrimeiro + ")");
                System.out.println("Vida: " + primeiro.getVida() + " | Fôlego: " + primeiro.getFolego());
                System.out.println("1 - Atacar\n2 - Defender\n3 - Recuperar Fôlego");
                int escolha = 0;
                try {
                    escolha = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Entrada inválida! Use apenas números.");
                    scanner.nextLine();
                    i--;
                    continue;
                }
                scanner.nextLine(); // Limpa o buffer
                Samurai oponente = (primeiro == jogador1) ? jogador2 : jogador1;
                if (escolha == 1) {
                    primeiro.atacar(oponente);
                    System.out.println(primeiro.getNome() + " atacou!");
                } else if (escolha == 2) {
                    primeiro.defender();
                    System.out.println(primeiro.getNome() + " defendeu!");
                } else if (escolha == 3) {
                    primeiro.restaurarFolego();
                    System.out.println(primeiro.getNome() + " recuperou fôlego!");
                } else {
                    System.out.println("Opção inválida!");
                    i--; // repete a jogada
                    continue;
                }
                System.out.println("Status: ");
                System.out.println(jogador1.getNome() + " - Vida: " + jogador1.getVida() + ", Fôlego: " + jogador1.getFolego());
                System.out.println(jogador2.getNome() + " - Vida: " + jogador2.getVida() + ", Fôlego: " + jogador2.getFolego());
            }

            // Jogadas do segundo
            for (int i = 0; i < jogadasSegundo && jogador1.getVida() > 0 && jogador2.getVida() > 0; i++) {
                System.out.println("\nVez de " + segundo.getNome() + " (Jogada " + (i+1) + "/" + jogadasSegundo + ")");
                System.out.println("Vida: " + segundo.getVida() + " | Fôlego: " + segundo.getFolego());
                System.out.println("1 - Atacar\n2 - Defender\n3 - Recuperar Fôlego");
                int escolha = 0;
                try {
                    escolha = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Entrada inválida! Use apenas números.");
                    scanner.nextLine();
                    i--;
                    continue;
                }
                scanner.nextLine(); // Limpa o buffer
                Samurai oponente = (segundo == jogador1) ? jogador2 : jogador1;
                if (escolha == 1) {
                    segundo.atacar(oponente);
                    System.out.println(segundo.getNome() + " atacou!");
                } else if (escolha == 2) {
                    segundo.defender();
                    System.out.println(segundo.getNome() + " defendeu!");
                } else if (escolha == 3) {
                    segundo.restaurarFolego();
                    System.out.println(segundo.getNome() + " recuperou fôlego!");
                } else {
                    System.out.println("Opção inválida!");
                    i--; // repete a jogada
                    continue;
                }
                System.out.println("Status: ");
                System.out.println(jogador1.getNome() + " - Vida: " + jogador1.getVida() + ", Fôlego: " + jogador1.getFolego());
                System.out.println(jogador2.getNome() + " - Vida: " + jogador2.getVida() + ", Fôlego: " + jogador2.getFolego());
            }
        }
        if (jogador1.getVida() > 0) {
            System.out.println("\n" + jogador1.getNome() + " venceu!");
        } else {
            System.out.println("\n" + jogador2.getNome() + " venceu!");
        }
        scanner.close();
    }
}
