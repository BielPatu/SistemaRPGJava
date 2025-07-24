package arma;

public class ArmaMagica extends ClasseArma {

    public ArmaMagica(String nomeArma, String tipoArma, String danoElementalArma, int danoArma) {
        super(nomeArma, tipoArma, danoElementalArma, danoArma);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Usou magia");
    }
}
