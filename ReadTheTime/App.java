public class App {
    public static void main(String[] args) {
        ReadTheTime ttw = new ReadTheTime();
        String [] times = {"07:01", "01:59", "12:01", "00:01", "11:31", "23:31", "12:00"};
        for (String time: times) {
            ttw.setTime(time);
            System.out.println(ttw.convert());
        }
    }
}
