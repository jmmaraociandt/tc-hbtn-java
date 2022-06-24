public class Gerente extends Empregado {
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta())
            return 0.2*salarioFixo + 0.01*(departamento.getValorAtingidoMeta() - departamento.getValorMeta());
        return 0.0;
    }
}
