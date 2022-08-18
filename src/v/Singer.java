package v;

public class Singer extends Person {
    final private String bandName;
    public Singer(String name, String designations,String bandName) {
        super(name, designations);

        this.bandName=bandName;

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
    public void sing(){
        System.out.println("поет");
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
