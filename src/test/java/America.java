
public class America implements Australian,Canada{

	public static void main(String[] args) {
		
	 Australian  obj=new America();
     obj.green();
     obj.red();
     obj.yellow();
     America  obj2=new America();
     obj2.blue();
     Canada obj3=new America();
     obj3.animal();
     
	}
    public void blue()
    {
    	System.out.println("blue signal");
    }
	public void green() {
		System.out.println("green signal");
		
	}

	public void red() {
		System.out.println("red signal");
		
	}

	public void yellow() {
		System.out.println("yellow signal");
		
	}
	public void animal() {
		System.out.println("tiger is a animal");
		
	}

}
