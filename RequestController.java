package com.spring.springrest.controller;

import com.spring.springrest.entities.OrganizationDetails;
import com.spring.springrest.entities.UserDetails;
import com.spring.springrest.services.OrganizationService;
import com.spring.springrest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class RequestController {
 @Autowired
private UserService userservice;
 @Autowired
  private OrganizationService organizationservice;

@GetMapping("/userdetails/{organisationId}")
 public List<UserDetails> getUserDetails(@PathVariable Long organisationId){
 return this.userservice.getUserDetails(organisationId);
}

@PostMapping("/adduserdetails")
public UserDetails addUserDetails( @RequestBody UserDetails userdetails )
{

 return  this.userservice.addUserDetails(userdetails);
}

@GetMapping("/organisationdetails")
 public List<OrganizationDetails> getOrganisationDetails()

{
 return this.organizationservice.getOrganizationDetails();
}

@PostMapping("/addorganizationdetails")
 public OrganizationDetails addOrganizationDetails(@RequestBody OrganizationDetails organizationdetails)
{
 return this.organizationservice.addOrganizationDetails(organizationdetails);
}

}
