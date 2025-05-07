public class User {

    public void userRegistration(String username, String password) throws Exception {
        try {
            validatePassword(password);
            System.out.println("User is registered with username " + username);
        }catch (IllegalArgumentException e) {
            throw new Exception("Error from User class occurred while registering "+username, e);
        }
    }

    private void validatePassword(String password){
        if(password.length() < 6){
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }
    }
}
