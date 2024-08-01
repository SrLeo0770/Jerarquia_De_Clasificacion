public class Electrodomestico extends DispositivoElectronico {
    private int capacidad;
    private String tipoEnergia;

    public Electrodomestico(String marca, String modelo, double precio, int capacidad, String tipoEnergia) {
        super(marca, modelo, precio);
        this.capacidad = capacidad;
        this.tipoEnergia = tipoEnergia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    @Override
    public String toString() {
        return " Electrodomestico " +
                " marca ='" + getMarca() + '\'' +
                ", modelo ='" + getModelo() + '\'' +
                ", precio =" + getPrecio() +
                ", capacidad =" + capacidad +
                ", tipoEnergia ='" + tipoEnergia + '\'' +
                ' ';
    }
}
