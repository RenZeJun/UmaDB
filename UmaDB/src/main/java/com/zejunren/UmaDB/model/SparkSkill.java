package com.zejunren.UmaDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "SparkSkill")
public class SparkSkill {

    @Id
    private String SparkSkillGuid;
    private String name;
    private String description;
    private List<String> tags;

    public SparkSkill() {}

    public SparkSkill(String sparkSkillGuid, String name, String description, List<String> tags) {
        SparkSkillGuid = sparkSkillGuid;
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    public String getSparkSkillGuid() {
        return SparkSkillGuid;
    }

    public void setSparkSkillGuid(String sparkSkillGuid) {
        SparkSkillGuid = sparkSkillGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
