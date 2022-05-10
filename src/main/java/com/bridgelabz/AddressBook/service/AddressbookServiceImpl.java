package com.bridgelabz.AddressBook.service;

import com.bridgelabz.AddressBook.dto.AddressbookDTO;
import com.bridgelabz.AddressBook.model.AddressbookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressbookServiceImpl implements IAddressBookService {
    @Override
    public List<AddressbookData> getAddressbookData() {
        List<AddressbookData> addressbookDataList = new ArrayList<>();
        addressbookDataList.add(new AddressbookData(1, new AddressbookDTO("Akshay", "7057082582")));
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, new AddressbookDTO("Akki", "1234567890"));
        return addressbookData;
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(1, addressbookDTO);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId, addressbookDTO);
        return addressbookData;
    }

    @Override
    public void deleteAddressbookData(int personId) {

    }
}
