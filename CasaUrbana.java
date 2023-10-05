package inmobiliaria;
public class CasaUrbana extends Casa {
  
    private boolean esConjuntoCerrado;
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public CasaUrbana(int idInmobiliario, int areaMetrosCuadrados, String direccion,
                      int numHabitaciones, int numBanos, int numPisos,
                      boolean esConjuntoCerrado, double valorAdministracion, boolean tieneAreasComunes) {
        super(idInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
        this.esConjuntoCerrado = esConjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    public boolean isEsConjuntoCerrado() {
        return esConjuntoCerrado;
    }

    public void setEsConjuntoCerrado(boolean esConjuntoCerrado) {
        this.esConjuntoCerrado = esConjuntoCerrado;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isTieneAreasComunes() {
        return tieneAreasComunes;
    }

    public void setTieneAreasComunes(boolean tieneAreasComunes) {
        this.tieneAreasComunes = tieneAreasComunes;
    }
}