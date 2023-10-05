package inmobiliaria;
public class CasaRural extends Casa {
    private int distanciaCabeceraMunicipal;
    private int altitudSobreNivelMar;

    public CasaRural(int idInmobiliario, int areaMetrosCuadrados, String direccion,
                     int numHabitaciones, int numBanos, int numPisos,
                     int distanciaCabeceraMunicipal, int altitudSobreNivelMar) {
        super(idInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }

    
    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public int getAltitudSobreNivelMar() {
        return altitudSobreNivelMar;
    }

    public void setAltitudSobreNivelMar(int altitudSobreNivelMar) {
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }
}