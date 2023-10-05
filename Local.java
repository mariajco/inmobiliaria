public class Local extends Inmueble {
    private String localizacion;

    public Local(int id, int area, String direccion, String localizacion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}