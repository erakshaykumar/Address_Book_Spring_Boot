package com.bridgelabz.AddressBook.repository;

import com.bridgelabz.AddressBook.model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressbookRepository extends JpaRepository<AddressbookData,Integer> {
}
