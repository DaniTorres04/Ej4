public class MainPintura {
    public static void main(String[] args){
        Pintura pint = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 20, 35);
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        Esfera esfera = new Esfera("Esfera", 15);
        System.out.println(pint.CantidadPintura(cilindro));
        System.out.println(pint.CantidadPintura(rectangulo));
        System.out.println(pint.CantidadPintura(esfera));
    }
}
