
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;
        String filepath = "src\\On The Flip wavvv.wav";

        while (alarmtime == null) {
            try {
                System.out.print("enter the time you want to set the Alarm(HH:MM:SS): ");
                String input = sc.nextLine();

                alarmtime = LocalTime.parse(input, formatter);
                System.out.println("Alarm set for: " + alarmtime);
            } catch (DateTimeParseException e) {
                System.out.println("invalid format, please input HH:MM:SS");
            }
        }
        AlarmClock1 alarmclock = new AlarmClock1(alarmtime, filepath, sc);
        Thread thr = new Thread(alarmclock);
        thr.start();

    }
}
