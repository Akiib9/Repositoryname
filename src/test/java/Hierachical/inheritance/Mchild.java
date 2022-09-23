package Hierachical.inheritance;

public class Mchild extends Gchild{

	public static void main(String[] args) {
          Mchild obj=new Mchild();
          obj.Bike();
          Mchild obj2=new Mchild();
          obj2.Keyboard();
	}
	public void Keyboard()
    {
 	   System.out.println("Keyboard is part of comp");
    }

}
