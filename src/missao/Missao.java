package missao;

import java.util.ArrayList;
import java.util.List;

import personagem.Personagem;

public class Missao {
    private String titulo;
    private String descricao;
    private List<Personagem> grupo;

    public Missao(String titulo, String descricao, List<Personagem>personagensDoGrupo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.grupo = personagensDoGrupo;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setters (para permitir atualização)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder participanteNomes = new StringBuilder();

        for (Personagem p : grupo) {
            participanteNomes.append(p.getNome()).append(", ");
        }
        if (participanteNomes.length() > 0) {
            participanteNomes.setLength(participanteNomes.length() - 2);
        }

        return "Missão: " + titulo + "\nDescrição: " + descricao + "\nParticipantes: " + participanteNomes;
    }
}
