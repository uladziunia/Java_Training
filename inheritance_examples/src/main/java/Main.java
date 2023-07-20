public class Main {

    public static void testArden(Arden arden) {
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        Arden arden = new Arden();
        // Arden arden1 = arden;
        // Horse ardenHorse = new Arden();
        arden.eat();
        arden.sleep();
        System.out.println("The Horse voice is: " + horse.getVoice());
        System.out.println("The Arden Horse voice is: " + arden.getVoice());
        System.out.println("The Horse default color is: " + horse.getColor());
        System.out.println("The Arden Horse default color is: " + arden.getColor());
        System.out.println("The Arden Horse default height is: " + arden.getHeight());
        System.out.println("The Horse sleeps: Hrrr Hrrr" + horse.getSleep());
        System.out.println("The Horse eats: Am am am" + horse.getEat());
        System.out.println("The Horse moves: Tup tup tup? " +horse.isMove());

        // Arden ardenniekon = new Horse(); // nie kazdy kon jest ardenem czytamy od prawej do lewej
    }
}