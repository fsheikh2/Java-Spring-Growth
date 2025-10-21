package main.model;

import main.services.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username;
    private String password;
    private final LoggedUserManagementService loggedUserManagementService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }
    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        boolean loginResult = false;

        if("natalie".equals(username) && "password".equals(password)){
            loggedUserManagementService.setUsername(username);
            loginResult = true;
        }
        return loginResult;
    }

    public void setUsername(String username) {this.username = username;}

    public void setPassword(String password) {this.password = password;}

    public String getUsername() {return this.username;}

    public String getPassword() {return this.password;}
}
