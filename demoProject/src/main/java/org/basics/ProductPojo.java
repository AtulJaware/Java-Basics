package org.basics;

public class ProductPojo {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "ProductPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ProductPojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
