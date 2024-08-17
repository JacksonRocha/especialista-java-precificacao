package jackson.rocha;

public class Principal {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();
        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoPrecificacao = new ServicoDePrecificacao();
        servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f\n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }
}
