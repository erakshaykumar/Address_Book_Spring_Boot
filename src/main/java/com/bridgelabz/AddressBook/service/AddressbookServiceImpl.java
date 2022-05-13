package com.bridgelabz.AddressBook.service;

import com.bridgelabz.AddressBook.dto.AddressbookDTO;
import com.bridgelabz.AddressBook.exception.AddressbookException;
import com.bridgelabz.AddressBook.model.AddressbookData;
import com.bridgelabz.AddressBook.repository.AddressbookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressbookServiceImpl implements IAddressBookService {

    @Autowired
    private AddressbookRepository addressbookRepository;


    List<AddressbookData> addressbookDataList = new ArrayList<>();

    @Override
    public List<AddressbookData> getAddressbookData() {
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        return addressbookDataList.stream()
                .filter(addressbookData -> addressbookData.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() -> new AddressbookException("Person Not found"));
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDataList.size() + 1, addressbookDTO);
        log.debug("AddressbookData: "+addressbookData.toString());
        addressbookDataList.add(addressbookData);
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
            AddressbookData addressbookData = this.getAddressbookDataById(personId);
            addressbookData.updateAddressBookdata(addressbookDTO);
            addressbookDataList.set(personId - 1, addressbookData);
            return addressbookData;
    }

    @Override
    public void deleteAddressbookData(int personId) {
        int i = 1;
            addressbookDataList.remove(personId - 1);
            for (AddressbookData addressbookData : addressbookDataList) {
                addressbookData.setPersonId(i++);
            }
    }
}