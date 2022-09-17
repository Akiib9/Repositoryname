package single.inheritance;

public class Parent {

	public static void main(String[] args) {
		System.out.println("new files");
		Parent obj=new Parent();
		obj.CKP();
		//obj.RKSN();
		RKSN();
		Parent.RKSN();

	}
	public void CKP()
	{
		System.out.println("ems data of ckp");
	}
	public static void RKSN()
	{
		System.out.println("ems data of rksn");
	}

}
