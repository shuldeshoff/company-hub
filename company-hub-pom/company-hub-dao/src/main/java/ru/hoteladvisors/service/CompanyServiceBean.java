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
//        List<Company> companies = new ArrayList<>();
//        companies.add(new Company(1L, "Ромашка", LegalForm.OOO,
//                new Address(1L, "197136", "г. Санкт-Петербург",
//                        "ул. Профессора Попова", "37Щ", "610"), new ArrayList<>()));
//        companies.add(new Company(2L, "Синица", LegalForm.AO,
//                new Address(2L, "162601", "г. Череповец",
//                        "ул. Красная", "56А", "20Н"), Arrays.asList(
//                new Branch(1L, "Синица в рукаве", new Address(3L, "197348",
//                        "г. Санкт-Петербург",
//                        "Богатырский пр.", "34", "890"))
//        )));
//        companies.add(new Company(3L, "Журавль", LegalForm.IP, new Address(), new ArrayList<>()));
//        companies.add(new Company(4L, "Best2Pay", LegalForm.OOO, new Address(), new ArrayList<>()));
//        companies.add(new Company(5L, "Tinkoff", LegalForm.AO, new Address(), new ArrayList<>()));
//        companies.add(new Company(6L, "Альфабанк", LegalForm.AO, new Address(), new ArrayList<>()));
//        return companies;
    }
}
