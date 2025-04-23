import java.util.ArrayList;
import java.util.HashSet;

public class PracticeProblem {

	public static ArrayList<String> perms(String str) {
		
		ArrayList<String> permutations = new ArrayList<String>();

		permDemoHelper("",str, permutations);
		return permutations;
	}

	public static void permDemoHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
		if(unusedLetters.length()==0){
			permutations.add(usedLetters);
			return;
		}

		for (int i=0;i<unusedLetters.length();i++){
			permDemoHelper(usedLetters + unusedLetters.charAt(i),unusedLetters.substring(0,i)+ unusedLetters.substring(i+1),permutations);

		}
	}
	public static ArrayList<String> permsUnique(String str){
		HashSet<String> permutation = new HashSet<>();
		permUniqDemoHelper("",str, permutation);
		return new ArrayList<>(permutation);

	}
	public static void permUniqDemoHelper(String usedLetters, String unusedLetters, HashSet<String> permutation) {
		if(unusedLetters.length()==0){
			permutation.add(usedLetters);
			return;
		}

		for (int i=0;i<unusedLetters.length();i++){
			permUniqDemoHelper(usedLetters+unusedLetters.charAt(i),unusedLetters.substring(0,i)+unusedLetters.substring(i+1),permutation);
		}

	}
}
