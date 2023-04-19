package nx.bootcamp.homework5_1;

class Child extends Parent {
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void printWhoAreYou() {
        System.out.println("I am Child, " + super.getName());
    }

    public void laugh() {
        System.out.println("ha-ha-ha!");
    }
}
