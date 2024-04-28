package ru.hoteladvisors.service;
import ru.hoteladvisors.model.Company;
import javax.ejb.Local;
import java.util.List;

@Local
public interface CompanyServiceLocal {

    List<Company> getAll();
}
