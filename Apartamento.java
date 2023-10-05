package inmobiliaria;

public class Apartamento extends Vivienda {
    private boolean esApartaestudio;
    private double valorAdministracion;

    public Apartamento(int id, int area, String direccion, int numHabitaciones, int numBaños,
                       boolean esApartaestudio, double valorAdministracion) {
        super(id, area, direccion, numHabitaciones, numBaños);
        this.esApartaestudio = esApartaestudio;
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isEsApartaestudio() {
        return esApartaestudio;
    }

    public void setEsApartaestudio(boolean esApartaestudio) {
        this.esApartaestudio = esApartaestudio;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}
