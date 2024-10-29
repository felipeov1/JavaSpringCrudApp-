package com.projectapi.api_crud.repositories;

import com.projectapi.api_crud.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository <Address, UUID> {
}
