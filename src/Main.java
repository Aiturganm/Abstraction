public class Main {
    public static void main(String[] args) {
        Car mersedes = new Mersedes("Mersedes", "White", 360, "Unique");
        Camry camry = new Camry("Camry", "Black", 280, "Unique");
        System.out.println(mersedes);
        mersedes.gas();
        mersedes.brake();
        System.out.println();
        System.out.println("*****************");
        System.out.println();
        System.out.println(camry);
        camry.gas();
        camry.brake();
    }
}
