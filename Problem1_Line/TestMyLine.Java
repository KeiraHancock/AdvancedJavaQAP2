public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 3);
        MyLine line = new MyLine(p1, p2);

        System.out.println(line); // Should Print Coordinates
        System.out.println("Length: " + line.getLength()); // Should Be 5.0
        System.out.println("Gradient: " + line.getGradient());

        line.setBeginXY(1, 1);
        line.setEndXY(5, 5);
        System.out.println("Updated Line: " + line);
        System.out.println("New Length: " + line.getLength());
    }
}
