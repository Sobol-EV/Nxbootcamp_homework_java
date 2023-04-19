package nx.bootcamp.homework5_1;

public class Main {
    public static void main(String[] args) {
        Grandparent grandparent = new Grandparent("John", 70);
        Parent parent = new Parent("Mike", 50);
        Child child = new Child("Kate", 10);

        grandparent.printAge();
        grandparent.printWhoAreYou();

        parent.printAge();
        parent.printWhoAreYou();

        child.printAge();
        child.printWhoAreYou();
        child.laugh();
    }
}
