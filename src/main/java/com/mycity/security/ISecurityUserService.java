package com.mycity.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
