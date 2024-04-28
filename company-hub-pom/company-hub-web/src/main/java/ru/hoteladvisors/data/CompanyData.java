package ru.hoteladvisors.data;

import ru.hoteladvisors.model.Company;
import ru.hoteladvisors.service.CompanyServiceLocal;
import ru.hoteladvisors.utils.JNDIName;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class CompanyData {

//    @EJB(lookup = JNDI.COMPANY_SERVICE_BEAN_JNDI)
//    private CompanyServiceLocal companyServiceLocal;

//    private List<Company> companies = new ArrayList<>();
//
//    public CompanyData() {
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
//    }

    public List<Company> getCompanies() {
        CompanyServiceLocal companyServiceLocal = null;
        try {
            companyServiceLocal = InitialContext.doLookup(JNDIName.COMPANY_SERVICE_BEAN_JNDI);
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return companyServiceLocal.getAll();
    }


}
