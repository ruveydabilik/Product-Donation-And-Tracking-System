
package Product;

public abstract class Product {
    protected String product_id;
    protected String donator_name;
    protected String donator_surname;
    protected String donator_phone;
    protected String category;
    protected String city;
    protected static int totalDonator = 0;
    
    public Product(String product_id, String donator_name, String donator_surname, String donator_phone,
            String category, String city){
        this.product_id = product_id;
        this.donator_name = donator_name;
        this.donator_surname = donator_surname;
        this.donator_phone = donator_phone;
        this.category = category;
        this.city = city;
        totalDonator++;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getCity() {
        return city;
    }

    public static int getTotalDonator() {
        return totalDonator;
    }

    public String getCategory() {
        return category;
    }

    public String getDonator_name() {
        return donator_name;
    }

    public String getDonator_surname() {
        return donator_surname;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Product ID: " + product_id + "\nDONATOR:\nName: " + donator_name + "\nSurname: " + donator_surname +
                "\nPhone: " + donator_phone + "\nCategory: " + category + "\nCity: " + city;
        return s;
    }
}
