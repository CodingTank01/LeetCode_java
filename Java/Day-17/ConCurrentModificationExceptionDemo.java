import java.util.*;

class ConCurrentModificationExceptionDemo
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
	
		for(Integer num:list){
		    list.remove(num);
		}
		System.out.print(list);
	}
}