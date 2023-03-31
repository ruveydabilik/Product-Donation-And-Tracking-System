package TracePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Product.*;

public class TraceFood {

    public static void readFoodFile() {
        try {
            File file = new File("food.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String id = input.next();
                String name = input.next();
                String surname = input.next();
                String city = input.next();
                String expire_date = input.next();
                String food_type = input.next();

                Food food = new Food(id, name, surname, "", "", city, expire_date, food_type, 1, 1, 1, 1);
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
