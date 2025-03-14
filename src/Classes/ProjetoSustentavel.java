package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoSustentavel {
    public static void main(String[] args) {}
    String nome;
    String descricao;
    List<String> voluntarios = new ArrayList<>();
    List<String> relatorioImpacto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void adicionarVoluntario(Voluntarios voluntario) {
        voluntarios.add(voluntario.toString());
    }

    void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2){
        arvoresPlantadas = sc.nextInt();
        reducaoCO2 = sc.nextDouble();
    }
}
