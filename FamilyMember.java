class FamilyMember
{
protected String name;
public FamilyMember(String name)
{
this.name=name;
}
public void introduce()
{
System.out.println("I am a family member.My name is"+name+".");
}
}
class Parent extends FamilyMember
{
private String role;
public Parent(String name,String role)
{
super(name);
this.role=role;
}
@Override
public void introduce()
{
System.out.println("I am a parent.My name is"+name+"and I am a"+role+".");
}
}
class Child extends FamilyMember
{
private int age;
public Child(String name,int age)
{
super(name);
this.age=age;
}
@Override
public void introduce()
{
System.out.println("I am a child.My name is"+name+"and I am"+age+"years old.");
}
}
public class FamilyExample
{
public static void main(String[]args)
{
FamilyMember familymember1=new FamilyMember("John");
FamilyMember familymember2=new Parent("Jane","Mother");
FamilyMember familymember3=new Child("Alex",10);
familyMember1.introduce();
familyMember2.introduce();
familyMember3.introduce();
}
}