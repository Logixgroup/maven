package practicejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Freq {
	public static void main(String[] args)
	{
		int[] arr= {1,2,1,1,1,23,24,3,23};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		//for (Entry<Integer, Integer> entry: map.entrySet()) {
			
			for (int i=0; i<arr.length; i++ ) {

				
				if(map.containsKey(arr[i]))
						{map.put(arr[i],map.get(arr[i])+1);
						}
				else {map.put(arr[i], 1);
				}
	}
			System.out.println(map);
			for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
				System.out.println("Ele: "+ entry.getKey() + " Frequency: " + entry.getValue());
			}
								
			}			
				
				
	}
