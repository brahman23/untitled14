package v;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("person","goodMenededjer");
        Programmer programmer = new Programmer("Maha","junior","Peaksoft");
        Danser danser = new Danser("Dastan","canDance","NumberOneBatken");
        Singer singer= new Singer("Ulan","numberOneInSchool","NumberOneBatken");
        System.out.println(programmer +"  Name:  "+programmer.getName()+"  desingnations:  "+programmer.getDesignations());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("----------------------------------------------------------------------------------------------");


        System.out.println(danser +"  Name:  "+danser.getName()+"  desingnations:  "+danser.getDesignations());
        danser.learn();
        danser.walk();
        danser.eat();
        danser.dansing();
        System.out.println("----------------------------------------------------------------------------------------------");

        System.out.println(singer +"  Name:  "+singer.getName()+"  desingnations:  "+singer.getDesignations());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.sing();
        System.out.println("----------------------------------------------------------------------------------------------");
    }

}