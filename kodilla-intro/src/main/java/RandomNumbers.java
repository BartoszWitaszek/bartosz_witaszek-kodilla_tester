import java.util.Random;
public class RandomNumbers {
    Random random = new Random();

    private int min;
    private int max;
    int maximum = 5000;

    public static void main(String[] args) {
        RandomNumbers draw = new RandomNumbers();
        draw.drawNumbers();
    }

    public void drawNumbers() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < maximum) {
            temp = random.nextInt(31);
            sum += temp;

            System.out.println(getMax(temp));
            System.out.println(getMin(temp));
        }
    }
    public int getMax(int temp){
        if (temp > this.max) {
            this.max = temp;
        }
        return this.max;
    }

    public int getMin(int temp){
        if (temp < this.min) {
            this.min = temp;
        }
        return this.min;
    }
}
