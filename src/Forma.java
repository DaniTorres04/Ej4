public class Forma {
    private String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }

    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
class Esfera extends Forma {
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * (radio * radio);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}


class Rectangulo extends Forma{
    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }
}
class Cilindro extends Forma{
    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * (radio * radio) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }
}


