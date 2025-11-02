package com.zejunren.UmaDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "G1race")
public class G1Race {

    @Id
    private String GUID;
    private String name;
    private String date;
    private String field;
    private String distance;
    private ArrayList<String> sparks;


    public G1Race() {}

    public G1Race(String name, String date, String field, String distance, ArrayList<String> sparks) {
        this.name = name;
        this.date = date;
        this.field = field;
        this.distance = distance;
        this.sparks = sparks;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getField() { return field; }

    public void setField(String field) { this.field = field; }

    public String getDistance() { return distance; }

    public void setDistance(String distance) { this.distance = distance; }

    public List<String> getSparks() {
        return sparks;
    }

    public void setSparks(ArrayList<String> sparks) {
        this.sparks = sparks;
    }
}
