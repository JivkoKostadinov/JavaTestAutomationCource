
public interface INotepad {

	void createAndFillPage(int pageNumber, String title, String text);
	void replaceTextOnPageWithNumber(int pageNumber, String text);
	void deleteTextOnPageWithNumber(int pageNumber);
	void displayAllPages();
}
