package com.zejunren.ChaosCalculator.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection = "SupportCard")
public class SupportCard {

    private String supportCardGuid;
    private String name;
    private String type;
    private Map<String,String> events;
    private List<String> sparkSkillGuid;

    public SupportCard() {}

    public SupportCard(String supportCardGuid, String name, String type, Map<String, String> events, List<String> sparkSkillGuid) {
        this.supportCardGuid = supportCardGuid;
        this.name = name;
        this.type = type;
        this.events = events;
        this.sparkSkillGuid = sparkSkillGuid;
    }

    public String getSupportCardGuid() {
        return supportCardGuid;
    }

    public void setSupportCardGuid(String supportCardGuid) {
        this.supportCardGuid = supportCardGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getEvents() {
        return events;
    }

    public void setEvents(Map<String, String> events) {
        this.events = events;
    }

    public List<String> getSparkSkillGuid() {
        return sparkSkillGuid;
    }

    public void setSparkSkillGuid(List<String> sparkSkillGuid) {
        this.sparkSkillGuid = sparkSkillGuid;
    }
}
