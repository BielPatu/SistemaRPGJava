package util;

import personagem.*;
import inimigo.Inimigo;
import item.Item;
import missao.Missao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import arma.ArmaFisica;
import arma.ArmaMagica;
import arma.ClasseArma;
import equipamento.equipamento;
import guilda.guilda;
import habilidade.Classehabilidade;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Personagem> personagens = new ArrayList<>();
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Missao> missoes = new ArrayList<>();
    private ArrayList<ClasseArma> armas = new ArrayList<>();
    private ArrayList<equipamento> equipamentos = new ArrayList<>();
    private ArrayList<Classehabilidade> habilidades = new ArrayList<>();
    private ArrayList<guilda> guildas = new ArrayList<>();

    // Cores ANSI para terminal (pode remover se não quiser cores)
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_BLUE = "\u001B[34m";
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_RED = "\u001B[31m";

    public void iniciar() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n=== MENU PRINCIPAL RPG ===" + ANSI_RESET);
            System.out.println("1. Gerenciar Personagens");
            System.out.println("2. Gerenciar Inimigos");
            System.out.println("3. Gerenciar Itens");
            System.out.println("4. Gerenciar Missões");
            System.out.println("5. Gerenciar Armas");
            System.out.println("6. Gerenciar Equipamentos");
            System.out.println("7. Gerenciar Habilidades");
            System.out.println("8. Gerenciar Guildas");
            System.out.println("0. Sair");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> menuPersonagem();
                case 2 -> menuInimigo();
                case 3 -> menuItem();
                case 4 -> menuMissao();
                case 5 -> menuArmas();
                case 6 -> menuEquipamentos();
                case 7 -> menuHabilidades();
                case 8 -> menuGuildas();
                case 0 -> System.out.println(ANSI_RED + "Saindo..." + ANSI_RESET);
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
                
            }
            
        } while (opcao != 0);
    }

    private void menuPersonagem() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n--- MENU PERSONAGENS ---" + ANSI_RESET);
            System.out.println("1. Criar Personagem");
            System.out.println("2. Listar Personagens");
            System.out.println("3. Atualizar Personagem");
            System.out.println("4. Deletar Personagem");
            System.out.println("5. Batalha (Atacar, Defender, Esquivar)");
            System.out.println("6. Equipar arma");
            System.out.println("7. Equipar equipamento");
            System.out.println("8. Equipar habilidade");
            System.out.println("9. Desequipar Itens");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarPersonagem();
                case 2 -> listarPersonagens();
                case 3 -> atualizarPersonagem();
                case 4 -> deletarPersonagem();
                case 5 -> menuBatalha();
                case 6 -> equiparArmaEmPersonagem();
                case 7 -> equiparEquipamentoEmPersonagem();
                case 8 -> equiparHabilidadeEmPersonagem();
                case 9 -> desequiparItem();
                case 0 -> System.out.println("Retornando ao menu principal...");
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
            }
        } while (opcao != 0);
    }
    private void menuInimigo() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n--- MENU INIMIGOS ---" + ANSI_RESET);
            System.out.println("1. Criar Inimigo");
            System.out.println("2. Listar Inimigos");
            System.out.println("3. Atualizar Inimigo");
            System.out.println("4. Deletar Inimigo");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarInimigo();
                case 2 -> listarInimigos();
                case 3 -> atualizarInimigo();
                case 4 -> deletarInimigo();
                case 0 -> System.out.println("Retornando ao menu principal...");
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
            }
        } while (opcao != 0);
    }

    private void menuItem() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n--- MENU ITENS ---" + ANSI_RESET);
            System.out.println("1. Criar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Atualizar Item");
            System.out.println("4. Deletar Item");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarItem();
                case 2 -> listarItens();
                case 3 -> atualizarItem();
                case 4 -> deletarItem();
                case 0 -> System.out.println("Retornando ao menu principal...");
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
            }
        } while (opcao != 0);
    }

    private void menuMissao() {
        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n--- MENU MISSÕES ---" + ANSI_RESET);
            System.out.println("1. Criar Missão");
            System.out.println("2. Listar Missões");
            System.out.println("3. Atualizar Missão");
            System.out.println("4. Deletar Missão");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarMissao();
                case 2 -> listarMissoes();
                case 3 -> atualizarMissao();
                case 4 -> deletarMissao();
                case 0 -> System.out.println("Retornando ao menu principal...");
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
            }
        } while (opcao != 0);
    }
    private void menuBatalha() {
        if (personagens.isEmpty() || inimigos.isEmpty()) {
            System.out.println(ANSI_YELLOW + "É necessário ter pelo menos um personagem e um inimigo cadastrados para batalhar." + ANSI_RESET);
            return;
        }

        System.out.print("Digite o nome do personagem: ");
        String nomePersonagem = scanner.nextLine();
        Personagem p = buscarPersonagemPorNome(nomePersonagem);

        if (p == null) {
            System.out.println(ANSI_RED + "Personagem não encontrado." + ANSI_RESET);
            return;
        }

        System.out.print("Digite o nome do inimigo: ");
        String nomeInimigo = scanner.nextLine();
        Inimigo i = buscarInimigoPorNome(nomeInimigo);

        if (i == null) {
            System.out.println(ANSI_RED + "Inimigo não encontrado." + ANSI_RESET);
            return;
        }

        int opcao;
        do {
            System.out.println(ANSI_BLUE + "\n--- BATALHA ---" + ANSI_RESET);
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Esquivar");
            System.out.println("0. Finalizar batalha");
            System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> realizarAtaque(p, i);
                case 2 -> realizarDefesa(p);
                case 3 -> realizarEsquiva(p);
                case 0 -> System.out.println("Batalha finalizada.");
                default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
            }
            if (opcao >= 1 && opcao <= 3 && i.getVida() > 0) {
                System.out.println(ANSI_RED + i.getNome() + " ataca!" + ANSI_RESET);
                int danoInimigo = i.getAtaque();

                // Verifica se o jogador está defendendo ou esquivando
                if (opcao == 2) { // Defender
                    danoInimigo /= 2;
                    System.out.println(ANSI_GREEN + p.getNome() + " defendeu! Dano reduzido pela metade." + ANSI_RESET);
                } else if (opcao == 3) { // Esquivar
                    double chanceEsquiva = Math.random(); // 0.0 a 1.0
                    if (chanceEsquiva < 0.5) { // 50% de chance de esquiva
                        System.out.println(ANSI_GREEN + p.getNome() + " esquivou com sucesso! Nenhum dano recebido." + ANSI_RESET);
                        danoInimigo = 0;
                    } else {
                        System.out.println(ANSI_RED + p.getNome() + " falhou em esquivar!" + ANSI_RESET);
                    }
                }

                if (danoInimigo > 0) {
                    p.getClasse().receberDano(danoInimigo);
                }

                if (p.getClasse().getVida() <= 0) {
                    System.out.println(ANSI_RED + p.getNome() + " foi derrotado!" + ANSI_RESET);
                    break;
                }
            }


        } while (opcao != 4);
    }

    

    //PERSONAGEM
    private void criarPersonagem() {
        System.out.print("Nome do personagem: ");
        String nome = scanner.nextLine();
        System.out.println("Escolha a classe: 1-Guerreiro 2-Mago");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        ClassePersonagem classe = (escolha == 1) ? new Guerreiro() : new Mago();

        personagens.add(new Personagem(nome, classe));
        System.out.println(ANSI_GREEN + "Personagem criado!" + ANSI_RESET);
    }

    private void listarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println(ANSI_YELLOW + "(!) Nenhum personagem cadastrado." + ANSI_RESET);
            return;
        }
        
        System.out.println("\n--- PERSONAGENS ---");
        for (int i = 0; i < personagens.size(); i++) {
            Personagem p = personagens.get(i);
            System.out.print("[" + (i+1) + "] ");
            p.exibirStatus();  
            System.out.println("------------------------");
        }
    }


    private void atualizarPersonagem() {
        System.out.print("Digite o nome do personagem para atualizar: ");
        String nome = scanner.nextLine();

        Personagem p = buscarPersonagemPorNome(nome);
        if (p == null) {
            System.out.println(ANSI_RED + "Personagem não encontrado." + ANSI_RESET);
            return;
        }

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        p.setNome(novoNome);

        System.out.println("Escolha a nova classe: 1-Guerreiro 2-Mago");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        ClassePersonagem novaClasse = (escolha == 1) ? new Guerreiro() : new Mago();
        p.setClasse(novaClasse);

        System.out.println(ANSI_GREEN + "Personagem atualizado!" + ANSI_RESET);
    }

    private void deletarPersonagem() {
        System.out.print("Digite o nome do personagem para deletar: ");
        String nome = scanner.nextLine();

        Personagem p = buscarPersonagemPorNome(nome);
        if (p == null) {
            System.out.println(ANSI_RED + "Personagem não encontrado." + ANSI_RESET);
            return;
        }

        personagens.remove(p);
        System.out.println(ANSI_GREEN + "Personagem deletado!" + ANSI_RESET);
    }

    private Personagem buscarPersonagemPorNome(String nome) {
        for (Personagem p : personagens) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // INIMIGO ---
    private void criarInimigo() {
        System.out.print("Nome do inimigo: ");
        String nome = scanner.nextLine();
        System.out.print("Vida: ");
        int vida = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque = scanner.nextInt();
        scanner.nextLine();

        inimigos.add(new Inimigo(nome, vida, ataque));
        System.out.println(ANSI_GREEN + "Inimigo criado!" + ANSI_RESET);
    }

    private void listarInimigos() {
        if (inimigos.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Nenhum inimigo cadastrado." + ANSI_RESET);
            return;
        }
        for (Inimigo i : inimigos) {
            System.out.println(i);
            System.out.println("------------------------");
        }
    }

    private void atualizarInimigo() {
        System.out.print("Digite o nome do inimigo para atualizar: ");
        String nome = scanner.nextLine();

        Inimigo i = buscarInimigoPorNome(nome);
        if (i == null) {
            System.out.println(ANSI_RED + "Inimigo não encontrado." + ANSI_RESET);
            return;
        }

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        i.setNome(novoNome);

        System.out.print("Nova vida: ");
        int novaVida = scanner.nextInt();
        System.out.print("Novo ataque: ");
        int novoAtaque = scanner.nextInt();
        scanner.nextLine();

        i.setVida(novaVida);
        i.setAtaque(novoAtaque);

        System.out.println(ANSI_GREEN + "Inimigo atualizado!" + ANSI_RESET);
    }

    private void deletarInimigo() {
        System.out.print("Digite o nome do inimigo para deletar: ");
        String nome = scanner.nextLine();

        Inimigo i = buscarInimigoPorNome(nome);
        if (i == null) {
            System.out.println(ANSI_RED + "Inimigo não encontrado." + ANSI_RESET);
            return;
        }

        inimigos.remove(i);
        System.out.println(ANSI_GREEN + "Inimigo deletado!" + ANSI_RESET);
    }

    private Inimigo buscarInimigoPorNome(String nome) {
        for (Inimigo i : inimigos) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    // ITEM ---
    private void criarItem() {
        System.out.print("Nome do item: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Bônus: ");
        int bonus = scanner.nextInt();
        scanner.nextLine();

        itens.add(new Item(nome, tipo, bonus));
        System.out.println(ANSI_GREEN + "Item criado!" + ANSI_RESET);
    }

    private void listarItens() {
        if (itens.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Nenhum item cadastrado." + ANSI_RESET);
            return;
        }
        for (Item item : itens) {
            System.out.println(item);
            System.out.println("------------------------");
        }
    }

    private void atualizarItem() {
        System.out.print("Digite o nome do item para atualizar: ");
        String nome = scanner.nextLine();

        Item item = buscarItemPorNome(nome);
        if (item == null) {
            System.out.println(ANSI_RED + "Item não encontrado." + ANSI_RESET);
            return;
        }

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        item.setNome(novoNome);

        System.out.print("Novo tipo: ");
        String novoTipo = scanner.nextLine();
        item.setTipo(novoTipo);

        System.out.print("Novo bônus: ");
        int novoBonus = scanner.nextInt();
        scanner.nextLine();
        item.setBonus(novoBonus);

        System.out.println(ANSI_GREEN + "Item atualizado!" + ANSI_RESET);
    }

    private void deletarItem() {
        System.out.print("Digite o nome do item para deletar: ");
        String nome = scanner.nextLine();

        Item item = buscarItemPorNome(nome);
        if (item == null) {
            System.out.println(ANSI_RED + "Item não encontrado." + ANSI_RESET);
            return;
        }

        itens.remove(item);
        System.out.println(ANSI_GREEN + "Item deletado!" + ANSI_RESET);
    }

    private Item buscarItemPorNome(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
    // ---- MENUDEARMAS
    
    private void equiparArmaEmPersonagem() {
        if (personagens.isEmpty() || armas.isEmpty()) {
            System.out.println(ANSI_YELLOW + "É necessário ter pelo menos um personagem e uma arma criada." + ANSI_RESET);
            return;
        }

        System.out.println("\nEscolha o personagem:");
        for (int i = 0; i < personagens.size(); i++) {
            System.out.println((i + 1) + ". " + personagens.get(i).getNome());
        }
        int idxPersonagem = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idxPersonagem < 0 || idxPersonagem >= personagens.size()) {
            System.out.println(ANSI_RED + "Índice de personagem inválido." + ANSI_RESET);
            return;
        }

        Personagem p = personagens.get(idxPersonagem);

        System.out.println("\nEscolha a arma para equipar:");
        for (int i = 0; i < armas.size(); i++) {
            ClasseArma a = armas.get(i);
            System.out.println((i + 1) + ". " + a.getNomeArma() + " (" + a.getTipoArma() + ")");
        }
        int idxArma = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idxArma < 0 || idxArma >= armas.size()) {
            System.out.println(ANSI_RED + "Índice de arma inválido." + ANSI_RESET);
            return;
        }

        ClasseArma armaSelecionada = armas.get(idxArma);
        p.setArmaEquipada(armaSelecionada);

        System.out.println(ANSI_GREEN + "Arma equipada com sucesso no personagem " + p.getNome() + "!" + ANSI_RESET);
    }


    
  private void menuArmas() {
    int op;
    do {
        System.out.println(ANSI_BLUE + "\n--- MENU ARMAS ---" + ANSI_RESET);
        System.out.println("1. Criar Arma Física");
        System.out.println("2. Criar Arma Mágica");
        System.out.println("3. Listar Armas");
        System.out.println("4. Remover Arma");
        System.out.println("0. Voltar");
        System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

        op = scanner.nextInt();
        scanner.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("Nome da arma física: ");
                String nome = scanner.nextLine();
                System.out.print("Tipo da arma física: ");
                String tipo = scanner.nextLine();
                System.out.print("Tipo elemental: ");
                String elemental = scanner.nextLine();
                System.out.print("Dano base: ");
                int dano = scanner.nextInt();
                scanner.nextLine();
                armas.add(new ArmaFisica(nome, tipo, elemental, dano));
                System.out.println(ANSI_GREEN + "Arma física criada!" + ANSI_RESET);
            }
            case 2 -> {
                System.out.print("Nome da arma mágica: ");
                String nome = scanner.nextLine();
                System.out.print("Tipo da arma mágica: ");
                String tipo = scanner.nextLine();
                System.out.print("Tipo elemental: ");
                String elemental = scanner.nextLine();
                System.out.print("Dano base: ");
                int dano = scanner.nextInt();
                scanner.nextLine();
                armas.add(new ArmaMagica(nome, tipo, elemental, dano));
                System.out.println(ANSI_GREEN + "Arma mágica criada!" + ANSI_RESET);
            }
            case 3 -> {
                if (armas.isEmpty()) {
                    System.out.println(ANSI_YELLOW + "Nenhuma arma cadastrada." + ANSI_RESET);
                } else {
                    for (int i = 0; i < armas.size(); i++) {
                        ClasseArma a = armas.get(i);
                        String armanome = a.getNomeArma();
                        System.out.println((i + 1) + ". " + armanome);
                    }
                }
            }
            case 4 -> {
            	if (armas.isEmpty()) {
                    System.out.println(ANSI_YELLOW + "Nenhuma arma cadastrada para remover." + ANSI_RESET);
                } else {
                    System.out.println("\n=== ARMAS CADASTRADAS ===");
                    for (int i = 0; i < armas.size(); i++) {
                        ClasseArma a = armas.get(i);
                        System.out.println((i + 1) + ". " + a.getNomeArma() + " (" + a.getTipoArma() + ")");
                    }
                    
                    System.out.print("\nDigite o número da arma que deseja remover: ");
                    int idx = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if (idx >= 0 && idx < armas.size()) {
                        ClasseArma armaRemovida = armas.get(idx);
                        for (Personagem p : personagens) {
                            if (p.getArmaEquipada() != null && p.getArmaEquipada().equals(armaRemovida)) {
                                p.setArmaEquipada(null);
                            }
                        }
                        armas.remove(idx);
                        System.out.println(ANSI_GREEN + "Arma \"" + armaRemovida.getNomeArma() + "\" removida com sucesso!" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_RED + "ID inválido! Tente novamente." + ANSI_RESET);
                    }
                }
            }
            case 0 -> iniciar();
            default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
        }
    } while (op != 0);
}


 //--- EQUPAMENTOS
  
  private void equiparEquipamentoEmPersonagem() {
	    if (personagens.isEmpty() || equipamentos.isEmpty()) {
	        System.out.println(ANSI_YELLOW + "É necessário ter pelo menos um personagem e um equipamento criado." + ANSI_RESET);
	        return;
	    }

	    System.out.println("\nEscolha o personagem:");
	    for (int i = 0; i < personagens.size(); i++) {
	        System.out.println((i + 1) + ". " + personagens.get(i).getNome());
	    }
	    int idxPersonagem = scanner.nextInt() - 1;
	    scanner.nextLine();

	    if (idxPersonagem < 0 || idxPersonagem >= personagens.size()) {
	        System.out.println(ANSI_RED + "Índice de personagem inválido." + ANSI_RESET);
	        return;
	    }

	    Personagem p = personagens.get(idxPersonagem);

	    System.out.println("\nEscolha o equipamento para adicionar:");
	    for (int i = 0; i < equipamentos.size(); i++) {
	        equipamento e = equipamentos.get(i);
	        System.out.println((i + 1) + ". " + e.getNome() + " (" + e.getTipo() + ")");
	    }
	    int idxEquip = scanner.nextInt() - 1;
	    scanner.nextLine();

	    if (idxEquip < 0 || idxEquip >= equipamentos.size()) {
	        System.out.println(ANSI_RED + "Índice de equipamento inválido." + ANSI_RESET);
	        return;
	    }

	    equipamento equipSelecionado = equipamentos.get(idxEquip);
	    p.getEquipamentos().add(equipSelecionado);

	    System.out.println(ANSI_GREEN + "Equipamento adicionado ao personagem " + p.getNome() + "!" + ANSI_RESET);
	}
 
  
  
  
 private void menuEquipamentos() {
    int op;
    do {
        System.out.println(ANSI_BLUE + "\n--- MENU EQUIPAMENTOS ---" + ANSI_RESET);
        System.out.println("1. Criar Equipamento");
        System.out.println("2. Listar Equipamentos");
        System.out.println("3. Remover Equipamento");
        System.out.println("0. Voltar");
        System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

        op = scanner.nextInt();
        scanner.nextLine();

        switch (op) {
            case 1 -> {
                System.out.print("Nome do equipamento: ");
                String nome = scanner.nextLine();
                System.out.print("Tipo do equipamento: ");
                String tipo = scanner.nextLine();
                equipamentos.add(new equipamento(nome, tipo));
                System.out.println(ANSI_GREEN + "Equipamento criado!" + ANSI_RESET);
            }
            case 2 -> {
                if (equipamentos.isEmpty()) {
                    System.out.println(ANSI_YELLOW + "Nenhum equipamento cadastrado." + ANSI_RESET);
                } else {
                    for (int i = 0; i < equipamentos.size(); i++) {
                        equipamento e = equipamentos.get(i);
                        String equipamentonome = e.getNome();
                        System.out.println((i + 1) + ". " + equipamentonome + " (" + e.getTipo() + ")");
                    }
                }
            }
            case 3 -> {
            	if (equipamentos.isEmpty()) {
                    System.out.println(ANSI_YELLOW + "Nenhum equipamento cadastrado para remover." + ANSI_RESET);
                } else {
                
                    System.out.println("\n=== EQUIPAMENTOS CADASTRADOS ===");
                    for (int i = 0; i < equipamentos.size(); i++) {
                        equipamento e = equipamentos.get(i);
                        System.out.println((i + 1) + ". " + e.getNome() + " (" + e.getTipo() + ")");
                    }
                    
                    System.out.print("\nDigite o número do equipamento que deseja remover: ");
                    int idx = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if (idx >= 0 && idx < equipamentos.size()) {
                        equipamento equipRemovido = equipamentos.get(idx);
                       
                        for (Personagem p : personagens) {
                            p.getEquipamentos().remove(equipRemovido);
                        }
                        equipamentos.remove(idx);
                        System.out.println(ANSI_GREEN + "Equipamento \"" + equipRemovido.getNome() + "\" removido com sucesso!" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_RED + "ID inválido! Tente novamente." + ANSI_RESET);
                    }
                }
            }
            case 0 -> System.out.println("Voltando...");
            default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
        }

    } while (op != 0);
}
 
 private void desequiparItem() {
	    if (personagens.isEmpty()) {
	        System.out.println(ANSI_YELLOW + "Nenhum personagem cadastrado. Pressione Enter para voltar ao menu." + ANSI_RESET);
	        scanner.nextLine(); 
	        return; 
	    }

	    listarPersonagens(); 
	    System.out.print("Escolha o número do personagem ou 0 para voltar: ");
	    int indice = scanner.nextInt() - 1;
	    scanner.nextLine(); 

	    if (indice == -1) {
	        System.out.println("Voltando ao menu anterior...");
	        return; 
	    }

	    if (indice >= 0 && indice < personagens.size()) {
	        Personagem personagemEscolhido = personagens.get(indice);
	        
	        System.out.println("Desequipando itens de: " + personagemEscolhido.getNome());
	        
	        System.out.println("1. Desequipar Arma");
	        System.out.println("2. Desequipar Equipamento");
	        System.out.println("3. Desequipar Habilidade");
	        System.out.print("Escolha uma opção: ");
	        int opcao = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (opcao) {
	            case 1 -> personagemEscolhido.desequiparArma();
	            case 2 -> {
	                System.out.print("Nome do equipamento para desequipar: ");
	                String nomeEquip = scanner.nextLine();
	                personagemEscolhido.desequiparEquipamento(nomeEquip);
	            }
	            case 3 -> {
	                System.out.print("Nome da habilidade para desequipar: ");
	                String nomeHabilidade = scanner.nextLine();
	                personagemEscolhido.desequiparHabilidade(nomeHabilidade);
	            }
	            default -> System.out.println("Opção inválida.");
	        }
	    } else {
	        System.out.println("Personagem inválido.");
	    }
	}

 
 
 
    
    // --- MISSÃO ---
    private void criarMissao() {
        System.out.print("Título da missão: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Quem participará dessa missão?");
        int i = 1;
        for (Personagem y : personagens) {
            System.out.println(i + ". " + y.getNome());
            i++;
        }

        System.out.print("Digite o número do personagem escolhido: ");
        int indiceEscolhido = Integer.parseInt(scanner.nextLine()) - 1;

        if (indiceEscolhido >= 0 && indiceEscolhido < personagens.size()) {
            Personagem personagemEscolhido = personagens.get(indiceEscolhido);

            List<Personagem> grupo = new ArrayList<>();
            grupo.add(personagemEscolhido);

            missoes.add(new Missao(titulo, descricao, grupo));
            System.out.println(ANSI_GREEN + "Missão criada!" + ANSI_RESET);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void listarMissoes() {
        if (missoes.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Nenhuma missão cadastrada." + ANSI_RESET);
            return;
        }
        for (Missao m : missoes) {
            System.out.println(m);
            System.out.println("------------------------");
        }
    }

    private void atualizarMissao() {
        System.out.print("Digite o título da missão para atualizar: ");
        String titulo = scanner.nextLine();

        Missao m = buscarMissaoPorTitulo(titulo);
        if (m == null) {
            System.out.println(ANSI_RED + "Missão não encontrada." + ANSI_RESET);
            return;
        }

        System.out.print("Novo título: ");
        String novoTitulo = scanner.nextLine();
        m.setTitulo(novoTitulo);

        System.out.print("Nova descrição: ");
        String novaDescricao = scanner.nextLine();
        m.setDescricao(novaDescricao);

        System.out.println(ANSI_GREEN + "Missão atualizada!" + ANSI_RESET);
    }

    private void deletarMissao() {
        System.out.print("Digite o título da missão para deletar: ");
        String titulo = scanner.nextLine();

        Missao m = buscarMissaoPorTitulo(titulo);
        if (m == null) {
            System.out.println(ANSI_RED + "Missão não encontrada." + ANSI_RESET);
            return;
        }

        missoes.remove(m);
        System.out.println(ANSI_GREEN + "Missão deletada!" + ANSI_RESET);
    }

    private Missao buscarMissaoPorTitulo(String titulo) {
        for (Missao m : missoes) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }
    private void realizarAtaque(Personagem p, Inimigo i) {
        System.out.println(ANSI_GREEN + p.getNome() + " ataca " + i.getNome() + "!" + ANSI_RESET);
        p.getClasse().atacar();

        int dano = p.getClasse().getAtaqueBase();
        int novaVida = i.getVida() - dano;
        i.setVida(novaVida);

        System.out.println(ANSI_YELLOW + "Dano causado: " + dano + ". Vida restante do inimigo: " + i.getVida() + ANSI_RESET);
    }

    private void realizarDefesa(Personagem p) {
        System.out.println(ANSI_GREEN + p.getNome() + " está se defendendo!" + ANSI_RESET);
        p.getClasse().defender();
    }

    private void realizarEsquiva(Personagem p) {
        System.out.println(ANSI_GREEN + p.getNome() + " tenta esquivar!" + ANSI_RESET);
        p.getClasse().esquivar();
    }
    
    private void menuHabilidades() 
    {
    int op;
    	
    do {
    	System.out.println(ANSI_BLUE + "\n--- MENU EQUIPAMENTOS ---" + ANSI_RESET);
        System.out.println("1. Criar Habilidade");
        System.out.println("2. Listar Habilidades");
        System.out.println("3. Remover Habilidades");
        System.out.println("0. Voltar");
        System.out.print(ANSI_GREEN + "Escolha: " + ANSI_RESET);

        op = scanner.nextInt();
        scanner.nextLine();
    	
        
        switch (op) {
        case 1 -> {
            System.out.print("Nome da habilidade: ");
            String nome = scanner.nextLine();
            System.out.print("Tipo da habilidade: ");
            String tipo = scanner.nextLine();
            habilidades.add(new Classehabilidade(nome, tipo));
            System.out.println(ANSI_GREEN + "Habilidade criada!" + ANSI_RESET);
        }
        case 2 -> {
            if (habilidades.isEmpty()) {
                System.out.println(ANSI_YELLOW + "Nenhuma habilidade cadastrada." + ANSI_RESET);
            } else {
                for (int i = 0; i < habilidades.size(); i++) {
                    Classehabilidade e = habilidades.get(i);
                    String habilidadenome = e.getNome();
                    System.out.println((i + 1) + ". " + habilidadenome + " (" + e.getTipo() + ")");
                }
            }
        }
        case 3 -> {
        	if (habilidades.isEmpty()) {
                System.out.println(ANSI_YELLOW + "Nenhuma habilidade cadastrada para remover." + ANSI_RESET);
            } else {
             
                System.out.println("\n=== HABILIDADES CADASTRADAS ===");
                for (int i = 0; i < habilidades.size(); i++) {
                    Classehabilidade h = habilidades.get(i);
                    System.out.println((i + 1) + ". " + h.getNome() + " (" + h.getTipo() + ")");
                }
                
                System.out.print("\nDigite o número da habilidade que deseja remover: ");
                int idx = scanner.nextInt() - 1;
                scanner.nextLine();
                if (idx >= 0 && idx < habilidades.size()) {
                    Classehabilidade habilidadeRemovida = habilidades.get(idx);
                   
                    for (Personagem p : personagens) {
                        p.removerHabilidade(habilidadeRemovida); 
                    }
                    habilidades.remove(idx);
                    System.out.println(ANSI_GREEN + "Habilidade \"" + habilidadeRemovida.getNome() + "\" removida com sucesso!" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + "ID inválido! Tente novamente." + ANSI_RESET);
                }
            }
        }
        case 0 -> System.out.println("Voltando...");
        default -> System.out.println(ANSI_RED + "Opção inválida." + ANSI_RESET);
    }
    	
    	
    	
    } while(op != 0);
    	
    }
    
    
    
    private void equiparHabilidadeEmPersonagem() {
        if (personagens.isEmpty() || habilidades.isEmpty()) {
            System.out.println(ANSI_YELLOW + "É necessário ter pelo menos um personagem e uma habilidade criada." + ANSI_RESET);
            return;
        }

        System.out.println("\nEscolha o personagem:");
        for (int i = 0; i < personagens.size(); i++) {
            System.out.println((i + 1) + ". " + personagens.get(i).getNome());
        }
        int idxPersonagem = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idxPersonagem < 0 || idxPersonagem >= personagens.size()) {
            System.out.println(ANSI_RED + "Índice de personagem inválido." + ANSI_RESET);
            return;
        }

        Personagem p = personagens.get(idxPersonagem);

        System.out.println("\nEscolha a habilidade para equipar:");
        for (int i = 0; i < habilidades.size(); i++) {
            Classehabilidade a = habilidades.get(i);
            System.out.println((i + 1) + ". " + a.getNome() + " (" + a.getTipo() + ")");
        }
        int idxArma = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idxArma < 0 || idxArma >= habilidades.size()) {
            System.out.println(ANSI_RED + "Índice de habilidade inválida." + ANSI_RESET);
            return;
        }

        Classehabilidade x = habilidades.get(idxArma);
        p.adicionarHabilidade(x);

        System.out.println(ANSI_GREEN + "habilidade equipada com sucesso no personagem " + p.getNome() + "!" + ANSI_RESET);
    }
    
    

    
    //Guildas
    
        public void menuGuildas() {
            int op;

            do {
                System.out.println("\n=== MENU DA GUILDA ===");
                System.out.println("1. Criar nova guilda");
                System.out.println("2. Exibir dados da guilda");
                System.out.println("3. Adicionar participante");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                op = scanner.nextInt();
                scanner.nextLine();

                switch (op) {
                    case 1:
                        criarGuilda();
                        break;
                    case 2:
                        exibirGuildas();
                        break;
                    case 3:
                        adicionarParticipante();
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while(op != 0);
        }

        private void criarGuilda() {
            System.out.print("Nome da guilda: ");
            String nome = scanner.nextLine();

            System.out.print("Capacidade máxima de membros: ");
            int capacidade = scanner.nextInt();
            scanner.nextLine();

            guildas.add(new guilda(nome, capacidade));
            System.out.println("Guilda criada com sucesso!");
        }
        
        

        private void exibirGuildas() {
            if (guildas == null || guildas.isEmpty()) {
                System.out.println("Nenhuma guilda foi criada ainda.");
                return;
            }

            System.out.println("\n--- LISTA DE GUILDAS ---");
            for (guilda g : guildas) {
                System.out.println("Nome: " + g.getNome());
                System.out.println("Capacidade: " + g.getMembrosAtuais() + "/" + g.getCapacidade());
                System.out.println("Membros:");
                if (g.getMembros() == null || g.getMembros().isEmpty()) {
                    System.out.println("  Nenhum membro cadastrado.");
                } else {
                    for (Personagem p : g.getMembros()) {
                        System.out.println("  - " + p.getNome());
                    }
                }
                System.out.println("----------------------");
            }
        }

				private void adicionarParticipante() {
				    if (guildas.isEmpty()) {
				        System.out.println("Nenhuma guilda criada. Crie uma guilda primeiro.");
				        return;
				    }
				    if (personagens.isEmpty()) {
				        System.out.println("Nenhum personagem cadastrado para adicionar.");
				        return;
				    }
				
				    System.out.println("Escolha a guilda para adicionar o personagem:");
				    for (int i = 0; i < guildas.size(); i++) {
				        System.out.println((i + 1) + ". " + guildas.get(i).getNome());
				    }
				    System.out.print("Digite o número da guilda: ");
				    int idxGuilda = -1;
				    try {
				        idxGuilda = Integer.parseInt(scanner.nextLine()) - 1;
				    } catch (NumberFormatException e) {
				        System.out.println("Entrada inválida.");
				        return;
				    }
				    if (idxGuilda < 0 || idxGuilda >= guildas.size()) {
				        System.out.println("Índice de guilda inválido.");
				        return;
				    }
				    guilda guildaSelecionada = guildas.get(idxGuilda);
				
				    System.out.println("Escolha o personagem para adicionar:");
				    for (int i = 0; i < personagens.size(); i++) {
				        System.out.println((i + 1) + ". " + personagens.get(i).getNome());
				    }
				    System.out.print("Digite o número do personagem: ");
				    int idxPersonagem = -1;
				    try {
				        idxPersonagem = Integer.parseInt(scanner.nextLine()) - 1;
				    } catch (NumberFormatException e) {
				        System.out.println("Entrada inválida.");
				        return;
				    }
				    if (idxPersonagem < 0 || idxPersonagem >= personagens.size()) {
				        System.out.println("Índice de personagem inválido.");
				        return;
				    }
				    Personagem personagemSelecionado = personagens.get(idxPersonagem);
				
				    guildaSelecionada.addParticipante(personagemSelecionado);
				    System.out.println("Personagem " + personagemSelecionado.getNome() + " adicionado à guilda " + guildaSelecionada.getNome() + "!");
				}
    }
  
    
    
