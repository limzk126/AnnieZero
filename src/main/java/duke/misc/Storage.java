package duke.misc;

import duke.task.Deadline;
import duke.task.Event;
import duke.task.Task;
import duke.task.Todo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Storage class to retrieve and store tasks in Duke.
 */
public class Storage {
    private final String FILE_PATH = "data\\duke.txt";

    /**
     * Reads data from duke.txt file.
     *
     * @return ArrayList of tasks.
     * @throws IOException In case directory is invalid or file does not exist.
     */
    public ArrayList<Task> readData() throws IOException {
        ArrayList<Task> al = new ArrayList<>();
        File fd = new File("data");
        if (!fd.exists()) {
            fd.mkdirs();
        }
        File f = new File(FILE_PATH);
        f.createNewFile();
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] args = data.split(" // ");
            Boolean isDone = Integer.parseInt(args[1]) != 0;
            switch(args[0]) {
                case "Todo":
                    al.add(new Todo(args[2], isDone));
                    break;
                case "Event":
                    al.add(new Event(args[2], args[3], isDone));
                    break;
                case "Deadline":
                    al.add(new Deadline(args[2], args[3], isDone));
                    break;
            }
        }
        return al;
    }

    /**
     * Writes data into duke.txt file.
     *
     * @param al The ArrayList to write from.
     * @throws IOException In case directory is invalid or file does not exist.
     */
    public void writeData(ArrayList<Task> al) throws IOException {
        File f = new File(FILE_PATH);
        FileWriter fw = new FileWriter(FILE_PATH);
        for (int i = 1; i <= al.size(); i++) {
            fw.write(al.get(i - 1).getData() + "\n");
        }
        fw.close();
    }
}
