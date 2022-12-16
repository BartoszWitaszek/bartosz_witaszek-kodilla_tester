public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        }
        else System.out.println("This notebook is expensive.");
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1400) {
            System.out.println("The price is not too heavy.");
        }
        else System.out.println("This notebook is very heavy.");
    }

    public void checkYear() {
        if (this.price <= 600 && this.year <= 2009) {
            System.out.println("This Notebook is old and cheap.");
        } else if (this.price <= 1000 && this.year <=2018) {
            System.out.println("This notebook is pretty new and in good price.");
        }
        else System.out.println("This notebook is new and quite expensive.");
    }
}
