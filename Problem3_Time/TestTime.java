public class TestTime {
    public static void main(String[] args) {
        Time now = new Time(14, 35, 50);
        System.out.println("Current Time: " + now);

        now.setHour(15);
        now.setMinute(42);
        now.setSecond(5);

        System.out.println("Updated Time: " + now);
    }
}
