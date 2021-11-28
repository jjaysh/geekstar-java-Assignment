import java.util.Scanner;
public class Word 
{
    public static void main(String[] args) 
    {
		String s="Search Word";
		search(s);
	}
	public static void search(String str)
    {
		int index=str.indexOf("Hello");
		if(index==-1) {
			System.out.println("Word not found");
		}
		else {
			System.out.println("Word is found");
		}
	}

}