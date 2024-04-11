package task10;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age){
       this.name=name;
       this.age=age;
    }
    public String getName() {
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
      Person person=new Person("Akhil",25);
      System.out.println("The person name is "+person.getName()+ " and the age is "+person.getAge());
    }
}
