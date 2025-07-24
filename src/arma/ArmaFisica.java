package arma;

public class ArmaFisica extends ClasseArma {

    public ArmaFisica(String nomeArma, String tipoArma, String danoElementalArma, int danoArma) {
        super(nomeArma, tipoArma, danoElementalArma, danoArma);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Usou golpe físico");
    }
}
