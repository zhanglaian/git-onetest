package com.an.pojo;

public class Studnet {
    private Integer id;
    private String name;

    public Studnet() {
    }

    public Studnet(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
