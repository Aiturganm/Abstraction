public class Camry extends Car{
    private String gg;
    public Camry(String model, String colour, int maxSpeed, String gg) {
        super(model, colour, maxSpeed);
        this.gg = gg;
    }

    @Override
    public void gas() {
        System.out.println(getModel() + "'s gas 90 k/s.");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is not braking.");
    }

    @Override
    public String toString() {
        return "Camry{" +
                "gg='" + gg + '\'' +
                "} " + super.toString();
    }
}
