
public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Info: ");
        System.out.println("Name: " + getName());
        System.out.println("Employees Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBooks() {
    }

    public void removeBook() {
    }
}
