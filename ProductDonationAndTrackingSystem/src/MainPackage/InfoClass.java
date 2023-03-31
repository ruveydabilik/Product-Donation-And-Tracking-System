package MainPackage;

import Product.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InfoClass {

    public static ArrayList<Product> productList = new ArrayList<>();
    public static ArrayList<Food> foodList = new ArrayList<>();
    public static ArrayList<Clothes> clothesList = new ArrayList<>();
    public static ArrayList<Hygiene> hygieneList = new ArrayList<>();
    
    public static ArrayList<Product> tempProductList = new ArrayList<>();
    public static ArrayList<Food> tempFoodList = new ArrayList<>();
    public static ArrayList<Clothes> tempClothesList = new ArrayList<>();
    public static ArrayList<Hygiene> tempHygieneList = new ArrayList<>();

    public static void addFood(Food food) {
        foodList.add(foodList.size(), food);
        productList.add(productList.size(), food);
    }

    public static void addClothes(Clothes clothes) {
        clothesList.add(clothesList.size(), clothes);
        productList.add(productList.size(), clothes);
    }

    public static void addHygiene(Hygiene hygiene) {
        hygieneList.add(hygieneList.size(), hygiene);
        productList.add(productList.size(), hygiene);
    }
    //--------------------------------------------------
    public static void tempAddFood(Food food) {
        tempFoodList.add(tempFoodList.size(), food);
        tempProductList.add(tempProductList.size(), food);
    }

    public static void tempAddClothes(Clothes clothes) {
        tempClothesList.add(tempClothesList.size(), clothes);
        tempProductList.add(tempProductList.size(), clothes);
    }

    public static void tempAddHygiene(Hygiene hygiene) {
        tempHygieneList.add(tempHygieneList.size(), hygiene);
        tempProductList.add(tempProductList.size(), hygiene);
    }

    public static String displayAllProducts() {
        String s = "";
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            s += productList.get(i).toString();
        }
        return s;
    }

    public static String displayFoods() {
        String s = "";
        int size = foodList.size();
        for (int i = 0; i < size; i++) {
            s += foodList.get(i).toString();
        }
        return s;
    }

    public static String displayClothes() {
        String s = "";
        int size = clothesList.size();
        for (int i = 0; i < size; i++) {
            s += clothesList.get(i).toString();
        }
        return s;
    }

    public static String displayHygienes() {
        String s = "";
        int size = hygieneList.size();
        for (int i = 0; i < size; i++) {
            s += hygieneList.get(i).toString();
        }
        return s;
    }

    public static String search_city(String city) {
        int coat=0,top=0,pants=0,sleeping_bag=0,shoes=0,blanket=0;
        int mask=0,diaper=0,toothpaste=0,soap=0,shampoo=0,toilet_paper=0,cream=0;
        int tea=0,milk=0,pasta=0,oil=0,legumes=0,sugar=0,salt=0,flour=0,water=0,canned_food=0,baby_food=0;
        String s = "";
        
        int size = clothesList.size();
        Clothes clothes = null;
        for (int i = 0; i < size; i++) {
            clothes = clothesList.get(i);
            if(clothes.getCity().equals(city)) {
                if(clothes.getType().equals("Coat")) { coat++; }
                else if(clothes.getType().equals("Top")) { top++; }
                else if(clothes.getType().equals("Pants")) { pants++; }
                else if(clothes.getType().equals("Sleeping-bag")) { sleeping_bag++; }
                else if(clothes.getType().equals("Shoes")) { shoes++; }
                else if(clothes.getType().equals("Blanket")) { blanket++; }
            } 
        }
        
        int size2 = foodList.size();
        Food food = null;
        for (int i = 0; i < size2; i++) {
            food = foodList.get(i);
            if(food.getCity().equals(city)){
                if(food.getFood_type().equals("Tea")) { tea++; }
                else if(food.getFood_type().equals("Milk")) { milk++; }
                else if(food.getFood_type().equals("Pasta")) { pasta++; }
                else if(food.getFood_type().equals("Oil")) { oil++; }
                else if(food.getFood_type().equals("Legumes")) { legumes++; }
                else if(food.getFood_type().equals("Sugar")) { sugar++; }
                else if(food.getFood_type().equals("Salt")) { salt++; }
                else if(food.getFood_type().equals("Flour")) { flour++; }
                else if(food.getFood_type().equals("Water")) { water++; }
                else if(food.getFood_type().equals("Canned Food")) { canned_food++; }
                else if(food.getFood_type().equals("Baby Food")) { baby_food++; }
            }
        }
        
        int size3 = hygieneList.size();
        Hygiene hygiene = null;
        for (int i = 0; i < size3; i++) {
            hygiene = hygieneList.get(i);
            if(hygiene.getCity().equals(city)){
                if(hygiene.getH_category().equals("Mask")) { mask++; }
                else if(hygiene.getH_category().equals("Diaper")) { diaper++; }
                else if(hygiene.getH_category().equals("Toothpaste")) { toothpaste++; }
                else if(hygiene.getH_category().equals("Soap")) { soap++; }
                else if(hygiene.getH_category().equals("Shampoo")) { shampoo++; }
                else if(hygiene.getH_category().equals("Toilet Paper")) { toilet_paper++; }
                else if(hygiene.getH_category().equals("Cream")) { cream++; }
            }
        }
        
        s += "\nCoat: "+coat+"  Top: "+top+"\nPants: "+pants+"  Sleeping: "+sleeping_bag+"\nShoes: "+
                shoes+"   Blanket:"+blanket+"\n" +"\nTea: "+tea+"   Milk: " +milk+"\nPasta: "+pasta+
                "   Oil: "+oil+"\nLegumes: "+legumes+"  Sugar: "+sugar+"\nSalt: "+salt+"    Flour: "+
                flour+"\nWater: "+water+"   Canned Food: " +canned_food+"\nBaby Food: " +baby_food+
                "\n\nMask: "+mask+ "   Diaper: "+diaper+"\nToothpaste: "+toothpaste+"   Soap: "+soap+
                "\nShampoo: "+shampoo+"   Toilet Paper: "+toilet_paper+"\nCream: "+cream;
        return s;
    }

    public static void readFoodFile() throws IOException{
        String whole_line;
        String ar[];// 0 -->id, 1-->name, 2-->surname, 3-->city, 4-->expire sate, 5-->food type
        try {
            File file = new File("food.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                whole_line = input.nextLine();
                ar = whole_line.split(",");
                if(!checkId(Integer.parseInt(ar[0]),1)) {
                    Food food = new Food(ar[0], ar[1], ar[2], "", "Food", ar[3], ar[4], ar[5],1,1,1,1);
                    foodList.add(food);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readClothesFile() throws IOException{
        String whole_line;
        String ar[];// 0 -->id, 1-->name, 2-->surname, 3-->city, 4-->size, 5-->gender, 6-->durableness, 7-->type
        try{
            File file = new File("clothes.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                whole_line = input.nextLine();
                ar = whole_line.split(",");
                if(!checkId(Integer.parseInt(ar[0]),2)) {
                Clothes clothes = new Clothes(ar[0], ar[1], ar[2], "", "Clothes", ar[3], ar[4], ar[5], ar[6], ar[7], 1, 1, 1, 1);
                clothesList.add(clothes);
                }
            }
            input.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void readHygieneFile() throws IOException{
        String whole_line;
        String ar[];// 0 -->id, 1-->name, 2-->surname, 3-->city, 4-->category
        try{
            File file = new File("hygiene.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                whole_line = input.nextLine();
                ar = whole_line.split(",");
                if(!checkId(Integer.parseInt(ar[0]),3)) {
                Hygiene hygiene = new Hygiene(ar[0], ar[1], ar[2], "", "Hygiene", ar[3], ar[4], 1, 1, 1, 1);
                hygieneList.add(hygiene);
                }
            }
            input.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void readAllProductsFile() throws IOException{
        String whole_line;
        String ar[];// 0 -->id, 1-->name, 2-->surname, 3-->city, 4-->Main_Category
        Food food = null;
        Clothes clothes = null;
        Hygiene hygiene = null;
        try{
            File file = new File("allProducts.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                whole_line = input.nextLine();
                ar = whole_line.split(",");
                if(!checkId(Integer.parseInt(ar[0]),4)) {
                    if(ar[4].equals("Food")) {
                        food = new Food(ar[0], ar[1], ar[2], "", "Food", ar[3], "", "", 1, 1, 1, 1);
                        productList.add(food);
                    } else if(ar[4].equals("Clothes")) {
                        clothes = new Clothes(ar[0], ar[1], ar[2], "", "Clothes", ar[3], "", "", "", "", 1, 1, 1, 1);
                        productList.add(clothes);
                    } else if(ar[4].equals("Hygiene")) {
                        hygiene = new Hygiene(ar[0], ar[1], ar[2], "", "Hygiene", ar[3], "", 1, 1, 1, 1);
                        productList.add(hygiene);
                    }
                }
            }
            input.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void updateFoodList() {
        File file = new File("food.txt");
        if(!file.exists()) {
            try{
                file.createNewFile();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        try{
            FileWriter writer = new FileWriter(file);
            Food food = null;
            int size = foodList.size();
            for(int i=0; i<size; i++) {
                food = foodList.get(i);
                writer.write(food.getProduct_id()+","+food.getDonator_name()+","+food.getDonator_surname()+","+
                        food.getCity()+","+food.getExpire_date()+","+food.getFood_type()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(InfoClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateClothesList() {
        File file = new File("clothes.txt");
        if(!file.exists()) {
            try{
                file.createNewFile();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        try{
            FileWriter writer = new FileWriter(file);
            Clothes clothes = null;
            int size = clothesList.size();
            for(int i=0; i<size; i++) {
                clothes = clothesList.get(i);
                writer.write(clothes.getProduct_id()+"," + clothes.getDonator_name()+","+clothes.getDonator_surname()+","+
                        clothes.getCity()+","+clothes.getSize()+","+clothes.getGender()+","+clothes.getDurableness()+","+
                        clothes.getType()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(InfoClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateHygieneList() {
        File file = new File("hygiene.txt");
        if(!file.exists()) {
            try{
                file.createNewFile();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        try{
            FileWriter writer = new FileWriter(file);
            Hygiene hygiene = null;
            int size = hygieneList.size();
            for(int i=0; i<size; i++) {
                hygiene = hygieneList.get(i);
                writer.write(hygiene.getProduct_id()+","+hygiene.getDonator_name()+","+hygiene.getDonator_surname()+","+
                        hygiene.getCity()+","+hygiene.getCategory()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(InfoClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateAllProductsList() {
        File file = new File("allProducts.txt");
        if(!file.exists()) {
            try{
                file.createNewFile();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        try{
            FileWriter writer = new FileWriter(file);
            Product product = null;
            int size = productList.size();
            for(int i=0; i<size; i++) {
                product = productList.get(i);
                writer.write(product.getProduct_id()+","+product.getDonator_name()+","+product.getDonator_surname()+","+
                product.getCity()+","+product.getCategory()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(InfoClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean checkId(int id,int array_list_no) {
        Product product = null;
        
        if(array_list_no == 1) {
            int size1 = foodList.size();
            for(int i=0;i<size1; i++) {
                product = foodList.get(i);
                if(Integer.parseInt(product.getProduct_id()) == id) {
                    return true;
                }
            }
            return false;
        }
        else if(array_list_no == 2) {
            int size2 = clothesList.size();
            for(int i=0; i<size2; i++) {
                product = clothesList.get(i);
                if(Integer.parseInt(product.getProduct_id()) == id) {
                    return true;
                }
            }
            return false;
        }
        else if(array_list_no == 3) {
            int size3 = hygieneList.size();
            for(int i=0; i<size3; i++) {
                product = hygieneList.get(i);
                if (Integer.parseInt(product.getProduct_id()) == id) {
                    return true;
                }
            }
            return false;
        }
        
        else if(array_list_no == 4) {
            int size4 = productList.size();
            for(int i=0; i<size4; i++) {
                product = productList.get(i);
                if(Integer.parseInt(product.getProduct_id()) == id) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
