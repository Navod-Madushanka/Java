package anti_patterns;

class User {
    private final String n;
    private final String e;
    private final String p;

    protected User(UserBuilder builder) {
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

class OldFeatureProcessor {
    // Outdated method for processing old feature
    public void processOldFeature() {
        // Implementation for processing the old feature
    }
}

public class UserManager {
    public void createUser(String username, String password) {
        // Implementation for creating a user
        // ...

        // Poltergeist behavior: Handling permissions
        PermissionsManager permissionsManager = new PermissionsManager();
        permissionsManager.assignDefaultPermissions(username);

        // Poltergeist behavior: Sending notifications
        NotificationService notificationService = new NotificationService();
        notificationService.sendWelcomeNotification(username);

        // Poltergeist behavior: Logging
        Logger.log("User created: " + username);
    }

    // Other methods for user management
}


public class FunctionalDecompositionAntiPattern {
    // Function 1: Process order details
    public void processOrderDetails(Order order) {
        // Implementation for processing order details
    }

    // Function 2: Validate payment
    public boolean validatePayment(Payment payment) {
        // Implementation for validating payment
        return true;
    }

    // Function 3: Generate invoice
    public Invoice generateInvoice(Order order, Payment payment) {
        // Implementation for generating an invoice
        return new Invoice();
    }

    // ... more functions representing specific operations
}


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

// Usage in another class
class CalculatorUser {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Result: " + result);
    }
}


public class LegacyCalculator {
    // Old implementation of a calculator with outdated methods
    public int add(int a, int b) {
        return a + b;
    }

    // More outdated methods...
}

