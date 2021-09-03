package duke.task;

/**
 * Event class which encapsulates event date/time.
 */
public class Event extends Task {
    private DateTime atDate;

    /**
     * Constructor for Event class.
     *
     * @param description Description of event.
     * @param at Date/time of event.
     */
    public Event(String description, String at) {
        super(description);
        this.atDate = new DateTime(at);
    }

    /**
     * Constructor for Event class.
     *
     * @param description Description of event task.
     * @param at Data/time of event.
     * @param isDone Completion status of event.
     */
    public Event(String description, String at, Boolean isDone) {
        super(description);
        super.isDone = isDone;
        this.atDate = new DateTime(at);
    }

    /**
     * Formats task's data into a string for hard drive storage
     *
     * @return String containing task's data.
     */
    @Override
    public String getData() {
        return "Event // " + (super.getIsDone() ? 1 : 0) + " // " + super.getDescription()
                + " // " + atDate.getDate();
    }

    /**
     * Overrides Task class's toString method.
     *
     * @return A String Describing details of Event class.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + atDate.toString() + ")\n";
    }
}
