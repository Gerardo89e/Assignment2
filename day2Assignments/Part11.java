package day2Assignments;

public class Part11 {
	public static int countStringRepeat(String s,char c) {
		int result=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AssTroMe";
		char c='s';
		System.out.println(countStringRepeat(str,c));
	}

}
