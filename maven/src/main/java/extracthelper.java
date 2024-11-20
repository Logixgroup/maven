import org.openqa.selenium.grid.Main;

public class extracthelper {
	
	
	public static  void  extracted(String input) {
		
		String inp = input;
		
		char[] c = inp.toCharArray();
		
		StringBuilder digits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
		for (char i : c) {
			if (Character.isLetter(i)){
				letters.append(i);
			}
				else if (Character.isDigit(i)){
					digits.append(i);
				}
				else if (!Character.isWhitespace(i)) {
					specialCharacters.append(i);
					
				}	
			
		}
		
		System.out.println (" Letters :" +letters + "\n"+ " Digits :" + digits + "\n" + " specialCharacters : " +specialCharacters );
		
				
		}
	
	
			
		
	

public static void main(String[] args){
	
	String input = 	"abch#%# %#$#$ j9764%37837";
	extracted(input);
	
	
}

}