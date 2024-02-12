/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Navod Madusanka
 */
public class User {
    public final String n;
    public final String e;
    public final String p;

    public User(UserBuilder builder) {
        this.n = builder.u;
        this.e = builder.e;
        this.p = builder.p;
    }

    public String getUsername() {
        return n;
    }

    public String getEmail() {
        return e;
    }

    public String getPassword() {
        return p;
    }

    public User() {
        this.n = null;
        this.e = null;
        this.p = null;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "username='" + n + '\'' +
                ", email='" + e + '\'' +
                ", password='" + p + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String u;
        private String e;
        private String p;
        public UserBuilder() {
           
        }
        public UserBuilder setUsername(String username){
            this.u = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.e = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.p = password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
