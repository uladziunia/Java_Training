public class Arden extends Horse {
    //Horse horse = new Horse() {

        @Override
        public void voice() {
            System.out.println("The Horse voices: iii aaa");
        }

        @Override
        public void sleep() {
            System.out.println("The Horse sleeps: Hrrr Hrrr");
        }

        @Override
        public int move() {
            //System.out.println("The Horse mooves: Tup Tup Tup");
            return 0;
        }

        @Override
        public void eat() {
            System.out.println("The Horse eats: Am am am");
        }

        @Override
        public boolean wash() {
            return true;
        }

        @Override
        public void mainStable() {
            System.out.println("The Horse is in: mainStable");
        }

        @Override
        public void saddlery() {
            System.out.println("The Horse is in: saddlery");
        }

        @Override
        public void forageRoom() {
            System.out.println("The Horse is in: forageRoom");
        }
}