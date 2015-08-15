
public class Page {

	private String title;
	private String text;
	private int pageNumber;
	
	void addText(String text) {
		if(this.text == null) {
			this.text = text;
		} else {
			this.text += text;
		}
	}
	
	int getPageNumber() {
		return pageNumber;
	}
	
	void addPageNumber(int pageNumber) {
		if(this.pageNumber == 0) {
			this.pageNumber = pageNumber;
		} 
	}
	/**
	 * 
	 * @param title the title that you want to add to your page title
	 * 
	 * @return does not return anything just adds the title if it is null, and NOTHING else
	 */
	void addTitle(String title){
		if(this.title == null) {
			this.title = title;
		} 
	}
	
	void removeText(){
		this.text = "";
	}
	
	String viewPage() {
		return this.pageNumber + "\n" + this.title + "\n" + this.text;
	}
}
