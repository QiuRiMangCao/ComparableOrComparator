import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Content:����Comparator<Person>����Comparable<Person>
 * �ֱ��Int age,String name,����������������ж϶���person�Ƿ����
 * Comparator<Person>:�ⲿ-->����һ�������ѡ��������������,��Ϊ�Ƚ���
 * Comparable<Person>:�ڲ�-->��ʵ�ֽӿ�,����֧������,��Ϊ����ӿ�
 * 
 * @author CEO
 *
 */
public class Main {
	public static void main(String[] args){
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person(20,"AAA"));
		list.add(new Person(58,"DDD"));
		list.add(new Person(26,"CCC"));
		list.add(new Person(10,"BBB"));
		System.out.printf("yuan:%s\n",list);
		//��list����
		//����Personʵ��Comparable<String>�ӿڽ������򣬸���Name����
		Collections.sort(list);
		System.out.printf("yuan:%s\n",list);
		//��������
		Collections.sort(list,new DescAgeComarator());
		System.out.printf("Desc:%s\n",list);
		//��������
		Collections.sort(list,new AscAgeComarator());
		System.out.printf("Asc:%s\n",list);
		
		//�ж϶���person�Ƿ����
		testEquals();
	}
	/**
	 * @desc ���Զ���person�Ƿ����
	 */
	private static void testEquals(){
		Person p1=new Person(100, "eee");
		Person p2=new Person(100, "eee");
		if(p1.equals(p2)){
			System.out.printf("%s Equals:%s\n",p1,p2);
		}else{
			System.out.printf("%s NotEquals:%s\n",p1,p2);
		}
	}
	
	/**
	 * @desc DescAgeComarator�Ƚ���
	 * ����Person��age������Ƚ���
	 * @author CEO
	 *
	 */
	private static class DescAgeComarator implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			// TODO Auto-generated method stub
			return p2.getAge()-p1.getAge();
		}
	}
	/**
	 * @desc AcsAgeComarator�Ƚ���
	 * ����Person��age�Ľ���Ƚ���
	 * @author CEO
	 *
	 */
	private static class AscAgeComarator implements Comparator<Person>{
		
		@Override
		public int compare(Person p1, Person p2) {
			// TODO Auto-generated method stub
			return p1.getAge()-p2.getAge();
		}
	}
}
