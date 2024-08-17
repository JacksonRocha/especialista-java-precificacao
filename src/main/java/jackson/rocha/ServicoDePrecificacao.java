package jackson.rocha;

public class ServicoDePrecificacao {
    public void definirPrecoVenda(Produto produto, double porcentualMargemLucro) {

        double precoVendaCalculado = produto.precoCusto * ((porcentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
