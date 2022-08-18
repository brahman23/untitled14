package v;

public class Person {
    final private String name;
    final private String designations;
    public Person(String name,String designations){
        this.name=name;
        this.designations=designations;
    }

    public String getName() {
        return name;
    }

    public String getDesignations() {
        return designations;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", designations='" + designations + '\'' +
                        '}';
    }
}
