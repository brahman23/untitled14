package v;

public class Danser extends Person {
    final private String groupName;

    public Danser(String name, String designations,String groupName) {
        super(name, designations);

        this.groupName=groupName;

    }
    public void learn(){
        System.out.println("окуйт");
    }
    public void walk (){
        System.out.println("ходит");
    }
    public void eat(){
        System.out.println("кушаеть");
    }
    public void dansing(){
        System.out.println("танцует");
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Danser{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}

