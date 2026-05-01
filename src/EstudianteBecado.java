public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio,
                            double valorMatricula, double porcentajeBeca) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("Porcentaje de beca inválido");
        }
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public double calcularDescuento() {
        return getValorMatricula() * (porcentajeBeca / 100);
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() - calcularDescuento();
    }
}