import java.time.Period;
import java.time.LocalDate;
// import java.util.Date;
// import java.text.SimpleDateFormat;
// import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ComboBoxExample{
    public static void main(String[] args) throws Exception{
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2019,6,17);
        // Period diff = Period.between(localDate,localDate1);
        
        long diffInDays = ChronoUnit.DAYS.between(localDate, localDate1);
        // String string = "January 2, 2010";
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        // LocalDate date = LocalDate.parse(string, formatter);
        // System.out.println(date); // 2010-01-02

        System.out.println(diffInDays);
        // System.out.println(diff.getDays());
        // System.out.println(diff.getMonths());
        // System.out.println(diff.getYears());
    }
}