package CarSalesman;


public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";

    }

//    public Car(String model,Engine engine, String color) {
//        this.model = model;
//        this.engine = engine;
//        this.weight = "n/a";
//        this.color = color;
//
//    }


    //TODO May be have to make constructor
//    public Car(String model, Engine engine, String weight) {
//        this.model = model;
//        this.engine = engine;
//        this.weight = weight;
//        this.color = "n/a";
//
//    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:\n %s: \nPower: %.0f \nDisplacement: %s " +
                "\nEfficiency: %s " +
                "\nWeight: %s" +
                " \nColor: %s",getModel(),getEngine().getModel(),getEngine().getPower(),getEngine().getDisplacement(),getEngine().getEfficiency(),getWeight(),getColor());
    }
}
