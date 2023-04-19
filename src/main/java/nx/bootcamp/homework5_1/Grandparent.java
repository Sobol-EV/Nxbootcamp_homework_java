package nx.bootcamp.homework5_1;

class Grandparent {
    private String name;
    private int age;

    public Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void printAge() {
        System.out.println("I am " + age + " years old");
    }

    public void printWhoAreYou() {
        System.out.println("I am Grandparent, " + name);
    }
}
