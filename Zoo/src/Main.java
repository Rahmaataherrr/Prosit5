public class Main {
    public static void main(String[] args) {

        Dolphin d1 = new Dolphin("Poisson", "Dolphin", 24, true, "Mer", 2.0f);
        Penguin p1 = new Penguin("Oiseau", "Penguin", 25, true, "Antarctique", 0.1f);


        System.out.println(d1);
        System.out.println(p1);

        d1.swim();
        p1.swim();

    }
}