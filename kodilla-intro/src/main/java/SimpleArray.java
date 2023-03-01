public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String[] {"kot dachowiec", "jamnik", "gekon", "zaskroniec", "sikorka"};

        String animal = animals [2];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}
