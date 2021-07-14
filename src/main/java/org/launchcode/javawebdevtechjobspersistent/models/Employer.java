package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.mapping.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;


@Entity
public class Employer extends AbstractEntity {

    public Employer(){
        //no arg constructor
    }

    @NotBlank(message = "Location is required")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToMany
    @JoinColumn
    private List<Job> jobs (<>){
    }
}
