class Samurai:
    def __init__(self, nome, vida, folego, ataque, protecao, defesa):
        self.nome = nome
        self.vida = vida
        self.folego = folego
        self.ataque = ataque
        self.protecao = protecao
        self.defesa = defesa

    def receber_dano(self, dano):
        dano_final = max(dano - self.defesa, 0)
        self.vida -= dano_final
        if self.vida < 0:
            self.vida = 0

    def atacar(self, oponente):
        oponente.receber_dano(self.ataque)

    def defender(self):
        self.defesa += 2

    def restaurar_folego(self):
        self.folego += 3

    def status(self):
        return f"{self.nome} - Vida: {self.vida}, Fôlego: {self.folego}, Defesa: {self.defesa}"


def main():
    jogador1 = Samurai("Jogador 1", 30, 10, 6, 3, 2)
    jogador2 = Samurai("Jogador 2", 30, 10, 6, 3, 2)
    turno = 1

    while jogador1.vida > 0 and jogador2.vida > 0:
        atual = jogador1 if turno % 2 == 1 else jogador2
        oponente = jogador2 if turno % 2 == 1 else jogador1
        print(f"\nVez de {atual.nome}")
        print(atual.status())
        print("1 - Atacar\n2 - Defender\n3 - Recuperar Fôlego")
        try:
            escolha = int(input("Escolha: "))
        except ValueError:
            print("Opção inválida!")
            continue
        if escolha == 1:
            atual.atacar(oponente)
            print(f"{atual.nome} atacou!")
        elif escolha == 2:
            atual.defender()
            print(f"{atual.nome} defendeu!")
        elif escolha == 3:
            atual.restaurar_folego()
            print(f"{atual.nome} recuperou fôlego!")
        else:
            print("Opção inválida!")
            continue
        print("Status:")
        print(jogador1.status())
        print(jogador2.status())
        turno += 1

    vencedor = jogador1 if jogador1.vida > 0 else jogador2
    print(f"\n{vencedor.nome} venceu!")

if __name__ == "__main__":
    main()
