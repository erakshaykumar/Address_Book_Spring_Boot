package com.bridgelabz.AddressBook.model;

import com.bridgelabz.AddressBook.dto.AddressbookDTO;
import lombok.Data;

/**
Use Of Lombak In Addressbook Annotations
 */
@Data
public class AddressbookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;


    public AddressbookData(int personId, AddressbookDTO addressbookDTO) {
        this.personId = personId;
        this.updateAddressBookdata(addressbookDTO);

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
