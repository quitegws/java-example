package algorithm;

import java.util.ArrayList;

public class LetterCombination {
	
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public ArrayList<String> letterCombinations(String digits) {
        // Write your code here
    	if (digits == null ||  digits.length() == 0) {
    		return new ArrayList<String>();
    	}
    	char firstDigit = digits.charAt(0);
    	ArrayList<String> result = new ArrayList<>();
    	ArrayList<String> privious = letterCombinations(digits.substring(1));
    	ArrayList<Character> cor = new ArrayList<>();
    	
    	switch (firstDigit) {
    	case '2':
    		cor.add('a');
    		cor.add('b');
    		cor.add('c');
    		break;
    	case '3':
    		cor.add('d');
    		cor.add('e');
    		cor.add('f');
    		break;
    	case '4':
    		cor.add('g');
    		cor.add('h');
    		cor.add('i');
    		break;
    	case '5':
    		cor.add('j');
    		cor.add('k');
    		cor.add('l');
    		break;
    	case '6':
    		cor.add('m');
    		cor.add('n');
    		cor.add('o');
    		break;
    	case '7':
    		cor.add('p');
    		cor.add('q');
    		cor.add('r');
    		cor.add('s');
    		break;
    	case '8':
    		cor.add('t');
    		cor.add('u');
    		cor.add('v');
    		break;
    	case '9':
    		cor.add('w');
    		cor.add('x');
    		cor.add('y');
    		cor.add('z');
    		break;
    	default :
    		break;
    		
    	}
    	if (privious.size() == 0){
    		for (Character c : cor) {
    			result.add(String.valueOf(c));
    		}
    		return result;
    	} else {
    		for (Character c : cor) {
    			for (String s : privious) {
    				result.add(c + s);
    			}
    		}
    		
    	}
    	
    	
    	return result;
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	ArrayList<String> list = new LetterCombination().letterCombinations("234");
    	utils.PrintUtils.printList(list);
    }
}