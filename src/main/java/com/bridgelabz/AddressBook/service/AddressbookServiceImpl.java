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
        return addressbookRepository.findAll();
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        return addressbookRepository
                .findById(personId)
                .orElseThrow(()->new AddressbookException("Person with perssonId "+personId+" doesnot exists"));
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDTO);
        log.debug("AddressbookData: "+addressbookData.toString());
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
            AddressbookData addressbookData = this.getAddressbookDataById(personId);
            addressbookData.updateAddressBookdata(addressbookDTO);
            return addressbookRepository.save(addressbookData);
    }

    @Override
    public void deleteAddressbookData(int personId) {
        AddressbookData addressbookData = this.getAddressbookDataById(personId);
        addressbookRepository.delete(addressbookData);
    }

    @Override
    public List<AddressbookData> sortAddressBookByCity() {
        return addressbookRepository.sortByCity();
    }

    @Override
    public List<AddressbookData> getAddressBookByCity(String city) {
        return addressbookRepository.findAllByCity(city);
    }

    @Override
    public List<AddressbookData> sortAddressBookByState() {
        return addressbookRepository.sortByState();
    }

    @Override
    public List<AddressbookData> getAddressBookByState(String state) {
        return addressbookRepository.findAllByState(state);
    }

    @Override
    public List<AddressbookData> sortAddressBookByZip() {
        return addressbookRepository.sortByZip();
    }

    @Override
    public List<AddressbookData> getAddressBookByZip(String zip) {
        return addressbookRepository.findAllByZip(zip);
    }

    @Override
    public List<AddressbookData> sortAddressBookByName() {
        return addressbookRepository.sortByName();
    }
}