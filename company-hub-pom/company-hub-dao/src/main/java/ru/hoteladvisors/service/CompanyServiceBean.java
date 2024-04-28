package ru.hoteladvisors.service;

import ru.hoteladvisors.model.Company;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CompanyServiceBean implements CompanyServiceLocal {


    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Company> getAll() {
        return entityManager.createNamedQuery("Company.findAll").getResultList();
    }
}
