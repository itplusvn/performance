package testloop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestLoop {
//	private static List<Integer> list = new ArrayList<>();
	//private String[] hashParams = {"a", "a","a","a"};
	private static long startTime;
	private static long endTime;
	
	private static long startTime1;
	private static long endTime1;
//	static {
//		for (int i = 0; i < 1_00_00_000; i++) {
//			list.add(i);
//		}
//	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String[] elements = new String[1000000];
		int i=0;
		for(i=0; i<1000000; i++){
			elements[i] = "str " + i;
		}
		
		//type1
		startTime = Calendar.getInstance().getTimeInMillis();
		for(String str: elements){
			System.out.println(str);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		
		//type2
		startTime1 = Calendar.getInstance().getTimeInMillis();
		int size = elements.length;
		for(int j = 0; j < size ; j++)
        {
			System.out.println(elements[j]);
			
        }
		endTime1 = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("For each loop::" + (endTime-startTime) + "ms");
        System.out.println("Using [int size = list.size(); int j = 0; j < size ; j++] :: " + (endTime1 - startTime1) + " ms");
		
	}
}
