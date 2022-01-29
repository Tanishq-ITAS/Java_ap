import java.util.Scanner;
/**
 * Write a description of class Runner here.
 * 
 * You should use the UML diagram from the slides!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runners {

    private String runner1; String runner2; String runner3;
    private double time1; double time2; double time3;

    public void setTime1(double Time1)
    {
        this.time1 = Time1;
    }

    public void setRunner1(String Runner1)
    {
        this.runner1 = Runner1;
    }

    public void setTime2(double Time2)
    {
        this.time2 = Time2;
    }

    public void setRunner2(String Runner2)
    {
        this.runner2 = Runner2;
    }

    public void setTime3(double Time3)
    {
        this.time3 = Time3;
    }

    public void setRunner3(String Runner3)
    {
        this.runner3 = Runner3;
    }


    /**
     * This is a simple running race model with 3 runners and 
     * calculates who is in first place, second place etc.
     * 
     * You should use the UML diagram from the slides!
     * 
     * @author Dave Croft
     */

    
    /**
     * This returns the name of runner1;
     */
    public String getRunner1() {
        return runner1;
    }

    public double getTime1() {
        return time1;
    }

    public String getRunner2() {
        return runner2;
    }

    public double getTime2() {
        return time2;
    }

    public String getRunner3() {
        return runner3;
    }

    public double getTime3() {
        return time3;
    }

    
    // NOTE FROM DAVE
    // YOU NEED TO FINISH WRITING ALL THE SET AND GET METHODS
    // THAT ARE SHOWN IN THE UML Diagram from Chapter 4 slides

    /**
     * This method calculates which runner is in first place 
     * based upon time1, time2, and time3. It returns a String
     * with the name of the runner in first place.
     */
    public String getFirstPlace() {

        // to handle the tie case where all times are the same
        // lets assume a Tie finish, and then we will check 
        // the time for each runner in our if/else if statements
        String firstPlace = "Tie";

        // check if runner1 is winning
        if ((time1 < time2) && (time1 < time3)) {
            firstPlace = runner1;

            // check if runner2 is winning
        } else if (time2 < time1 && time2 < time3) {
            firstPlace = runner2;

            // check if runner3 is winning
        } else if (time3 < time1 && time3 < time2) {
            //} else {
            firstPlace = runner3;
        }
        return firstPlace;
    }

    // Write getThirdPlace() - save getSecondPlace for last
    public String getThirdPlace() {
        // same idea as getFirstPlace but opposite
        String thirdPlace = "Tie";
        // write your if/else if statements

        return thirdPlace;
    }

    public String getSecondPlace() {

        String secondPlace = "Tie";

        // Check if runner1 is in second place
        // runner1 is slower than runner2 and faster than runner3
        if ( (time1 > time2 && time1 < time3 ) ||

            // runner1 slower than runner 3 and faster than runner 2
        (time1 > time3 && time1 < time2 )) {

            secondPlace = runner1;
        }
        return secondPlace;
    }

    // Version 2
    public String getSecondPlaceV2() {

        String secondPlace = "Tie";
        // check if runner 1 is not in first place, and not in third place
        // if so they must be in second place!
        if (!runner1.equals(getFirstPlace()) && !runner1.equals(getThirdPlace())){
            secondPlace = runner1;
        }
        // need to check runner 2 for second place
        // need to check runner 3 for second place
        return secondPlace;
    }

}


