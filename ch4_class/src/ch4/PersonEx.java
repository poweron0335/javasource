package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("홍길동");
    // System.out.println(person.getName());
    // System.out.println(person); // ch4.Person@5ca881b5

    // Person person2 = new Person();
    // person2.setName("성춘향");
    // System.out.println(person2.getName());
    Person person = new Person("홍길동", "Korea");
    person.setName("김길동");
    Person person2 = new Person("장길동", "Korea");
    person.setName("김길동");
    
    // Person.PI = 3.1426363;
    System.out.println(Person.getPi());

    System.out.println(person == person2);  // false 

  }
}