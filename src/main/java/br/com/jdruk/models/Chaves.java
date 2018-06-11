package br.com.jdruk.models;

import java.io.Serializable;
/**
 * Obrigatório a implementar Serializable
 *              Sobreescrever HASCODE e ESQUALS
 *
 * */
public class Chaves implements Serializable {
    private Long chave_1;
    private Long chave_2;

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

    public Chaves() { }

    public Chaves(Long chave_1, Long chave_2) {
        super();
        this.chave_1 = chave_1;
        this.chave_2 = chave_2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((chave_2 == null) ? 0 : chave_2.hashCode());
        result = prime * result + chave_1.intValue();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Chaves other = (Chaves) obj;
        if (chave_2 == null) {
            if (other.getChave_2() != null)
                return false;
        } else if (!chave_2.equals(other.getChave_2()))
            return false;
        if (chave_1 != other.getChave_1())
            return false;
        return true;
    }
}
