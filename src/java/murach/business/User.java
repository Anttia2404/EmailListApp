package murach.business;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;

    // Constructor mặc định
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = null; // mặc định chưa có ngày sinh
    }

    // Constructor không có dateOfBirth
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = null;
    }

    // Constructor đầy đủ có dateOfBirth
    public User(String firstName, String lastName, String email, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter và Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Optional: hiển thị thông tin user
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
               ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
    }
}
