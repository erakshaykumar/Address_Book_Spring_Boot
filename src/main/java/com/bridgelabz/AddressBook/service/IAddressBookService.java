package com.bridgelabz.AddressBook.service;

import com.bridgelabz.AddressBook.dto.AddressbookDTO;
import com.bridgelabz.AddressBook.model.AddressbookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int personId);

    AddressbookData createAddressbookData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO);

    void deleteAddressbookData(int personId);

    List<AddressbookData> sortAddressBookByCity();

    List<AddressbookData> getAddressBookByCity(String city);

    List<AddressbookData> sortAddressBookByState();

    List<AddressbookData> getAddressBookByState(String state);

    List<AddressbookData> sortAddressBookByZip();

    List<AddressbookData> getAddressBookByZip(String state);

    List<AddressbookData> sortAddressBookByName();
}
