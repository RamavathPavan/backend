abstract class A {
 static void abc ()
{ 
  System.out.println("hello pavan");
}
abstract void bcd();
}
 abstract class B extends A
{ 
  abstract void bcd();
  static void abc()
{
 System.out.println("welcome rajesh");
}
}
class C extends B
{
  void bcd ()
{
 System.out.println("A");
}
public static void main(String[] args)
{ 
 C Obj=new C();
  Obj.bcd();

}
}