import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Content:根据Comparator<Person>或者Comparable<Person>
 * 分别对Int age,String name,进行升序降序排序和判断二个person是否相等
 * Comparator<Person>:外部-->建立一个该类的选择器来进行排序,称为比较器
 * Comparable<Person>:内部-->类实现接口,该类支持排序,称为排序接口
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
		//对list排序
		//根据Person实现Comparable<String>接口进行排序，根据Name排序
		Collections.sort(list);
		System.out.printf("yuan:%s\n",list);
		//升序排序
		Collections.sort(list,new DescAgeComarator());
		System.out.printf("Desc:%s\n",list);
		//降序排序
		Collections.sort(list,new AscAgeComarator());
		System.out.printf("Asc:%s\n",list);
		
		//判断二个person是否相等
		testEquals();
	}
	/**
	 * @desc 测试二个person是否相等
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
	 * @desc DescAgeComarator比较器
	 * 它是Person的age的升序比较器
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
	 * @desc AcsAgeComarator比较器
	 * 它是Person的age的降序比较器
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
