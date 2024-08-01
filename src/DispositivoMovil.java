public class DispositivoMovil extends DispositivoElectronico {
    private String sistemaOperativo;
    private int capacidadBateria;

    public DispositivoMovil(String marca, String modelo, double precio, String sistemaOperativo, int capacidadBateria) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadBateria = capacidadBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return " DispositivoMovil " +
                " Marca ='" + getMarca() + '\'' +
                ", Modelo ='" + getModelo() + '\'' +
                ", Precio = $" + getPrecio() +
                ", Sistema Operativo ='" + sistemaOperativo + '\'' +
                ", Capacidad Batería =" + capacidadBateria + "mAh" +
                ' ';
    }
}
