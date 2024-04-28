package ru.hoteladvisors.model;

import java.util.List;

public class Company {
    private Long id;
    private String name;
    private LegalForm legalForm;
    private Address address;
    private List<Branch> branches;

    public Company() {
    }

    public Company(Long id, String name, LegalForm legalForm, Address address, List<Branch> branches) {
        this.id = id;
        this.name = name;
        this.legalForm = legalForm;
        this.address = address;
        this.branches = branches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LegalForm getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(LegalForm legalForm) {
        this.legalForm = legalForm;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public String getFullAddress() {
        return address != null ?
                (address.getPostcode() != null && !address.getPostcode().isEmpty() ? address.getPostcode() + ", " : "") +
                        (address.getCity() != null && !address.getCity().isEmpty() ? address.getCity() + ", " : "") +
                        (address.getStreet() != null && !address.getStreet().isEmpty() ? address.getStreet() + " " : "") +
                        (address.getHouse() != null && !address.getHouse().isEmpty() ? address.getHouse() + ", " : "") +
                        (address.getApartment() != null && !address.getApartment().isEmpty() ? "кв " + address.getApartment() : "") : "";
    }


}
