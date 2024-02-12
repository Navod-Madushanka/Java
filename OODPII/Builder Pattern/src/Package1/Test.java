package Package1;

class User{
    private final int id;
    private final String name;
    private final String mobile;
    private User(User.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.mobile = builder.mobile;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
    static class Builder{
        private int id;
        private String name;
        private String mobile;
        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        User navod = new User.Builder().setId(1).setName("Navod").setMobile("0772967997").build();
        System.out.println(navod);
    }
}
