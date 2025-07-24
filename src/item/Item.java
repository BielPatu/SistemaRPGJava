package item;

public class Item {
    private String nome;
    private String tipo;
    private int bonus;

    public Item(String nome, String tipo, int bonus) {
        this.nome = nome;
        this.tipo = tipo;
        this.bonus = bonus;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getBonus() {
        return bonus;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Item: " + nome + ", Tipo: " + tipo + ", Bônus: " + bonus;
    }
}
