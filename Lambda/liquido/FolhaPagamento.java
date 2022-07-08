public class FolhaPagamento {
    public static double calcularLiquido(Funcionario employee, CalculadorDeSalario wageCalculator) {
        return wageCalculator.calcular(employee.getSalario());
    }
}
