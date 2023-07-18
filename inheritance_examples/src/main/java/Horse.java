public abstract class Horse implements Animal {

        public void voice() {
                System.out.println("The Horse voices: iii aaa");
        }
        public void sleep() {
                System.out.println("The Horse sleeps: Hrrr Hrrr");
        }
        public int move() {
                return 10;
        }
        public void eat() {
                System.out.println("The Horse eats: Am am am");
        }
        public boolean wash() {
                return true;
        }
}