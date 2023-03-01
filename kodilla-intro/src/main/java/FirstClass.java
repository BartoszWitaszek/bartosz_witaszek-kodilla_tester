public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        Notebook oldNotebook = new Notebook(1600, 500, 2000);

        notebookParameters("Notebook weight: ", notebook);
        notebookParameters("Heavy notebook weight: ", heavyNotebook);
        notebookParameters("Old notebook weight: ", oldNotebook);
    }

    private static void notebookParameters(String x, Notebook notebook) {
        System.out.println(x + notebook.weight + " , price: " + notebook.price + " , year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}