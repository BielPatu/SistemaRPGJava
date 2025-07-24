package guilda;

import java.util.ArrayList;
import java.util.List;

import personagem.Personagem;

public class guilda {
    private String nome;
    private int capacidade;
    private List<Personagem> membros;

    public guilda(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Personagem> getMembros() {
        return membros;
    }

    public int getMembrosAtuais() {
        return membros.size();
    }

    public boolean addParticipante(Personagem p) {
        if (membros.size() < capacidade) {
            membros.add(p);
            return true;
        } else {
            System.out.println("Guilda cheia! Não é possível adicionar mais membros.");
            return false;
        }
    }

    public boolean removerParticipante(Personagem p) {
        return membros.remove(p);
    }
}
