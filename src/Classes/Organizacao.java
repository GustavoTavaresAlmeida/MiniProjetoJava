package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Organizacao {
    public static void main(String[] args) {}
    String nome;
    List<String> listaProjeto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void adicionarProjeto(ProjetoSustentavel Projeto) {
        nome = sc.nextLine();
        listaProjeto.add(nome);
    }

    void listarProjetos(){
        System.out.println("Lista de Projetos \n" + nome);
    }
}
