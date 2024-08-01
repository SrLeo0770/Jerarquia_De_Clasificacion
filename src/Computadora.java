public class Computadora extends DispositivoElectronico {
    private String procesador;
    private int memoriaRam;

    public Computadora(String marca, String modelo, double precio, String procesador, int memoriaRam) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return " Computadora " +
                " marca ='" + getMarca() + '\'' +
                ", modelo ='" + getModelo() + '\'' +
                ", precio =" + getPrecio() +
                ", procesador ='" + procesador + '\'' +
                ", memoriaRam =" + memoriaRam +
                ' ';
    }
}
