package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfSpecialEquivalentStrings {

	public static void main(String[] args) {
		String []inputString = {"zsptcwcghr","crcwhspgzt"} ;
		System.out.println(numSpecialEquivGroups(inputString));

	}

	public static int numSpecialEquivGroups(String[] A) {
		int result = 0;
		List<String> tempList = new ArrayList<>(Arrays.asList(A));
		for (int i = 0; i < tempList.size(); i++) {
			for (int j = i + 1; j < tempList.size(); j++) {
				if (isStringEqual(tempList.get(i), tempList.get(j))) {
					tempList.remove(j);
					j--;
				}
			}
			result++;
			tempList.remove(i);
			i--;
		}
		return result;
	}

	private static boolean isStringEqual(String string1, String string2) {
		Map<Character,Integer> oddMap = new HashMap<>();
        Map<Character,Integer> evenMap = new HashMap<>();
        for(int i = 0 ; i < string1.length();i++){
            if(i%2 == 0){
                evenMap.put(string1.charAt(i),evenMap.getOrDefault(string1.charAt(i),0)+1);
            }
            if(i%2 == 1){
                oddMap.put(string1.charAt(i),oddMap.getOrDefault(string1.charAt(i),0)+1	);
            }
        }
        for(int i = 0 ; i < string2.length();i++){
            if(i%2 == 0){
                if(evenMap.containsKey(string2.charAt(i))){
                    evenMap.put(string2.charAt(i),evenMap.get(string2.charAt(i))-1);
                    if(evenMap.get(string2.charAt(i)) == 0){
                        evenMap.remove(string2.charAt(i));
                    }
                }else {
                    return false;
                }
            }else {
                if(oddMap.containsKey(string2.charAt(i))){
                    oddMap.put(string2.charAt(i),oddMap.get(string2.charAt(i))-1);
                    if(oddMap.get(string2.charAt(i)) == 0){
                        oddMap.remove(string2.charAt(i));
                    }
                }else {
                    return false;
                }
            }
        }
        return evenMap.isEmpty() && oddMap.isEmpty();
	}
}
