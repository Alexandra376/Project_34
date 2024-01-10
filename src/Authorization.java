interface Authorization {
    void checkPassword();
}
class User implements Authorization {
    String currentPassword;
    String enteredPassword;
    public User(String currentPassword, String enteredPassword) {
        this.currentPassword = currentPassword;
        this.enteredPassword = enteredPassword;
    }
    public void checkPassword() {
        if (enteredPassword.equals(currentPassword)) {
            System.out.println("It's correct password");
        } else {
            System.out.println("It's incorrect password. Try it again!");
        }
    }
}
class Admin implements Authorization {
    String currentPassword;
    String enteredPassword;
    public Admin(String currentPassword, String enteredPassword) {
        this.currentPassword = currentPassword;
        this.enteredPassword = enteredPassword;
    }
    public void checkPassword() {
        if (enteredPassword.equals(currentPassword)) {
            System.out.println("It's correct password");
        } else {
            System.out.println("It's incorrect password. Try it again!");
        }
    }
}
