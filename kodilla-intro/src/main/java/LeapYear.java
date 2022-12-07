public class LeapYear {
    public static void main(String[] args) {
        int year = 1700;

        System.out.println(year);

         boolean leapYear = isLeapYear (year);
         if (leapYear)
         {
             System.out.println("Wybrany przez nas rok jest przestępny.");
         }
         else System.out.println("Wybrany przez nas rok nie jest przestępny.");

    }

    private static boolean isLeapYear(int year) {
        boolean leapYear1;
        if (year%4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear1 = true;
                } else leapYear1 = false;
            } else leapYear1 = true;
        }
        else leapYear1 = false;

        return leapYear1;
    }
}

