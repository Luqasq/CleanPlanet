package user;

public class Saviour {
    private final int id;
    private final String firstName;
    private final String lastName;

    public Saviour(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void selectPassMenu(String s) {
        System.out.println("Saviour : " + firstName + "" + lastName + " selected : " + s);
    }

    public void chooseMaterial(String s1) {
        System.out.println(" Saviour : " + firstName + "" + lastName + " selected : " + s1);
    }

    public void elonDoesWhatHeWants() {
        System.out.println(" Of course , the planet is mine ! ");
    }
}


