package br.com.jdruk.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
/**
 * Chave composta anotação IdClass com nome da classe que irá conter o nome dos atributos que serviram de
 * chave composta para essa classe.
 *
 */

@Entity @IdClass(Chaves.class)
public class ChaveComposta {

    // Add a anotação ID no atritubos
    @Id
    private Long chave_2;
    @Id
    private Long chave_1;

    public Long getChave_1() {
        return chave_1;
    }

    public void setChave_1(Long chave_1) {
        this.chave_1 = chave_1;
    }

    public Long getChave_2() {
        return chave_2;
    }

    public void setChave_2(Long chave_2) {
        this.chave_2 = chave_2;
    }


}
