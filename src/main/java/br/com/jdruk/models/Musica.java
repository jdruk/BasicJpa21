package br.com.jdruk.models;

import javax.persistence.*;

/**
 * Não é necessário anotar todos os atributos da classe
 * Minímo necessário é:
 *  Anotar a classe com @Entity
 *  Ter um atributo @Id  opcional = (GeneratedValue)
 *  Construtor sem parametros
 * */
@Entity
public class Musica extends  Model{
    public Musica(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Musica(){

    }

    @Id @GeneratedValue
    private Long id;

    // Basic informa se o atributo pode ou não ser null
    @Basic(optional = false, fetch = FetchType.EAGER)
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
