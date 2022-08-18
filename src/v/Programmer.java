package v;

public class Programmer extends Person {
    final private String companyName;

    public Programmer(String name, String designations,String companyName) {
        super(name, designations);

        this.companyName=companyName;

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
    public void coding(){
        System.out.println("код жазат   ");
    }

    @Override
    public String toString() {

        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
