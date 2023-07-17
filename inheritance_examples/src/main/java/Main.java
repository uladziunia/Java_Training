public class Main {

    public static void testArden(Arden arden) {
        arden.move();
        arden.eat();
        arden.wash();
        arden.sleep();
        arden.voice();
     // arden.saddlery();
     // arden.mainStable();
     // arden.forageRoom();
    }

    public static void main(String[] args) {
        Arden arden = new Arden();
        Arden arden1 = arden;
        Horse ardenHorse = new Arden();
            // Arden ardenniekon = new Horse(); // nie kazdy kon jest ardenem czytamy od prawej do lewej
    }
}