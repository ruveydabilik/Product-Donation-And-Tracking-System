
package Product;

import Volume.Volume;

public class Food extends Product{
    private String expire_date;
    private String food_type;
    private Volume vol;
    private static int totalFood = 0;
    
    public Food(String product_id, String donator_name, String donator_surname, String donator_phone,
            String category, String city, String expire_date,String food_type,int width, int height,int length, double calculated_volume){
        super(product_id, donator_name, donator_surname, donator_phone, category, city);
        this.expire_date = expire_date;
        this.vol = new Volume(width, height, length);
        this.food_type = food_type;
        totalFood++;
    }

    public String getExpire_date() {
        return expire_date;
    }

    public String getFood_type() {
        return food_type;
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
        s += super.toString() + vol.toString() + "\nExpire date: " + expire_date + "\nFood type: " + food_type ;
        return s;
    }
}
