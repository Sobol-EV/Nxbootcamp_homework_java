package nx.bootcamp.homework5_2;

class Phone extends Product {
    private String maker;

    public Phone(String name, double price, String maker) {
        super(name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }
}

