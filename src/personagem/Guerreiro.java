package personagem;

public class Guerreiro extends ClassePersonagem {

    public Guerreiro() {
        super("Guerreiro", 15, 10, 100); //  ataque 15, defesa 10, vida 100
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Guerreiro realiza um Golpe Poderoso!");
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com espada!");
    }

    @Override
    public void defender() {
        System.out.println("Guerreiro levanta seu escudo para defender.");
    }

    @Override
    public void esquivar() {
        System.out.println("Guerreiro esquiva com agilidade.");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Classe: " + nomeClasse);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataqueBase);
        System.out.println("Defesa: " + defesaBase);
    }
}
