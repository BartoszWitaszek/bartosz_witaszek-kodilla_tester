public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String[] args) {
        User arek = new User("Arek", 21);
        User barbara = new User("Barbara", 35);
        User celina = new User("Celina", 55);
        User daniel = new User("Daniel", 14);
        User eugeniusz = new User("Eugeniusz", 17);
        User franek = new User("Franek", 50);

        User[] users = {arek, barbara, celina, daniel, eugeniusz, franek};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        System.out.println("Imiona użytkowników z wiekiem poniżej średniej:");
        for (int i = 0; i < users.length; i++){
            if (users[i].getAge() < sum/users.length){
                System.out.println(users[i].getName());
            }
        }
    }
     public int getAge(){
        return userAge;
     }
     public String getName(){
        return userName;
     }
}
