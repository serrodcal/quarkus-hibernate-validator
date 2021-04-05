package com.serrodcal.resource.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateUserRequest {

    @Email
    @NotBlank(message = "email may not be blank")
    private String email;

    @Size(min = 4, max = 15, message = "username should have size [{min},{max}]")
    @NotBlank(message = "username may not be blank")
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+$", message = "\"username\" should start with a letter and should only accept letters and numbers")
    private String username;

    @NotBlank(message = "firstName may not be blank")
    private String firstName;

    @NotBlank(message = "lastName may not be blank")
    private String lastName;

    private boolean admin;

    @NotBlank(message = "hashedPassword may not be blank")
    private String hashedPassword;

    public CreateUserRequest() { }

    public CreateUserRequest(@Email @NotBlank(message = "email may not be blank") String email, @Size(min = 4, max = 15, message = "username should have size [{min},{max}]") @NotBlank(message = "username may not be blank") @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+$", message = "\"username\" should start with a letter and should only accept letters and numbers") String username, @NotBlank(message = "firstName may not be blank") String firstName, @NotBlank(message = "lastName may not be blank") String lastName, boolean admin, @NotBlank(message = "hashedPassword may not be blank") String hashedPassword) {
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.admin = admin;
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

}
