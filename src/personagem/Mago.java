package personagem;

public class Mago extends ClassePersonagem {

    public Mago() {
        super("Mago", 10, 5, 80); //  ataque 10, defesa 5, vida 80
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Mago lança Bola de Fogo!");
    }

    @Override
    public void atacar() {
        System.out.println("Mago ataca com magia!");
    }

    @Override
    public void defender() {
        System.out.println("Mago conjura um escudo mágico para defender.");
    }

    @Override
    public void esquivar() {
        System.out.println("Mago usa magia para esquivar.");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Classe: " + nomeClasse);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataqueBase);
        System.out.println("Defesa: " + defesaBase);
    }
}
