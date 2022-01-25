package com.itbs.spring.controller;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itbs.spring.DTO.Account;
import com.itbs.spring.service.UserService;

@RestController
public class UserController {
  @Autowired
  private UserService userService;
  
  @GetMapping(value="/user/{id}")
  @RolesAllowed({"user_role"})
  public List<Account> showEmployees(@PathVariable("id") String id) {     
    List<Account> accounts = userService.showEmployees(id);
    // displaying accounts
    for(Account acct : accounts) {
      System.out.println(acct.getEmpId());
      System.out.println(acct.getAccountId());
      System.out.println(acct.getBranch());
    }
    return accounts;          
  }
}