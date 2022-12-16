public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println("Notebook weight: " + notebook.weight + " , price: " + notebook.price + " , year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println("Heavy notebook weight: " + heavyNotebook.weight + " , price: " + heavyNotebook.price + " , year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println("Old notebook weight: " + oldNotebook.weight + " , price: " + oldNotebook.price + " , year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
}
