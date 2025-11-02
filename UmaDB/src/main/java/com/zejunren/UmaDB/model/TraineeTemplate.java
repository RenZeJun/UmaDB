package com.zejunren.UmaDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "TraineeTamplate")
public class TraineeTemplate {

    @Id
    private String ID;
    private String traineeGuid;
    private int speed;
    private int stamina;
    private int power;
    private int guts;
    private int wits;
    private List<String> sparkSkills;
    private List<String> wonRace;

    public TraineeTemplate() {}

    public TraineeTemplate(String ID, String traineeGuid, int speed, int stamina, int power, int guts, int wits, List<String> sparkSkills, List<String> wonRace) {
        this.ID = ID;
        this.traineeGuid = traineeGuid;
        this.speed = speed;
        this.stamina = stamina;
        this.power = power;
        this.guts = guts;
        this.wits = wits;
        this.sparkSkills = sparkSkills;
        this.wonRace = wonRace;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTraineeGuid() {
        return traineeGuid;
    }

    public void setTraineeGuid(String traineeGuid) {
        this.traineeGuid = traineeGuid;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getGuts() {
        return guts;
    }

    public void setGuts(int guts) {
        this.guts = guts;
    }

    public int getWits() {
        return wits;
    }

    public void setWits(int wits) {
        this.wits = wits;
    }

    public List<String> getSparkSkills() {
        return sparkSkills;
    }

    public void setSparkSkills(List<String> sparkSkills) {
        this.sparkSkills = sparkSkills;
    }

    public List<String> getWonRace() {
        return wonRace;
    }

    public void setWonRace(List<String> wonRace) {
        this.wonRace = wonRace;
    }
}
