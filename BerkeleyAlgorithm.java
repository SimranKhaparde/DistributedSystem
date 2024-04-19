import java.util.ArrayList;
import java.util.List;

// Class to represent a computer with its clock time
class Computer {
    private String name;
    private int prevTime;
    private int currTime;

    public Computer(String name, int time) {
        this.name = name;
        this.prevTime = time;
        this.currTime = time;
    }

    public String getName() {
        return name;
    }

    public int getPrevTime() {
        return prevTime;
    }

    public int getCurrTime() {
        return currTime;
    }

    public void setCurrTime(int time) {
        this.currTime = time;
    }
}

public class BerkeleyAlgorithm {

    // Method to synchronize the clocks of all computers
    public static void synchronizeClocks(List<Computer> computers) {
        int total = 0;
        int avg;

        // Calculate the total time across all computers
        for (Computer computer : computers) {
            total += computer.getCurrTime();
        }

        // Calculate the average time
        avg = total / computers.size();

        // Set the time of each computer to the average time
        for (Computer computer : computers) {
            computer.setCurrTime(avg);
            System.out.println("Adjusted time for " + computer.getName() + " - Previous: " + computer.getPrevTime() + ", Current: " + computer.getCurrTime());
        }
    }

    public static void main(String[] args) {
        // Create a list of computers with their initial times
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Computer1", 10));
        computers.add(new Computer("Computer2", 15));
        computers.add(new Computer("Computer3", 20));
        

        // Synchronize the clocks of all computers
        synchronizeClocks(computers);
    }
}
