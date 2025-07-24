package arma;

public abstract class ClasseArma {
    protected String nomeArma;
    protected String tipoArma;
    protected String danoElementalArma;
    protected int danoArma;

    public ClasseArma(String nomeArma, String tipoArma, String danoElementalArma, int danoArma) {
        this.nomeArma = nomeArma;
        this.tipoArma = tipoArma;
        this.danoElementalArma = danoElementalArma;
        this.danoArma = danoArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getDanoElementalArma() {
        return danoElementalArma;
    }

    public void setDanoElementalArma(String danoElementalArma) {
        this.danoElementalArma = danoElementalArma;
    }

    public int getDanoArma() {
        return danoArma;
    }

    public void setDanoArma(int danoArma) {
        this.danoArma = danoArma;
    }

    public abstract void habilidadeEspecial();
}
