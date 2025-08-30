# Jogo Samurai (Java)

## Descrição
Um jogo de batalha entre dois Samurais, jogado no terminal. Cada jogador possui vida, fôlego, ataque, proteção e defesa. A cada rodada, ambos rolam um dado (1 a 6): quem tirar o maior número tem direito a 2 jogadas, o outro tem 1 jogada. Em caso de empate, cada um joga uma vez. O objetivo é zerar a vida do oponente.

## Requisitos
- Java JDK instalado (versão 17 ou superior recomendado)
- Terminal (PowerShell, CMD, etc.)

## Instalação
1. Baixe ou clone este repositório.
2. Certifique-se de que o Java está instalado e configurado no PATH.
3. Coloque os arquivos `Samurai.java` e `JogoSamurai.java` na pasta `src`.

## Como jogar
1. Abra o terminal na pasta do projeto.
2. Compile o jogo:
   ```powershell
   javac src/Samurai.java src/JogoSamurai.java
   ```
3. Execute o jogo:
   ```powershell
   java -cp src JogoSamurai
   ```
4. Siga as instruções na tela:
   - Cada rodada começa com o lançamento de dados.
   - O jogador com o maior número joga duas vezes.
   - Escolha entre atacar, defender ou recuperar fôlego digitando o número correspondente.
   - O jogo termina quando a vida de um dos jogadores chega a zero.

## Regras do Jogo
- **Atacar:** Causa dano ao oponente, reduzido pela defesa dele.
- **Defender:** Aumenta temporariamente sua defesa.
- **Recuperar Fôlego:** Recupera pontos de fôlego.
- O status de ambos os jogadores é exibido após cada ação.

## Dicas
- Certifique-se de digitar apenas números nas escolhas.
- Se o terminal mostrar erro de comando não encontrado, revise o PATH do Java.
- Para reiniciar o jogo, basta executar novamente o comando de execução.

## Exemplo de Jogada
```
--- Nova Rodada ---
Jogador 1 rolou: 5
Jogador 2 rolou: 2
Jogador 1 ganhou o dado e terá 2 jogadas!

Vez de Jogador 1 (Jogada 1/2)
Vida: 30 | Fôlego: 10
1 - Atacar
2 - Defender
3 - Recuperar Fôlego
Escolha: 1
Jogador 1 atacou!
Status:
Jogador 1 - Vida: 30, Fôlego: 10
Jogador 2 - Vida: 26, Fôlego: 10
```

## Autor
Feito por [Seu Nome].
