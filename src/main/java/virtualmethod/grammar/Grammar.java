package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb vpv = new PhrasalVerb("számláz", "ki");
        Verb vpvws = new PhrasalVerbWithSuffix("számláz", "ki", "ná");
        Preposition pppv = new PhrasalVerb("számláz", "ki");
        Preposition pppvws = new PhrasalVerbWithSuffix("számláz", "ki", "ná");
        PhrasalVerb pvpv =  new PhrasalVerb("számláz", "ki");
        PhrasalVerb pvpvws = new PhrasalVerbWithSuffix("számláz", "ki", "ná");
        Suffix spvws =  new PhrasalVerbWithSuffix("számláz", "ki", "ná");
        PhrasalVerbWithSuffix pvws = new PhrasalVerbWithSuffix("számláz", "ki", "ná");
        System.out.println(vpv.getWord());
        System.out.println(vpvws.getWord());
        System.out.println(pppv.getPreposition() + " " + pppv.getWholeWord());
        System.out.println(pppvws.getPreposition() + " " + pppvws.getWholeWord());
        System.out.println(pvpv.getPreposition() + " " + pppv.getWholeWord());
        System.out.println(pvpvws.getPreposition() + " " + pppvws.getWholeWord());
        System.out.println(spvws.getSuffix());
        System.out.println(pvws.getPreposition() + " " + pvws.getWord() + " " + pvws.getSuffix() + " " + pvws.getWholeWord());
    }
}
