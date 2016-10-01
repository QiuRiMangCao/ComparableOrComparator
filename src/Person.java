
public class Person implements Comparable<Person> {
	
	int age;
	String name;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+age;
	}
	
	
	
	/**
	 * �Ƚ�Person�Ƿ���ȣ�age��name����ȣ�����Ϊ�������
	 * @param person
	 * @return
	 */
	boolean equals(Person person) {
		if(this.age==person.age&&this.name==person.name){
			return true;
		}
		return false;
	}


	/**
	 * @desc ʵ�ֽӿڣ���д����
	 * ����ͨ��person�����ֽ��бȽ�
	 */
	@Override
	public int compareTo(Person person) {
		
		return name.compareTo(person.name);
	}

	
}
