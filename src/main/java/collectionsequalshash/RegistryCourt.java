package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        Company company1 = new Company("company1", "vat1");
        Company company2 = new Company("company2", "vat2");
        Company company3 = new Company("company3", "vat3");
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);
        System.out.println("company1: " + companies.contains(new Company("company1", "vat1")));
        System.out.println("company1/2: " + companies.contains(new Company("company1", "vat2")));
    }
}
