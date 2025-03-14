package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Organizacao {
    public static void main(String[] args) {}
    String nome;
    List<String> listaProjeto = new ArrayList<>();

    void adicionarProjeto(ProjetoSustentavel projeto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do projeto: ");
        nome = sc.nextLine();
    }

    void listarProjetos(){}
}
