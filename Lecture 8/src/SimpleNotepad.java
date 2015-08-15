
import java.util.ArrayList;
import java.util.List;


public class SimpleNotepad implements INotepad {
	List<Page> pages;
	
	public SimpleNotepad() {
		this.pages = new ArrayList<Page>();
	}
	
	@Override
	public void createAndFillPage(int pageNumber, String title, String text) {
		Page page = new Page();
		page.addText(text);
		page.addTitle(title);
		page.addPageNumber(pageNumber);
		this.pages.add(page);
	}

	@Override
	public void replaceTextOnPageWithNumber(int pageNumber, String text) {
		for (Page page : pages) {
			if(page.getPageNumber() == pageNumber) {
				page.removeText();
				page.addText(text);
				break;
			}
		}
	}

	@Override
	public void deleteTextOnPageWithNumber(int pageNumber) {
		for (Page page : pages) {
			if(page.getPageNumber() == pageNumber) {
				page.removeText();
				break;
			}
		}
	}

	@Override
	public void displayAllPages() {
		for (Page page : pages) {
			System.out.println(page.viewPage());
		}
	}

}
