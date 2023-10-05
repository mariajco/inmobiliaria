package inmobiliaria;
public class Casa extends Vivienda {
    private int numPisos;
    private int distanciaCabeceraMunicipal;
    private int altitud;

    public Casa(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCabeceraMunicipal, int altitud) {
        super(id, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitud = altitud;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
     public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }
}



