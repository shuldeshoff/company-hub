package ru.hoteladvisors.view.model;

import org.zkoss.bind.annotation.Init;
import ru.hoteladvisors.data.CompanyData;
import ru.hoteladvisors.model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyViewModel {

    private Company selected;
    private List<Company> companyList = new ArrayList<>(new CompanyData().getCompanies());

    @Init
    public void init() {    // Initialize
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
}
