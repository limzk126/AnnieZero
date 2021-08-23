package duke.exception;

/**
 * Exception class to handle the wrong format for deadlined task.
 *
 * @author limzk126
 * @version Level-6
 */
public class InvalidFormatException extends DukeException {
    /**
     * Constructor for InvalidDateException class.
     */
    public InvalidFormatException() {
        super("Sorry >.< but this format is invalid!\nPlease follow this format:"
                + " [<Type> <Description> / <Date/Time>].");
    }
}
