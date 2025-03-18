package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Organizacao {
    public static void main(String[] args) {}
    String endereço;
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

    public Organizacao(String nome, String endereco) {
        this.nome = nome;
    }

     String getNome() {
        return nome;
    }

     void setNome(String nome) {
        this.nome = nome;
    }



    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}

class ONG extends Organizacao {
    private String areaDeAtuacao;

    public ONG(String nome, String endereco, String areaDeAtuacao) {
        super(nome, endereco);
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public void exibirAreaDeAtuacao() {
        System.out.println("Área de Atuação: " + areaDeAtuacao);
    }
}

    class Empresa extends Organizacao {
    private String cnpj;

    public Empresa(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirCnpj() {
        System.out.println("CNPJ: " + cnpj);
    }
}

     public class ProjetoSustentavel {
         private String nome;
         private double orcamento;

         public ProjetoSustentavel(String nome, double orcamento) {
             this.nome = nome;
             this.orcamento = orcamento;
         }

         public String getNome() {
             return nome;
         }

         public void setNome(String nome) {
             this.nome = nome;
         }

         public double getOrcamento() {
             return orcamento;
         }

         public void setOrcamento(double orcamento) {
             this.orcamento = orcamento;
         }


         public abstract void exibirDetalhes();
     }

class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, double orcamento, int arvoresPlantadas) {
        super(nome, orcamento);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Projeto de Reflorestamento");
        System.out.println("Nome: " + getNome());
        System.out.println("Orçamento: " + getOrcamento());
        System.out.println("Árvores Plantadas: " + arvoresPlantadas);
    }
}

class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, double orcamento, double toneladasRecicladas) {
        super(nome, orcamento);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Projeto de Reciclagem");
        System.out.println("Nome: " + getNome());
        System.out.println("Orçamento: " + getOrcamento());
        System.out.println("Toneladas Recicladas: " + toneladasRecicladas);
    }
}

class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, double orcamento, double energiaGerada) {
        super(nome, orcamento);
        this.energiaGerada = energiaGerada;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Projeto de Energia Renovável");
        System.out.println("Nome: " + getNome());
        System.out.println("Orçamento: " + getOrcamento());
        System.out.println("Energia Gerada: " + energiaGerada + " kWh");
    }
}
