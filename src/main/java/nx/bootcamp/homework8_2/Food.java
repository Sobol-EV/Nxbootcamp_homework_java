package nx.bootcamp.homework7_2;

import java.util.Date;
class Food extends Product {
    private Date expirationDate;

    public Food(String name, double price, Date expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
