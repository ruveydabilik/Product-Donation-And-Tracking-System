
package Volume;

public class Volume {
    private int width;
    private int height;
    private int length;
    private double calculated_volume;
    
    public Volume(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.calculated_volume = (width*height*length)/1000;
    }

    public double getCalculated_volume() {
        return calculated_volume;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nPackage Volume: " + calculated_volume;
        return s;
    }
    
    
}
