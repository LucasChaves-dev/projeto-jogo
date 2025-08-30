public class Samurai {
    private String nome;
    private int vida;
    private int folego;
    private int ataque;
    private int protecao;
    private int defesa;

    public Samurai(String nome, int vida, int folego, int ataque, int protecao, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.folego = folego;
        this.ataque = ataque;
        this.protecao = protecao;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getFolego() {
        return folego;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getProtecao() {
        return protecao;
    }

    public int getDefesa() {
        return defesa;
    }

    public void receberDano(int dano) {
        int danoFinal = dano - defesa;
        if (danoFinal < 0) danoFinal = 0;
        vida -= danoFinal;
        if (vida < 0) vida = 0;
    }

    public void atacar(Samurai oponente) {
        oponente.receberDano(ataque);
    }

    public void defender() {
        defesa += 2;
    }

    public void restaurarFolego() {
        folego += 3;
    }
}
