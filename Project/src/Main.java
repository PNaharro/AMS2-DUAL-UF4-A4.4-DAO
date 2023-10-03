import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Nevera nevera = new Nevera();
        nevera.nom = "nev";
        nevera.color = "red";
        nevera.eficienci = "alta";
        nevera.marca = "red";
        nevera.preu = 201;
        nevera.soroll = 10;
        nevera.frigories = 20;
        llista.add(nevera);

        Forn forn  = new Forn();
        forn.nom = "forn";
        forn.color = "red";
        forn.eficienci = "alta";
        forn.marca = "red";
        forn.preu = 190;
        forn.temperatura = 9;
        forn.autoneteja = 19;
        llista.add(forn);

        Rentadora rentadora  = new Rentadora();
        rentadora.nom = "rent";
        rentadora.color = "red";
        rentadora.eficienci = "alta";
        rentadora.marca = "red";
        rentadora.preu = 100;
        rentadora.soroll = 11;
        rentadora.revolucions = 22;
        llista.add(rentadora);



        Rentadora anotherRentadora = (Rentadora) rentadora.clone();
        llista.add(anotherRentadora);
        Nevera anotherNevera = (Nevera) nevera.clone();
        llista.add(anotherNevera);
        Forn anotherForn = (Forn) forn.clone();
        llista.add(anotherForn);
        
        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els poligons són el mateix objecte");
        } else {
            System.out.print(i + ": Els poligons són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els poligons són idèntics");
            } else {
                System.out.println(i + ": Els poligons NO són identics");
            }
        }
    }
}
