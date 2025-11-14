package com.zejunren.ChaosCalculator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "trainees")
public class Trainee {
    @Id
    private String GUID;
    private String name;
    private List<String> sparkSkillGuid;

    public Trainee() {}

    public Trainee(String GUID, String name, List<String> sparkSkillGuid) {
        this.GUID = GUID;
        this.name = name;
        this.sparkSkillGuid = sparkSkillGuid;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSparkSkillGuid() {
        return sparkSkillGuid;
    }

    public void setSparkSkillGuid(List<String> sparkSkillGuid) {
        this.sparkSkillGuid = sparkSkillGuid;
    }
}
