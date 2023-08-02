package DemostraciónDeJerarquía;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Mamiferos> mamiferolist = new ArrayList();

    public static void main(String[] args) {
      /*
        Este código representa un programa en Java que demuestra el uso de una 
        jerarquía de clases para diferentes mamíferos. La clase principal "Main" 
        contiene una lista de objetos "Mamiferos" llamada "mamiferolist". Luego,
        crea instanciase diferentes clases de mamíferos como Cachorro, León, Oso, Gato, Caballo 
        y Tigre, y los agrega a la lista.
        */
        Cachorro mamifero1 = new Cachorro();

        mamifero1.nome("Perro");
        mamifero1.Som();
        mamiferolist.add(mamifero1);

        Leon mamifero2 = new Leon();

        mamifero2.nome("Lion ");
        mamifero2.Som();
        mamiferolist.add(mamifero2);

        Oso mamifero3 = new Oso();

        mamifero3.nome("Urso ");
        mamifero3.Som();
        mamiferolist.add(mamifero3);

        Gato mamifero4 = new Gato();

        mamifero4.nome("Gato ");
        mamifero4.Som();
        mamiferolist.add(mamifero4);

        Caballo mamifero5 = new Caballo();

        mamifero5.nome("Caballo ");
        mamifero5.Som();
        mamiferolist.add(mamifero5);

        Tigre mamifero6 = new Tigre();

        mamifero6.nome("Pintado ");
        mamifero6.Som();
        mamiferolist.add(mamifero6);

        for (Mamiferos s : mamiferolist) {

            System.out.println("O animal que faz o som:" + s.Som() + " e " + s.getNomeEspecie());
        }

    }
}
