// Shoham Avraham 318232469; Ronen Giladov 209506757; Assignmet2_part1
package Race;

import java.util.Scanner;

public class Racer implements Runnable{
    private static int globalId = 0;
    private int id;
    private int speed;
    private Track track;

    // Constructor for the Racer class
    public Racer(int speed, Track track){
        globalId++;
        id = globalId;
        setSpeed(speed);
        this.track = track;
    }

    // Method for the racer to start running
    public void go(){
        Thread.currentThread().setPriority(speed);
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runner " + id + " ran " + i + " meters");
        }
        System.out.println("Runner " + id + " finished " + track.runners() + "st");
    }

    // Run method for the Runnable interface
    public void run(){
        go(); // Start the race
    }

    // Setter for the speed of the racer
    public void setSpeed(int speed){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                if (speed < 1 || speed > 10) { // Check if the speed is within the valid range
                    throw new Exception();
                } else {
                    this.speed = speed;
                    flag = false; // Exit the loop
                    }
                }catch (Exception e){
                    System.out.println("Wrong speed! Speed must be in between 1 - 10 try again: ");
                    speed = scan.nextInt(); // Ask the user to enter the speed again
                }
            }

    }

}
