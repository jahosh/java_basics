public class Person {
  int age;
  String name;

  public Person(String name, int age) {
    this.age = age;
    this.name = name;
  }

  public void sayHello() {
    System.out.println("Hello, my name is : " + this.name);
  }

  public static void main(String []args) {
    Person Josh = new Person("Josh", 26);

    Josh.sayHello();

  }
}