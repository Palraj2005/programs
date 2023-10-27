public class Person{
private String name;
private int age;
public Person(String name,int age){
this.name=name;
this.age=age;}
public Person(String name){
this.name=name;
this.age=0;}
public Person(){
this.name="Unknown";
this.age=0;}
public void Displaydetails(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);}
public static void main(String[]args){
Person person1=new Person("Ranjith",19);
Person person2=new Person("kdpala");
Person person3=new Person();
person1.Displaydetails();
person2.Displaydetails();
person3.Displaydetails();}}