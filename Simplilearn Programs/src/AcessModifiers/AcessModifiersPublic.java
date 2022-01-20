package AcessModifiers;


public class AcessModifiersPublic{
	public int id=86;
	public void study() {
		System.out.println("Studying java");
	}
	public static void main(String[]args) {
		AcessModifiersPublic i=new AcessModifiersPublic();
		System.out.println(i.id);
		i .study();
	}
}