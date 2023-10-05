package inmobiliaria;
public class Vivienda extends Inmueble {
    private int numHabitaciones;
    private int numBaños;

    public Vivienda(int id, int area, String direccion, int numHabitaciones, int numBaños) {
        super(id, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBanos(int numBaños) {
        this.numBaños = numBaños;
    }
}