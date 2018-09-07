
public class Person {
	public String phoneNumber=null;
	public String address=null;
	public String id=null;
	public String password=null;

	private String name=null;
	private int age=0;

//	カプセル化
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}

	public void setName(String name,int age){
		this.name=name;
		this.age=age;
	}



	public Person(){}

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public Person(String name){
		this.name=name;
		this.age=0;
	}

	public Person(int age){
		this.name="名前無し";
		this.age=age;
	}

	public Person(int age,String name){
		this.name=name;
		this.age=age;
	}


	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}
}
