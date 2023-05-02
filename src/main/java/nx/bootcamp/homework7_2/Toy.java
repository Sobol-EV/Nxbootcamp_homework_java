package nx.bootcamp.homework7_2;

class Toy extends Product {
    private int ageLimit;

    public Toy(String name, double price, int ageLimit) {
        super(name, price);
        this.ageLimit = ageLimit;
    }

    public int getAgeLimit() {
        return ageLimit;
    }
}
