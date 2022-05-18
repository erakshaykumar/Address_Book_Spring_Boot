package com.bridgelabz.AddressBook.repository;

import com.bridgelabz.AddressBook.model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressbookRepository extends JpaRepository<AddressbookData,Integer> {

    @Query(value = "select * from contact_table order by city",nativeQuery = true)
    List<AddressbookData> sortByCity();

    @Query(value = "select * from contact_table where city = :city",nativeQuery = true)
    List<AddressbookData> findAllByCity(String city);

    @Query(value = "select * from contact_table order by state",nativeQuery = true)
    List<AddressbookData> sortByState();

    @Query(value = "select * from contact_table where state = :state",nativeQuery = true)
    List<AddressbookData> findAllByState(String state);

    @Query(value = "select * from contact_table order by zip",nativeQuery = true)
    List<AddressbookData> sortByZip();

    @Query(value = "select * from contact_table where zip = :zip",nativeQuery = true)
    List<AddressbookData> findAllByZip(String zip);

    @Query(value = "select * from contact_table order by first_name",nativeQuery = true)
    List<AddressbookData> sortByName();
}
