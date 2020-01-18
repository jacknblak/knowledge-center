package easy;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedbyCharacters {
	public static void main(String[] args) {
		String inputWords[] = {
				"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
				"ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
				"boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
				"nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
				"hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
				"juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
				"oxgaskztzroxuntiwlfyufddl",
				"tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
				"qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv",
				"sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
				"hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
				"cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob",
				"qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
				"qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs" };
		String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
		System.out.println(countCharacters(inputWords, chars));
	}

	public static int countCharacters(String[] words, String chars) {
		Map<Character, Integer> charSet = new HashMap<>();

		int result = 0;
		for (String word : words) {
			charSet.clear();
			for (Character ch : chars.toCharArray()) {
				if (charSet.containsKey(ch)) {
					charSet.put(ch, charSet.get(ch) + 1);
				} else {
					charSet.put(ch, 1);
				}
			}
			boolean match = true;
			for (char ch : word.toCharArray()) {
				if (charSet.containsKey(ch)) {
					int count = charSet.get(ch);
					if (count > 1) {
						charSet.put(ch, charSet.get(ch) - 1);
					} else {
						charSet.remove(ch);
					}
				} else {
					match = false;
					break;
				}
			}
			if (match) {
				result += word.length();
			}
		}
		return result;

	}

}
