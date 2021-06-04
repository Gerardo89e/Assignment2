package day2Assignments;

public class Part10 {
	public static int wordCount(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.split("\\s+");
		return words.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "One two     three\nforre";
		
		System.out.println("Number of words :" +wordCount(str));
	}

}
