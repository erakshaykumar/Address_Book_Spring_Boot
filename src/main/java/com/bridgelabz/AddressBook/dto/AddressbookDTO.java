package com.bridgelabz.AddressBook.dto;

import lombok.Data;

@Data
public class AddressbookDTO {
    public String name;
    public long phNumber;

    public AddressbookDTO(String name, long phNumber) {
        this.name = name;
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                '}';
    }
}
