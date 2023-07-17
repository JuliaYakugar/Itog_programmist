package terminal;

public class Schetchic {

    private int c;

    public Schetchic() {
        this.c = 0;
    }

    public Schetchic(int c) {
        this.c = c;
    }

    public void add() {
        this.c = this.c + 1;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void printC() {
        System.out.println(c);
    }
}
