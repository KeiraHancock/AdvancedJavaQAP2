public class TestDate {
    public static void main(String[] args) {
        Date today = new Date(3, 6,2025);
        System.out.println("Today's Date: " + today);

        today.setDay(4);
        today.setMonth(6);
        today.setYear(2025);

        System.out.println("Updated Date: " + today);
    }
}
