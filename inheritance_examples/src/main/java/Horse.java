public class Horse implements Animal{

    @Override
    public void voice() {
        System.out.println("The Horse voices: iii aaa");
    }

    @Override
    public void sleep() {
        System.out.println("The Horse sleeps: Hrrr Hrrr");
    }

    @Override
    public void move() {
        System.out.println("The Horse moves: Tup tup tup tup");
    }

    @Override
    public void eat() {
        System.out.println("The Horse eats: Am am am");
    }

    @Override
    public void wash() {
        System.out.println("The Horse washes: Plusk plusk plusk");
    }
}
