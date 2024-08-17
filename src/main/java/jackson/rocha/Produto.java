package jackson.rocha;

public class Produto {

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void alterarPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
