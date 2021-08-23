package duke.task;

/**
 * Task class which encapsulates task description and status of completion.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Constructor of Task class.
     *
     * @param description Description of task.
     */
    public Task(String description) {
        this.description = description;
        isDone = false;
    }

    public boolean getIsDone() {
        return isDone;
    }

    /**
     * Returns "X" if uncompleted and " " otherwise.
     *
     * @return "X" or " " depending on status.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }

    /**
     * Formats task's data into a string for storage in hard disk
     * and returns it.
     *
     * @return String containing task's data.
     */
    public String getData() {
        return (getIsDone() ? 1 : 0) + " // " + getDescription();
    }

    /**
     * Marks the task as done.
     */
    public void markDone() {
        isDone = true;
    }

    /**
     * Overrides Object class toString method.
     *
     * @return A String describing details of Task class.
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
}
