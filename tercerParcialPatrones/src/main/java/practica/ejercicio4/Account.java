package practica.ejercicio4;

public class Account {
    private String user;
    private String password;

    public Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void info() {
        System.out.println(">    User: "+user+" (Password: "+password+")");
    }

}
