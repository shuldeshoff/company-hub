package ru.hoteladvisors.model;

public class Branch {
    private Long id;
    private String name;
    private Address address;

    public Branch() {
    }

    public Branch(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
