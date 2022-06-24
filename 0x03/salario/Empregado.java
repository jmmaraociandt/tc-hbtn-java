public class Empregado {
    protected double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus (Departamento departamento) {
        if (departamento.alcancouMeta())
            return 0.1*salarioFixo;
        return 0.0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
//        if (departamento.alcancouMeta())
//            return 1.1*salarioFixo;
//        return salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
