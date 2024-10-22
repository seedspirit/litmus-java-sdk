package io.litmuschaos.request;

public class LoginRequest {

    private final String username;
    private final String password;

    public LoginRequest(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String username;
        private String password;

        public Builder() {}

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public LoginRequest build() {
            return new LoginRequest(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
