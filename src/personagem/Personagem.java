package personagem;

import arma.ClasseArma;
import equipamento.equipamento;
import habilidade.Classehabilidade;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private ClassePersonagem classe;
    private boolean estaEmMissao;

    private ClasseArma armaEquipada;
    private List<equipamento> equipamentos;
    private List<Classehabilidade> habilidades;

    public Personagem(String nome, ClassePersonagem classe) {
        this.nome = nome;
        this.classe = classe;
        this.estaEmMissao = false;
        this.equipamentos = new ArrayList<>();
        this.armaEquipada = null;
        this.habilidades = new ArrayList<>();

    }

    // Getters
    public String getNome() {
        return nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public ClasseArma getArmaEquipada() {
        return armaEquipada;
    }

    public List<equipamento> getEquipamentos() {
        return equipamentos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }

    public void setArmaEquipada(ClasseArma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    public void setEquipamentos(equipamento equipamentos) {
    	if (this.equipamentos == null) {
            this.equipamentos = new ArrayList<>();
        }
        this.equipamentos.add(equipamentos);
    }

    // Missão
    public boolean missaoCheck() {
        return estaEmMissao;
    }

    public void setEstaEmMissao(boolean estaEmMissao) {
        this.estaEmMissao = estaEmMissao;
    }

    // Exibe status
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe.getNomeClasse());

        if (armaEquipada != null) {
            System.out.println("Arma equipada:");
            System.out.println(" - " + armaEquipada.getNomeArma() + " (" + armaEquipada.getTipoArma() + ")");
        } else {
            System.out.println("Arma equipada: Nenhuma");
        }

        if (!equipamentos.isEmpty()) {
            System.out.println("Equipamentos:");
            for (equipamento e : equipamentos) {
                System.out.println(" - " + e.getNome() + " (" + e.getTipo() + ")");
            }
        } else {
            System.out.println("Equipamentos: Nenhum");
        }
        
        if (!habilidades.isEmpty()) {
            System.out.println("Habilidades:");
            for (Classehabilidade e : habilidades) {
                System.out.println(" - " + e.getNome() + " (" + e.getTipo() + ")");
            }
        } else {
            System.out.println("Habilidades: Nenhum");
        }
    }

    public void adicionarHabilidade(Classehabilidade habilidade) {
        if (this.habilidades == null) {
            this.habilidades = new ArrayList<>();
        }
        this.habilidades.add(habilidade);
    }

    public void removerHabilidade(Classehabilidade habilidade) {
        habilidades.remove(habilidade);
    }
    
    public void desequiparArma() {
        if (this.armaEquipada != null) {
            System.out.println("Desequipando arma: " + this.armaEquipada.getNomeArma());
            this.armaEquipada = null;
        } else {
            System.out.println("Nenhuma arma equipada.");
        }
    }
    
    public void desequiparEquipamento(String nomeEquipamento) {
        equipamento equipRemovido = null;
        for (equipamento e : this.equipamentos) {
            if (e.getNome().equalsIgnoreCase(nomeEquipamento)) {
                equipRemovido = e;
                break;
            }
        }
        if (equipRemovido != null) {
            this.equipamentos.remove(equipRemovido);
            System.out.println("Equipamento '" + equipRemovido.getNome() + "' desequipado.");
        } else {
            System.out.println("Equipamento não encontrado.");
        }
    }
    
    public void desequiparHabilidade(String nomeHabilidade) {
        Classehabilidade habilidadeRemovida = null;
        for (Classehabilidade h : this.habilidades) {
            if (h.getNome().equalsIgnoreCase(nomeHabilidade)) {
                habilidadeRemovida = h;
                break;
            }
        }
        if (habilidadeRemovida != null) {
            this.habilidades.remove(habilidadeRemovida);
            System.out.println("Habilidade '" + habilidadeRemovida.getNome() + "' desequipada.");
        } else {
            System.out.println("Habilidade não encontrada.");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
