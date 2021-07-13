package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){
        //no arg constructor
    }

    @NotBlank(message = "Description is required")
    @Size(max = 500)
    private String description;
}