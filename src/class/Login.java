
public class Login {
    
     // variables privadas
   private String username = "admin";
    String password = "123456";

    // constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   public boolean validateLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // método para mostrar info
    public void showInfo() {
        System.out.println("Usuario actual: " + this.username);
    }
}


