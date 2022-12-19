import java.util.Scanner;
public class ColourSelection {

    public static void main(String[] args) {
        ColourSelection selectedColour = new ColourSelection();
        String result = ColourSelection.getSelectColour();
        System.out.println("Selected colour: " + result);
    }

    public static String getSelectColour(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (W-white, R-red, C-cyan, O-orange, G-gold, A-amber):");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "W":
                    return "WHITE";
                case "R":
                    return "RED";
                case "C":
                    return "CYAN";
                case "O":
                    return "ORANGE";
                case "G":
                    return "GOLD";
                case "A":
                    return "AMBER";
                default:
                    System.out.println("Wrong colour. Try again.");
            }
        }
    }
}
