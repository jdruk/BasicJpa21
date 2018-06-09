package br.com.jdruk.models;

import javax.persistence.*;

@Entity
public class Pessoa {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Pessoa(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Pessoa(){}

}
