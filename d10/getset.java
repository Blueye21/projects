package cohding.java.d10;

class Main {
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

public class getset {
    public static void main(String[] args) {
        Main m = new Main();
        m.setTime(1500);
        if (m.getTime() == 1300) {
            System.out.println("Day");
        } else {
            System.out.println("Night");
        }
    }
}