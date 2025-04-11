package LAB7.task4;

public class UserAccount { String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed! Incorrect password");
            return false;
        }
    }

    public boolean changePassword(String oldPassword, String newPassword){
        if (oldPassword.equals(password)){
            System.out.println("Password changed successfully!");
            password = newPassword;
            return true;
        }else {
            System.out.println("Password change failed! Incorrect old password");
            return false;
        }
    }
}
