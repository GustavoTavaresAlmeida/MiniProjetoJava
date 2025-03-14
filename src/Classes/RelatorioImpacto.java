package Classes;

import java.util.Scanner;

public class RelatorioImpacto {
    public static void main(String[] args) {}
    int arvoresPlantadas;
    double reducaoCO2;
    String relatorio;
    Scanner sc = new Scanner(System.in);

    void exibirRelatorio(){
        relatorio = sc.nextLine();
        System.out.println("Este é o relatório entregue: \n" + relatorio);
    }
}
