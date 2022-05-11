package src.Lesson1.Competition;

import src.Lesson1.People.People;
import src.Lesson1.People.Team;

public class HeightJumpMeters extends BaseCompetition {
    private int height;

    public HeightJumpMeters(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.heightJump() >= height) {
                people.setResult(this, true);
            } else {
                people.setResult(this, false);
            }
        }

    }

    @Override
    public String toString() {
        return "Соревнования по прыжкам в высоту";
    }
}