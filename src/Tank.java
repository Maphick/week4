public class Tank {

    static final String MODEL = "T34";
    static int ntanks;

    private int x, y, z;
    private int dir;
    private int fuel;
    private int n;

    public Tank() {
        this(0, 0, 100);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }

    public int getFuel() {
        return fuel;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public void goForward(int i) {
        if (i < 0 && -i > fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank-" + n + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void flyStraight(int i, int z) {

    }
}