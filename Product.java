public class Product {
    private String name;
    private String releaseDate;
    private String manufacturer;
    private String country;
    private double price;
    private String available;
    public Product(String name, String releaseDate, String manufacturer, String country, double price, String available) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.available = available;
    }
    public String toString() {
        return "Product{" + " name " + name + " releaseDate " + releaseDate + " manufacturer " + manufacturer + " country " + country + " price " + price + " available"  + available + '}';
    }

}
class Product1 {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung s25 Ultra", "1.03.2143", "Samsung Corp.", "Korea", 1999, "true");
        productsArray[1] = new Product("Samsung s27 Ultra", "12.03.2145", "Samsung Corp.", "Korea", 1999, "true");
        productsArray[2] = new Product("Samsung s29 Ultra", "27.05.2150", "Samsung Corp.", "Korea", 1999, "true");
        productsArray[3] = new Product("Samsung s31 Ultra", "7.02.2163", "Samsung Corp.", "Korea", 1999, "true");
        productsArray[4] = new Product("Samsung s31", "5.02.2164", "Samsung Corp.", "Korea", 1999, "true");
        for (Product product : productsArray) {
            System.out.println(product);
        }
    }
}