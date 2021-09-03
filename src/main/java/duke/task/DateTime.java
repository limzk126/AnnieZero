package duke.task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * DateTime class which encapsulates a task's date and time. It also enables
 * the date and time to be reformatted.
 */
public class DateTime {
    static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("hh:mm");

    private LocalDate date;
    private LocalTime time;

    /**
     * Constructor for DateTIme class.
     *
     * @param date The date in YYYY-MM-dd format.
     */
    DateTime(String date) {
        this.date = LocalDate.parse(date);
    }

    /**
     * Constructor for DateTime class.
     *
     * @param date The date in yyyy-MM-dd format.
     * @param time The time in hh:mm format.
     */
    DateTime(String date, String time) {
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }

    /**
     * Returns original date used to create the DateTime class.
     *
     * @return String of original date.
     */
    public String getDate() {
        return date.toString();
    }

    /**
     * Checks if date has an invalid format.
     *
     * @param date The date to be checked.
     * @return Boolean true if invalid and boolean false otherwise.
     */
    public static boolean isInvalidDate(String date) {
        try {
            DATE_FORMATTER.parse(date);
        } catch (DateTimeParseException e) {
            return true;
        }
        return false;
    }

    /**
     * Checks if time has an invalid format.
     *
     * @param time The time to be checked
     * @return Boolean true if invalid and boolean false otherwise.
     */
    public static boolean isInvalidTime(String time) {
        try {
            TIME_FORMATTER.parse(time);
        } catch (DateTimeParseException e) {
            return true;
        }
        return false;
    }

    /**
     * Overrides Object class's toString method.
     *
     * @return The String representation of the date in d MMM yyy format.
     */
    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("d MMM yyyy"));
    }
}
