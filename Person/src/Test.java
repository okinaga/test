
public class Test {

	public static void main(String[]args){

		Person taro=new Person();
		taro.name="鈴木花子";
		taro.age=16;
		System.out.println(taro.name+"、"+taro.age);
		taro.phoneNumber="112233";
		taro.address="tttr_123";
		taro.id="taro123";
		taro.password="1234567890";
		System.out.println("電話番号:"+taro.phoneNumber);
		System.out.println("アドレス:"+taro.address);
		System.out.println("ID:"+taro.id);
		System.out.println("pass:"+taro.password);

		taro.talk();
		taro.walk();
		taro.run();


		Robot aibo=new Robot();
		aibo.name="山田太郎";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="伊藤太郎";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="斎藤太郎";
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon=new Robot();
		doraemon.name="田中太郎";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();

//		コンストラクタ
		Person taro2=new Person();
		taro2.name="taro";
		taro2.age=18;
		System.out.println(taro2.name);
		System.out.println(taro2.age);

		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person nanasi=new Person(25);
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);

		Person hanako=new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

//		カプセル化
		

	}
}