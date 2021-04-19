package com.spring.springrest.services;

import com.spring.springrest.entities.OrganizationDetails;

import java.util.List;

public interface OrganizationService {

    public List<OrganizationDetails> getOrganizationDetails();

    public OrganizationDetails addOrganizationDetails(OrganizationDetails organizationdetails);
}