package Classes;

public class Main {
    public static void main(String[] args) {
        ONG ong = new ONG("SOS Florestas", "Rua das Árvores, 100", "Proteção ambiental");
        ong.exibirInformacoes();
        ong.exibirAreaDeAtuacao();

        Empresa empresa = new Empresa("GreenTech", "Av. das Empresas, 500", "12.345.678/0001-90");
        empresa.exibirInformacoes();
        empresa.exibirCnpj();

        ProjetoSustentavel projetoReflorestamento = new ProjetoReflorestamento("Reflorestar Brasil", 500000, 10000);
        projetoReflorestamento.exibirDetalhes();

        ProjetoSustentavel projetoReciclagem = new ProjetoReciclagem("Recicla Já", 300000, 1500.5);
        projetoReciclagem.exibirDetalhes();

        ProjetoSustentavel projetoEnergiaRenovavel = new ProjetoEnergiaRenovavel("Energia Solar para Todos", 200000, 5000);
        projetoEnergiaRenovavel.exibirDetalhes();
    }
}