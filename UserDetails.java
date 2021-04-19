package com.spring.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

    private long organisationId;
    @Id
    private long userid;
    private String username;
    private String address;

    public UserDetails(long organisationId, long userid, String username, String address) {
        super();
        this.organisationId = organisationId;
        this.userid = userid;
        this.username = username;
        this.address = address;
    }
    public UserDetails()
    {
        super();
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public long getOrganization_id() {
        return organisationId;
    }

    public void setOrganization_id(long organization_id) {
        this.organisationId = organization_id;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "organisation_id=" + organisationId +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
