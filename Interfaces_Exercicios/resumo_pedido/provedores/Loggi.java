package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 5000.0)
            return frete = new Frete(valor*0.12, obterTipoProvedorFrete());
        return frete = new Frete(valor*0.04, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
