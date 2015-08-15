
public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	protected String password;
	protected boolean isStartDevice;
	protected boolean isStarted;
	
	public ElectronicSecuredNotepad(String password) {
		super(password);
		
	}

	@Override
	public void start(){
		if (isPasswordCorrect()) {
	
		 this.isStartDevice = true;
		 System.out.println("Turn ON the device");
		 
		}
	}

	@Override
	public void stop(){
		if (isPasswordCorrect()){
			
		this.isStartDevice = false;
		System.out.println("Turn OFF the device");
		
		}
	}

	@Override
	public void isStarted() {
		if (this.isStartDevice == true && isPasswordCorrect()) {
			
			this.isStarted = true;
			
			System.out.println("The device is : " + this.isStarted);
		}
	}

	@Override
	public void createAndFillPage(int pageNumber, String title, String text) {
		if (isPasswordCorrect() && this.isStartDevice == true ) {
			
			super.createAndFillPage(pageNumber, title, text);
		}

	}

	@Override
	public void replaceTextOnPageWithNumber(int pageNumber, String text) {
		if (isPasswordCorrect() && this.isStartDevice == true ) {
			
		super.replaceTextOnPageWithNumber(pageNumber, text);
		
		}
	}

	@Override
	public void deleteTextOnPageWithNumber(int pageNumber) {
		if (isPasswordCorrect() && this.isStartDevice == true ) {
			
		super.deleteTextOnPageWithNumber(pageNumber);
		
		}
	}

	@Override
	public void displayAllPages() {
		if (isPasswordCorrect() && this.isStartDevice == true ) {
			
		super.displayAllPages();
		
		}
	}
	


}
