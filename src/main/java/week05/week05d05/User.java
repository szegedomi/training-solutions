package week05.week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        if (isEmpty(firstName)){
            throw new IllegalArgumentException("First name must not be an empty string!");
        }
        this.firstName = firstName;
        if (isEmpty(lastName)){
            throw new IllegalArgumentException("Last name must not be an empty string!");
        }
        this.lastName = lastName;
        if(!isValidEmail(email)){
            throw new IllegalArgumentException("Provided email is not valid!!");
        }
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName(User user){
        return user.getLastName() + " " + user.getFirstName();
    }


    private boolean isEmpty(String str){
        return (str == null || "".equals(str));
    }

    private boolean isValidEmail(String email){
        return (!email.isEmpty()) && email.contains("@") && email.contains(".");
    }

}
