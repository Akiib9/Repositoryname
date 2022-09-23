package Multileve.inheritance;

public class Grandparent extends Grandchild{

	public static void main(String[] args) {
		Grandchild obj=new Grandparent();
	    obj.Camel();
	    obj.Scada();
	    obj.Material();
	    obj.Travels();
	    Grandparent obj2=new Grandparent();
		obj2.Tiger();

	}
           public void Tiger()
           {
        	   System.out.println("Tiger is aniaml");
           }
}
