package lab1.cmpe235.sjsu.smartstreet.model;

/**
 * Created by sonthai on 3/2/16.
 */
public class Direction {
    private String distance;
    private  String duration;
    private String instruction;

    public Direction(String duration, String instruction, String distance) {
        this.duration = duration;
        this.distance = distance;
        this.instruction = instruction;
    }

    public String getDuration() {
        return duration;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getDistance() {
        return distance;
    }
}
