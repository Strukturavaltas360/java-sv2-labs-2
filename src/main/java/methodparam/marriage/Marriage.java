package methodparam.marriage;

import java.time.LocalDate;
import java.util.List;

public class Marriage {
    private final String MARRIAGE_DESCRIPTION = "házasságkötés_ideje";
    private final String MARRIED_NAME_DESCRIPTION = "házasságkötés miatti névváltozás";

    public void getMarried(Woman woman, Man man) {
        checkParameters(woman, man);
        RegisterDate registerMarriage = new RegisterDate(MARRIAGE_DESCRIPTION, LocalDate.now());
        registerWoman(woman, registerMarriage);
        setMarriedName(woman, man);
        registerMan(man, registerMarriage);
    }

    private void checkParameters(Woman woman, Man man) {
        if (woman == null) {
            throw new IllegalArgumentException("A woman null!");
        }
        if (man == null) {
            throw new IllegalArgumentException("A man null!");
        }
    }

    private void setMarriedName(Woman woman, Man man) {
        String marriedName = getFamilyName(man.getName().trim()) + "né " + woman.getName().trim();
        woman.setName(marriedName);
        RegisterDate registerMarriedName = new RegisterDate(MARRIED_NAME_DESCRIPTION, LocalDate.now());
        registerWoman(woman, registerMarriedName);
    }

    private String getFamilyName(String name) {
        return name.substring(0, name.indexOf(' '));
    }

    private void registerWoman(Woman woman, RegisterDate registerDate) {
        woman.getRegisterDates().add(registerDate);
    }

    private void registerMan(Man man, RegisterDate registerDate) {
        man.getRegisterDates().add(registerDate);
    }
}
