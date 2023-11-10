public class Daniil1 extends Student1{

    private double weight;
    private double height;

    public Daniil1(String name, int age, double weight, double height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
