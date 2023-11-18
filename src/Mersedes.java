public class Mersedes extends Car{
    private String ff;
    public Mersedes(String model, String colour, int maxSpeed, String ff) {
        super(model, colour, maxSpeed);
        this.ff=ff;
    }

    @Override
    public void gas() {
        System.out.println(getModel() + "'s gas is 5 k/s.");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is braking.");
    }

    @Override
    public String toString() {
        return "Mersedes{" +
                "ff='" + ff + '\'' +
                "} " + super.toString();
    }
}
