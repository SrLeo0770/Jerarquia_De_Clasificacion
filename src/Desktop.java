public class Desktop extends DispositivoElectronico {
    private String componentes;

    public Desktop(String marca, String modelo, double precio, String componentes) {
        super(marca, modelo, precio);
        this.componentes = componentes;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return " Desktop " +
                " marca ='" + getMarca() + '\'' +
                ", modelo ='" + getModelo() + '\'' +
                ", precio =" + getPrecio() +
                ", componentes ='" + componentes + '\'' +
                '}';
    }
}
