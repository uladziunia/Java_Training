public class Horse implements Animal {

    public String voice = "Rrrrffff";
    public String color = "Unknown";
    public int height = 0;
    public String sleep = "The Horse sleeps: Hrrr Hrrr";
    public String eat = "The Horse eats: Am am am";
    public boolean move = true;

    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getSleep() {
        return sleep;
    }
    private void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public boolean isMove() {
        return move;
    }
    public void setMove(boolean move) {
        this.move = move;
    }

    @Override
    public String sleep() {
        return null;
    }
    @Override
    public String eat() {
      return null;
    }
    @Override
    public boolean move() {
        return true;
    }
}