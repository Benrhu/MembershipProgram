package com.example.MembershipProgram.Security;

public interface HasheablePass {

    String passHash(String password);

    boolean passwordVerification(String hash, String password);
}
