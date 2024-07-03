public class Vehiculo {
    private String modelo;
    private String marca;
    private int anioFabricacion;

    public Vehiculo(String modelo, String marca, int anioFabricacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo() {

    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
}


