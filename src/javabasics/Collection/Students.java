package javabasics.Collection;

public class Students implements Comparable<Students>{
    int id;
    String name;


    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Students o) {
        return this.id - o.id;
        // +
        // -
        // 0
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
