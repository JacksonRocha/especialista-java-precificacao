package jackson.rocha;

public class ServicoDePrecificacao {
    public void definirPrecoVenda(Produto produto, double porcentualMargemLucro) {

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, porcentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
