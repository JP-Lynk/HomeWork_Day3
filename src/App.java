public class App {
    public static void main(String[] args) throws Exception {
        CheckTheYear year = new CheckTheYear();
        year.CheckLeapYear(2020);
        year.CheckLeapYear(2013);
        year.CheckLeapYear(1000);
    }
}
