
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && firstName.length() != 0) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && lastName.length() != 0) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        // write your code here
        if (firstName.length() == 0 && lastName.length() == 0) {
            return "Unknown";
        } else if (firstName == null) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}