package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 2000.0)
            return frete = new Frete(valor*0.07, obterTipoProvedorFrete());
        return frete = new Frete(valor*0.045, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
