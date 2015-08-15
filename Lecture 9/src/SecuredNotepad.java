import java.util.Scanner;


public class SecuredNotepad extends SimpleNotepad {

	private String password;
	
	public SecuredNotepad(String password){
		super();
		this.password = password;
	}

	@Override
	public void createAndFillPage(int pageNumber, String title, String text) {
		if(isPasswordCorrect()) {
			super.createAndFillPage(pageNumber, title, text);
		}
	}

	@Override
	public void replaceTextOnPageWithNumber(int pageNumber, String text) {
		if(isPasswordCorrect()) {
			super.replaceTextOnPageWithNumber(pageNumber, text);
		}
	}

	@Override
	public void deleteTextOnPageWithNumber(int pageNumber) {
		if(isPasswordCorrect()) {
			super.deleteTextOnPageWithNumber(pageNumber);
		}
	}

	@Override
	public void displayAllPages() {
		if(isPasswordCorrect()) {
			super.displayAllPages();
		}
	}
	
	private boolean isPasswordCorrect() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the notepad password: ");
		for (int i = 0; i < 3; i++) {
			String curPassword = scan.nextLine();
			if(this.password.equals(curPassword)){
				System.out.println("Correct!");
				return true;
			} else {
				System.out.println("Wrong Password! Try again! So:  ");
			}
		}
		return false;
	}
}
