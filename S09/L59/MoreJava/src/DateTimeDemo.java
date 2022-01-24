import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy, HH:mm a");
        String formattedDate2 = dateTime.format(formatter2);
        System.out.println(formattedDate2);
    }
}
