package chapter07;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name = "������");
		System.out.println(p1.height = 180f);
		System.out.println(p1.weight = 80F);
		System.out.println("===================================");
		Person p2 = new Person();
		System.out.println(p2.name = "������");
		System.out.println(p2.height = 175f);
		System.out.println(p2.weight = 75F);
		System.out.println("===================================");
		Person p3 = new Person("�̼���", 170, 70);
		System.out.println(p3.name);
		System.out.println(p3.height);
		System.out.println(p3.weight);
		System.out.println("===================================");

	}

}
