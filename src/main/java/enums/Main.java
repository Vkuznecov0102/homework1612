package enums;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek[] dow = DaysOfWeek.values();

        for (DaysOfWeek daysOfWeek : dow) {
            System.out.print(daysOfWeek + " ");
        }
    }
}
