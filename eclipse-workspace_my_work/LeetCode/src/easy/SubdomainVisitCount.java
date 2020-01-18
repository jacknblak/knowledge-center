package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubdomainVisitCount {
	public static void main(String[] args) {
		String[] inputDomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		System.out.println(subdomainVisits(inputDomains).toString());

	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> frequencyCounter = new HashMap<String, Integer>();
		for(String string : cpdomains) {
			String counterArray[] = string.split(" ");
			int count = Integer.valueOf(counterArray[0]);
			customMapPut(frequencyCounter,counterArray[1],count);
			String domainArray [] = counterArray[1].split("\\.");
			if(domainArray.length == 2) {
				customMapPut(frequencyCounter, domainArray[1], count);
			}
			if(domainArray.length ==3) {
				customMapPut(frequencyCounter, domainArray[1]+"."+domainArray[2], count);
				customMapPut(frequencyCounter, domainArray[2], count);
			}
		}
		List<String> result = new ArrayList<String>();
		frequencyCounter.forEach((key,value) ->{
			result.add(value+" "+key);
		});
		return result;
	}

	private static void customMapPut(Map<String, Integer> frequencyCounter, String string,int count) {
		// TODO Auto-generated method stub
		if(frequencyCounter.containsKey(string)) {
			frequencyCounter.put(string, frequencyCounter.get(string)+count);
		}else {
			frequencyCounter.put(string, count);
		}
		
	}

}
