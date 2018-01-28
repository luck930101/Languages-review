
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//should import "java.util.List" instead of " java.awt.List;"

public class ListReview {
	// List is an interface 
	public void listreview(){
		List<String> l1 = new LinkedList<String>();
		l1.add("a");
		l1.add("b");
//		l1.add("12", 3);
		System.out.println(l1);
		System.out.print(" Loop: ");
		for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1);  //.get(index)
        }
		
		
	}
	public void arraylistreview(){
		ArrayList<Object> al1 = new ArrayList<Object>();
		ArrayList<Object> al2 = new ArrayList<Object>();
		al1.add(12);
		al1.add("string");
		al2.add(1);
		al2.add("im herer");
		al1.addAll(al2);
		for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));  //.get(index)
        }
		System.out.println(al1);
		System.out.println(al2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListReview lr = new ListReview();
		lr.arraylistreview();
		System.out.println("***********************************");
		lr.listreview();
	}

}
