package fr.pomverte.got.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class House {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String words;
}
