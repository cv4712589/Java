package tw.byron.learn;

import java.util.LinkedList;

public class Byron32 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add(0, "Brad");	// 0
		list.add(0, "Amy");	// 1
		list.add(0, "Peter");	// 1
		list.add(0, "Tony");
		//大家都想搶0這個位子，所以排序變成倒序
		System.out.println(list.size());
		System.out.println(list);
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---");
		for (String name : list) {
			System.out.println(name);
		}

	}

}