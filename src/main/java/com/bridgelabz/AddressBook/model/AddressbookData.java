package com.bridgelabz.AddressBook.model;

import com.bridgelabz.AddressBook.dto.AddressbookDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

/**
Use Of Lombak In Addressbook Annotations
 */
@Data
@Entity
@Table(name="contact_table")
public class AddressbookData {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;


    public AddressbookData( AddressbookDTO addressbookDTO) {
        this.updateAddressBookdata(addressbookDTO);

    }

    public AddressbookData() {

    }

    public void updateAddressBookdata(AddressbookDTO addressbookDTO) {
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.phone = addressbookDTO.phone;
        this.email = addressbookDTO.email;
    }
}
