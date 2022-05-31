abstract class A
{
public abstract void test();
}
class B extends A
{
public void test()
{
System.out.println("HaloTest");
}
}
class TestMain
{
public static void main(String args[])
{
B b = new B();
b.test();
}
}