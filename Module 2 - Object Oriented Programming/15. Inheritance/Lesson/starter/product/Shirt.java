package product;

public class Shirt extends Product {


    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt.Size getSize() {
        return this.size;
    }

    public void setSize(Shirt.Size size) {
        this.size = size;
    }


}
