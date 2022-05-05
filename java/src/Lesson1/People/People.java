package src.Lesson1.People;

import src.Lesson1.Competition.BaseCompetition;

import java.util.HashMap;
import java.util.Map;

public class People implements Moving{


    private String name;
    private int heightJumpMeters;
    private double hundredMeterRunTime;
    private Map<String, Boolean> result = new HashMap<>();


    public People(String name, int heightJumpMeters, double hundredMeterRunTime) {
        this.name = name;
        this.heightJumpMeters = heightJumpMeters;
        this.hundredMeterRunTime = hundredMeterRunTime;
        Check.setAllValue(1,2,3);

    }

    public static void main(String[] args) {
        Check.setAllValue(1,2,3);
        System.out.println(Check.Jump.getComplexity());
    }

    public <T extends BaseCompetition> void setResult(T competition, boolean result) {
        this.result.put(competition.toString(), result);
    }

    public Map<String, Boolean> getResult() {
        return result;
    }

    public String getName() {
        return name;
    }


    @Override
    public int heightJump() {
        return heightJumpMeters;
    }

    @Override
    public double hundredMeterRun() {
        return hundredMeterRunTime;
    }
}