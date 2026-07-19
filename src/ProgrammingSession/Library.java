package ProgrammingSession;

public class Library {

    private String bookName;
    private boolean isIssued = false;

    public Library(String bookName) {
        this.bookName = bookName;
    }

    public void displayBookName() {
        System.out.println("Book Name : " + bookName);
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book Issued : " + bookName);
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book Returned : " + bookName);
        } else {
            System.out.println("Book was not issued.");
        }
    }


}
