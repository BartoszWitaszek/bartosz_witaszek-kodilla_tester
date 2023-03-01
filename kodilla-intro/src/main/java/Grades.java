public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public static void main(String[] args) {
        Grades gradebook = new Grades();
        gradebook.add(5);
        gradebook.add(6);
        gradebook.add(4);
        gradebook.add(4);
        gradebook.add(3);
        System.out.println("Last grade: " + gradebook.lastOne());
        System.out.println("Average of grades: " + gradebook.averageGrade());
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastOne() {
        return (this.grades[this.size - 1]);
    }

    public double averageGrade() {
        double sum = 0.0;
        for (int i = 0; i < this.size; i++) {
            sum += grades[i];
        }
        System.out.println("Sum of grades: " + sum);
        System.out.println("Number of grades: " + size);
        return sum / size;
    }
}
