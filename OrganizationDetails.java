package com.spring.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrganizationDetails   {

     @Id
    private long organisationId;
    private String OrganisationName;

    public OrganizationDetails(long organisationId, String organisation_name) {
        super();
        this.organisationId = organisationId;
        OrganisationName = organisation_name;
    }
    public OrganizationDetails()
    {
        super();
    }


    public long getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(long organisationId) {
        this.organisationId = organisationId;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String organisationName) {
        OrganisationName = organisationName;
    }

    @Override
    public String toString() {
        return "OrganizationDetails{" +
                "organisation_id=" + organisationId +
                ", Organisation_name='" + OrganisationName + '\'' +
                '}';
    }
}
