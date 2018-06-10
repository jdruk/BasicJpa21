package br.com.jdruk.models;

import javax.persistence.*;

@Entity @Table(name="person")
public class Pessoa {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public Pessoa(String nome){
        this(nome,null);
    }

    public Pessoa(){}

}
