import java.util.List;
import java.util.ArrayList;
class LambdaExp {
    List<Person> r=new ArrayList<Person>();
    {r.add(new Person("Peter",21));
     r.add(new Person("Mary",22));
     r.add(new Person("Joe",23));
     r.add(new Person("Anne",24));
     r.add(new Person("Tom",25));
    }
    void findPerson(Check tester){printPerson(r,tester);}
    void printPerson(List<Person> roster,Check tester){
        for (Person p:roster){if(tester.test(p)){p.printPerson();}}
    }
    public static void main(String[] args){
        LambdaExp s=new LambdaExp();
        s.findPerson(new CheckStandard1());
        System.out.println("----------");
        s.findPerson((Person p)->p.age<25);
    }
}
interface Check{boolean test(Person p);}
class CheckStandard1 implements Check{public boolean test(Person p){return p.age>22;}}
class Person{
    String name;int age;
    Person(String name, int age){this.name=name;this.age=age;}
    void printPerson(){System.out.println("Name: "+name+" Age: "+age);}
}
/*
 Method reference: 1 static method ContainingClass::staticMethod
                   2 instance method ContainingObject::instanceMethod
                   3 constructor ClassName::new
*/
