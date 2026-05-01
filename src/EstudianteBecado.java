public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca){
        super(codigo, nombre, promedio, valorMatricula);
        this.porcentajeBeca=porcentajeBeca;
    }

    public double calcularPorcentajeBeca() {
        return setPorcentajeBeca(getPorcentajeBeca()) / 100 * getPromedio();
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula()-calcularPorcentajeBeca();
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public double setPorcentajeBeca(double porcentajeBeca) {
        if(porcentajeBeca>0 && porcentajeBeca<100){
            return porcentajeBeca/100;
        }else{
            System.out.println("Porcentaje de beca no admitido");
        }
        return 0;
    }
}
