package second_pack;

public class Main {
    public static void main(String[] args) {

        Farm farm1 = new Farm("Naryn", new Cow[]{
                new Cow(14, 6, 'F', "Grye"),
                new Cow(23, 7, 'M', "Hort"),
                new Cow(29, 4, 'F', "Eprut"),
                new Cow(23, 8, 'F', "Satik"),
                new Cow(30, 7, 'M', "Perka")
        }, new Horse[]{
                new Horse(45, 12, 'F', "Konya"),
                new Horse(60, 17, 'M', "Ponik")
        }, new Sheep[]{
                new Sheep(45, 12, 'F', "Burnik"),
                new Sheep(46, 11, 'M', "Salum"),
                new Sheep(39, 9, 'F', "Polin")
        }, "Farm1");

        Farm farm2 = new Farm("Aksy", new Cow[]{
                new Cow(19, 4, 'F', "Potil")
        }, new Horse[]{
                new Horse(30, 4, 'M', "Greit")
        }, new Sheep[]{
                new Sheep(35, 7, 'M', "Grut")
        }, "Farm2");

        System.out.println(farm1);
        System.out.println("**************************************");
        System.out.println(farm2);
    }
}
