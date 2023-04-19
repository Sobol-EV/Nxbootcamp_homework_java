package nx.bootcamp.homework5_1;

class Parent extends Grandparent {
    public Parent(String name, int age) {
        super(name, age);
    }

    @Override
    public void printWhoAreYou() {
        System.out.println("I am Parent, " + super.getName());
    }
}
