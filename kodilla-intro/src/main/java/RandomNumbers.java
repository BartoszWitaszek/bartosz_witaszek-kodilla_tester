import java.util.Random;
public class RandomNumbers {
    Random random = new Random();

    private int min;
    private int max;
    int maximum = 5000;

    public static void main(String[] args) {
        RandomNumbers draw = new RandomNumbers();
        draw.drawNumbers();
        System.out.println("Min: " + draw.getMin());
        System.out.println("Max: " + draw.getMax());
    }

    public void drawNumbers() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < maximum) {
            temp = random.nextInt(31);
            sum += temp;

            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
        }
    }
    public int getMax(){
        return this.max;
    }

    public int getMin(){
        return this.min;
    }
}
