public class Pintura {
    private double cobertura;

    public Pintura(double cobertura){
        this.cobertura = cobertura;
    }
    public double CantidadPintura(Forma ob){
        return ob.getArea() / cobertura;
    }
}
