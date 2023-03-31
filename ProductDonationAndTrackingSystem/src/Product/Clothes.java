
package Product;

import Volume.Volume;
import Wearable.Wearable;

public class Clothes extends Product implements Wearable{
    private String size;
    private String gender;
    private String durableness;
    private String type;
    private Volume vol;
    private static int totalClothes = 0;
    
    public Clothes(String product_id, String donator_name, String donator_surname, String donator_phone,
            String category, String city,String size,String gender,String durableness, String type,int width, int height,
            int length, double calculated_volume){
        super(product_id, donator_name, donator_surname, donator_phone, category, city);
        this.size = size;
        this.gender = gender;
        this.durableness = durableness;
        this.type = type;
        this.vol = new Volume(width, height, length);
        totalClothes++;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public String getDurableness() {
        return durableness;
    }

    public String getType() {
        return type;
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
    public String who_can_wear(){
        if(gender == "Man") {
            return "Man is selected.";
        }
        else if(gender == "Woman") {
            return "Woman is selected.";
        }
        else {
            return "Kids is selected.";
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        s += super.toString() + vol.toString() + "\nSize: " + size + "\nGender: " + gender + 
                "\nDurableness: " + durableness + "\nType: " + type;
        return s;
    }
}
