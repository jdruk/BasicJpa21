package br.com.jdruk.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Não é necessário anotar todos os atributos da classe
 * Minímo necessário é:
 *  Anotar a classe com @Entity
 *  Ter um atributo @Id  opcional = (GeneratedValue)
 *  Construtor sem parametros
 * */
@Entity
public class Musica {
    public Musica(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Musica(){

    }

    @Id @GeneratedValue
    private Long id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
