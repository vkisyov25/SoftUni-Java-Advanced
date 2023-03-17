package SerializeCustomObject;

import java.io.Serializable;

public class Cube implements Serializable {
    String color;
    double wigth ;
    double height;
    double depth;

    public Cube(String color, double wigth, double height, double depth) {
        this.color = color;
        this.wigth = wigth;
        this.height = height;
        this.depth = depth;
    }
}
