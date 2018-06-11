package br.com.jdruk.models;

public abstract  class Model {
    public void create(){
        String classe = this.getClass().getName();

        System.out.println(classe);
    }
}
