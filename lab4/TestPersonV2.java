 package koochaiyaphum.nitisak.lab4;

public class TestPersonV2 {

    public static void main(String[] args) {
    PersonV2 doraemon = new PersonV2("Doraemon" 100, 100, "2017-05-26");
    PersonV2 nobita = new PersonV2("NObita", 100, 25, "2012-01-06");
    System.out.println(doraemon);
    System.out.println(nobita);
    doraemon.howOld();
    nobita.howOld();
    doraemon.compareAge(nobita);
    nobita.compareAge(doraemon);
    doraemon.isBirthday();
    doraemon.isBirthday();
    System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}