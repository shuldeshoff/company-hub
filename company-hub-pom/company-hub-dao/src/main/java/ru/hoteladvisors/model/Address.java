package ru.hoteladvisors.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "postcode", nullable = false)
    private String postcode;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "house", nullable = false)
    private String house;
    @Column(name = "apartment", nullable = false)
    private String apartment;

    public Address() {
    }

    public Address(Long id, String postcode, String city, String street, String house, String apartment) {
        this.id = id;
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
