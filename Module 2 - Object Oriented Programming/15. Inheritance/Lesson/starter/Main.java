import product.Pants;
import product.Shirt;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setSize(Shirt.Size.SMALL);
        shirt.setBrand("Nike");
        shirt.setPrice(3.99);
        shirt.setColor("blue");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(32);
        pants.setLength(33);
        pants.setColor("black");
        pants.setPrice(45.00);
        pants.setBrand("Levi's");
        pants.fold();
    }

}
