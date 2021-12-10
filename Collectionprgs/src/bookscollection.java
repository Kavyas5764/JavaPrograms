import java.util.ArrayList;

public class bookscollection {

	public static void main(String[] args) {
		ArrayList<Books> list=new ArrayList<>();
		Books b1 = new Books("\nThe history of tom jones","\nHenry",1301,600);
		Books b2 = new Books("\nThe red and the black","\nStendhal",1302,900);
		Books b3 = new Books("\nDiscovery of India","\nJawaharlal Nehru",1303,500);
		
		Books b4 = new Books("\nThe history of tom jones","\nHenry",1301,600);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.remove(b4);
		
		
		
		
		for(Books b : list)
		{
			System.out.println("\nBookname:"+b.bookname+"\n Author:"+b.author+" \nBookID:"+b.id+"\nBook Price:"+b.price);
		}
	}

}

class Books{
	String bookname,author;
	int id,price;
	public Books(String bookname, String author, int id, int price) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.id = id;
		this.price = price;
	}
	
}
