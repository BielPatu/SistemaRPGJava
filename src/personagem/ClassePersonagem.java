package personagem;

import interfaces.Acao;

public abstract class ClassePersonagem implements Acao {
    protected String nomeClasse;
    protected int ataqueBase;
    protected int defesaBase;
    protected int vida;
    protected int vidaMaxima;

    public ClassePersonagem(String nomeClasse, int ataqueBase, int defesaBase, int vidaMaxima) {
        this.nomeClasse = nomeClasse;
        this.ataqueBase = ataqueBase;
        this.defesaBase = defesaBase;
        this.vidaMaxima = vidaMaxima;
        this.vida = this.vidaMaxima;
    }
    public void receberDano(int dano) {
        this.vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(this.nomeClasse + " recebeu " + dano + " de dano! Vida restante: " + this.vida);
    }
    public void defender() {
        System.out.println(nomeClasse + " defende, reduzindo o dano recebido!");
    }

    public void esquivar() {
        System.out.println(nomeClasse + " tenta esquivar do ataque!");
    }

    public abstract void habilidadeEspecial();

    // Getters e Setters
    public String getNomeClasse() {
        return nomeClasse;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public int getDefesaBase() {
        return defesaBase;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, Math.min(vida, this.vidaMaxima));
    }
}
