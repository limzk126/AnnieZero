package duke.exception;

/**
 * Exception class to handle Invalid commands.
 *
 * @author limzk126
 * @version Level-5
 */
public class InvalidCommandException extends DukeException {
    /**
     * Constructor for InvalidCommandException class.
     */
    public InvalidCommandException() {
        super("Sorry >.< I do not understand your command!");
    }
}
