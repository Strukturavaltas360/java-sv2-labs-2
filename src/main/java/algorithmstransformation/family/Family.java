package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<FamilyMember> familyMembers = new ArrayList<>();

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String givenName) {
        List<Integer> result = new ArrayList<>();
        for (FamilyMember familyMember: familyMembers) {
            String nameToCheck = familyMember.getName().trim() + " ";
            if (nameToCheck.indexOf(" " + givenName.trim() + " ") > 0) {
                result.add(familyMember.getAge());
            }
        }
        return result;
    }
}
