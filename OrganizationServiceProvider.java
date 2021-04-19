package com.spring.springrest.services;

import com.spring.springrest.dao.OrganisationDao;
import com.spring.springrest.entities.OrganizationDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrganizationServiceProvider implements OrganizationService {
    @Autowired
    private OrganisationDao organisationdao;

    public List<OrganizationDetails> getOrganizationDetails() {
        return organisationdao.findAll();
    }

    public OrganizationDetails addOrganizationDetails(OrganizationDetails organizationdetails) {
        organisationdao.save(organizationdetails);
        return organizationdetails;
    }




}
