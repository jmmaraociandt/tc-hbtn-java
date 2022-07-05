package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 1000.0)
            return frete = new Frete(valor*0.1, obterTipoProvedorFrete());
        return frete = new Frete(valor*0.05, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
