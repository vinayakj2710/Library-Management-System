
public class Member extends User {

    private int borrowedBooksCount;
    private static final int Max_borrowed_limit = 5;

    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Info:");
        System.out.println("Name : " + getName());
        System.out.println("Books borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < Max_borrowed_limit;
    }

    public void incrementBooksCount() {
        borrowedBooksCount++;
    }

    public void decrementBooksCount() {
        borrowedBooksCount--;
    }

    public int getBooksCount() {
        return borrowedBooksCount;
    }

}
