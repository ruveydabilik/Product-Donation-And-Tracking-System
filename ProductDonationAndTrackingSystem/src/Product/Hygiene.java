
package Product;

import Volume.Volume;

public class Hygiene extends Product{
    private String h_category;
    private Volume vol;
    private static int totalHygiene = 0;
    
    public Hygiene(String product_id, String donator_name, String donator_surname, String donator_phone,
            String category, String city,String h_category, int width, int height,int length, double calculated_volume){
        super(product_id, donator_name, donator_surname, donator_phone, category, city);
        this.vol = new Volume(width, height, length);
        this.h_category = h_category;
        totalHygiene++;
    }

    public String getH_category() {
        return h_category;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getDonator_name() {
        return donator_name;
    }

    public String getDonator_surname() {
        return donator_surname;
    }

    public String getDonator_phone() {
        return donator_phone;
    }

    public String getCategory() {
        return category;
    }

    public String getCity() {
        return city;
    }

    public static int getTotalDonator() {
        return totalDonator;
    }

    
    @Override
    public String toString() {
        String s = "";
        s += super.toString() + vol.toString() + "\nCategory: " + h_category ;
        return s;
    }
}
