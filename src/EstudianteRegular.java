public class EstudianteRegular extends Estudiante{
    private int numeroMaterias;


    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias){
        super(codigo, nombre, promedio, valorMatricula);
        this.numeroMaterias=numeroMaterias;
    }

    public double setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            return numeroMaterias * 10;
        } else {
            System.out.println("Número de materias no aceptado");
        }
        return 0;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + setNumeroMaterias(getNumeroMaterias());
    }




}
