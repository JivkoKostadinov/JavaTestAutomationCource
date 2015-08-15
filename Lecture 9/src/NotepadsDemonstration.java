
public class NotepadsDemonstration {
	public static void main(String[] args) {
//		INotepad simpleNotepad1 = new SimpleNotepad();
//		simpleNotepad1.createAndFillPage(1, "Zaglaviice", "Qm liuti chushki");
//		simpleNotepad1.createAndFillPage(2, "Zasdfasdfaviice", "Qm liadsfsdafshki");
//		
//		simpleNotepad1.displayAllPages();
//		
//		simpleNotepad1.replaceTextOnPageWithNumber(2, "Dqdo Koleda");
//		simpleNotepad1.displayAllPages();
//		
//		simpleNotepad1.deleteTextOnPageWithNumber(2);
//		simpleNotepad1.displayAllPages();
//		
//		simpleNotepad1.createAndFillPage(33, "fffff", "Qqqqqqqqi");
//		simpleNotepad1.displayAllPages();

		
		INotepad securedNopad = new SecuredNotepad("parolka123");
		securedNopad.createAndFillPage(1, "gish", "nqkaf text");
		securedNopad.displayAllPages();
	}
}
