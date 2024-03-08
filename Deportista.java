// Archivo Deportista.java

public class Deportista extends Persona {
    private String tipoDeporte;

    public Deportista(String nombre, int edad, String genero, String tipoDeporte) {
        super(nombre, edad, genero);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
}
