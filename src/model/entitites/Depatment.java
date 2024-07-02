package model.entitites;

import java.io.Serializable;
import java.util.Objects;

public class Depatment implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer Id;
    private String Name;

    public Depatment() {
    }

    public Depatment(Integer id, String name) {
        Id = id;
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depatment depatment = (Depatment) o;
        return Objects.equals(Id, depatment.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

    @Override
    public String toString() {
        return "Depatment{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
