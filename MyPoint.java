public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x)
 {
    this.x = x;
 }

 public void setY(int y) {
    this.y = y;
 }

 public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
 }

 public int[] getXY() {
    return new int[] {x, y};
 }

 // Distance Calculation
 public double distance(MyPoint another) {
    int xDiff = this.x - another.x;
    int yDiff = this.y - another.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
 }

 // toString Method
 public String toString() {
    return "("+ x +","+ y +")";
 }

 }