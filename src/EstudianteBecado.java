public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca){
        super(codigo, nombre, promedio, valorMatricula);
        this.porcentajeBeca=porcentajeBeca;
    }

    public double calcularPorcentajeBeca() {
        return getPorcentajeBeca() * getPromedio();
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula()-calcularPorcentajeBeca();
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca/100;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if(porcentajeBeca>0 && porcentajeBeca<100){
            this.porcentajeBeca=porcentajeBeca;
        }else{
            System.out.println("Porcentaje de beca no admitido");
        }
    }


}
