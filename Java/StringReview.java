
public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456";
		for (int i = 0;i< s.length();i++){
			System.out.print(s.charAt(i));
		}
		System.out.println("****************");
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('1'));
		System.out.println(s.indexOf('3'));
		System.out.println(s.substring(2, 4));
		String s1 = "nishichunzhu";
		String s3 = "7890";
		String s2 = "nishichunzhu";
		char c1 = 'a';
		char c2 = 'a';
		if (c1==c2){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
		
		String s6 = "pwwkew";
		char w = s6.charAt(2);
		String substring = s6.substring(1, 2);
		
		System.out.println("where is w "+ substring.indexOf('w'));
		
		if(substring.indexOf(w)==(-1)){

			System.out.println("substring is "+ substring);
			System.out.println(s6.charAt(2));
			System.out.println("not find");
		}
		else{
			System.out.println("found!");
		}
		int i =0; 
		System.out.println(++i);
		int j = 0;
		System.out.println(j++);
		
	}

}
