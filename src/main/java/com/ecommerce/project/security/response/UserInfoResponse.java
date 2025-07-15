package com.ecommerce.project.security.response;

import com.ecommerce.project.model.User;

import java.util.List;

public class UserInfoResponse {
    //once he is authenticated I want my request to return jwt token
    //why jwt token because jwt token is like a ticket for the user which user can save his end and he can use for subsequent request
    private Long id;
    private String jwtToken;

    private String username;
    private List<String> roles;
    public UserInfoResponse(Long id, String username,String jwtToken, List<String> roles) {
        this.id = id;
        this.jwtToken = jwtToken;
        this.roles = roles;
        this.username = username;
    }
    public UserInfoResponse(Long id, String username, List<String> roles) {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getUsername (){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getJwtToken(){
        return jwtToken;
    }
    public void setJwtToken(String jwtToken){
        this.jwtToken = jwtToken;
    }
    public List<String> getRoles(){
        return roles;
    }
    public void setRoles(List<String> roles){
        this.roles = roles;
    }
}
