public class EXP {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.pcode = "car123";
        p1.pname = "Benz";
        p1.price = 100000;

        System.out.println("\n**********Displaying p1***************");
        p1.display();

        Product p2 = new Product("Jaguar", "car426", 250000);
        System.out.println("\n**********Displaying p2***************");
        p2.display();

        Product p3 = new Product("Maruthi", "car800", 550000);
        System.out.println("\n**********Displaying p3***************");
        p3.display();

        Product lowestPriceProduct = (p3.getprice() < (p1.price < p2.price ? p1.price : p2.price)) ? p3
                : (p1.price < p2.price ? p1 : p2);
        System.out.println("\n**********Displaying product with lowest price***************");
        lowestPriceProduct.display();
    }
}

class Product {
    String pname, pcode;
    int price;

    public Product() {
    }

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public String getpname() {
        return pname;
    }

    public void setpname(String pname) {
        this.pname = pname;
    }

    public String getpcode() {
        return pcode;
    }

    public void setpcode(String pcode) {
        this.pcode = pcode;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price);
    }
}
