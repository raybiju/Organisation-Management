package com.spring.springrest.dao;

import com.spring.springrest.entities.OrganizationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationDao extends JpaRepository<OrganizationDetails,Long> {


}
