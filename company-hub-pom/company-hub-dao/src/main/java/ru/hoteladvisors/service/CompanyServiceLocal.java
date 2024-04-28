package ru.hoteladvisors.service;


import ru.hoteladvisors.model.Company;

import java.util.List;

import javax.ejb.Local;


@Local
public interface CompanyServiceLocal {
    List<Company> getAll();
}
