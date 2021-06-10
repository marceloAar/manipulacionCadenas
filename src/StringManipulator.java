//Marcelo Aceituno R
//Full Stack JAVA 0034
public class StringManipulator {
	
	 public String trimAndConcat(String a, String b) {
				
		 String st = a.trim()+ b.trim();
		 return st;	
		 
	 }
	 
	 public int getIndexOrNull(String a, char c) {
		 
		 int uno = a.indexOf(c);		 
		 return uno;
		 
	 }
	 
	 public int getIndexOrNull(String aa, String bb) {
		 
		 int dos = aa.indexOf(bb);			 
		 return dos;
		 
	 }
	 
	 public String concatSubstring(String aa, int a, int b, String bb) {
		
		 String aaa = aa.substring(a,b);		 		 
		 String ccc = aaa.concat(bb);		 
		 return ccc;
		 
	 }
	 
}	 
	 
	
	
