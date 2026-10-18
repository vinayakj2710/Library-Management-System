
public abstract class User {

    // Member variables
    private String userId;
    private String name;
    private String contactInfo;

    private static int uniqueId = 0;

    private static int totalUsers = 0;

    //Constructors
    //Default 
    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }

    //parametarized
    public User(String name, String contactInfo) {
        this();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    //Copy constructor
    public User(User other) {
        this();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totalUsers++;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    // ID generation 
    private static String generateUniqueId() {
        return "U-" + (++uniqueId);
    }

    //Abstract methods
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
