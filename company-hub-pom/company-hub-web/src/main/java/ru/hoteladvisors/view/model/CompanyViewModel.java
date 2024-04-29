package ru.hoteladvisors.view.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.bind.annotation.Init;
import ru.hoteladvisors.model.Company;
import ru.hoteladvisors.service.CompanyServiceLocal;
import ru.hoteladvisors.utils.JNDIName;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class CompanyViewModel {

    private Logger logger = LoggerFactory.getLogger(CompanyViewModel.class);

    private Company selected;
    private List<Company> companyList;

    @Init
    public void init() {    // Initialize
        companyList = getCompanies();
        selected = !companyList.isEmpty() ? companyList.get(0) : null; // Selected First One
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setSelectedCompany(Company selected) {
        this.selected = selected;
    }

    public Company getSelectedCompany() {
        return selected;
    }


    public List<Company> getCompanies() {
        CompanyServiceLocal companyServiceLocal = null;
        try {
            companyServiceLocal = InitialContext.doLookup(JNDIName.COMPANY_SERVICE_BEAN_JNDI);
        } catch (NamingException e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        return companyServiceLocal.getAll();
    }

}
