package JustCode;

public class User {
    private final String username;
    private final String email;
    private final String password;
    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String username;
        private String email;
        private String password;
        public UserBuilder(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }
        public UserBuilder setUsername(String username){
            this.username = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
