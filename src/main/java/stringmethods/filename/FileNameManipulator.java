package stringmethods.filename;

public class FileNameManipulator {
    public static void main(String[] args) {
        String fileName = "FileNameManipulator.jAVa";
        System.out.println("fileName: " + fileName);
        System.out.println("findLastCharacter: " + findLastCharacter(fileName));
        System.out.println("findFileExtension: " + findFileExtension(fileName));
        System.out.println("identifyFilesByExtension: " + identifyFilesByExtension("java", fileName));
        System.out.println("identifyFilesByExtension: " + identifyFilesByExtension("class", fileName));
        System.out.println("compareFilesByName: " + compareFilesByName("FileNameManipulator.class", fileName));
        System.out.println("changeExtensionToLowerCase: " + changeExtensionToLowerCase(fileName));
        System.out.println("replaceStringPart: " + replaceStringPart(fileName, "Manipul", "Modific"));
    }

    public static char findLastCharacter(String str) {
        char ch = 0;
        if (str != null) ch = str.charAt(str.length() - 1);
        return ch;
    }

    public static String findFileExtension(String fileName) {
        int dotPos = fileName.lastIndexOf('.');
        return dotPos >= 0 ? fileName.substring(dotPos + 1) : null;
    }

    public static boolean identifyFilesByExtension(String ext, String fileName) {
        if (ext == null) return false;
        return ext.equalsIgnoreCase(findFileExtension(fileName));
    }

    public static boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (searchedFileName == null || actualFileName == null) return false;

        int dotPos = searchedFileName.lastIndexOf('.');
        String sFN = dotPos >= 0 ? searchedFileName.substring(0, dotPos) : searchedFileName;

        dotPos = actualFileName.lastIndexOf('.');
        String aFN = dotPos >= 0 ? actualFileName.substring(0, dotPos) : actualFileName;

        return sFN.equalsIgnoreCase(aFN);
    }

    public static String changeExtensionToLowerCase(String fileName) {
        int dotPos = fileName.lastIndexOf('.');
        if (dotPos >= 0) {
            String fn = fileName.substring(0, dotPos);
            String ext = fileName.substring(dotPos + 1);
            return fn + '.' + ext.toLowerCase();
        } else return fileName;
    }

    public static String replaceStringPart(String fileName, String present, String target) {
        int position = fileName.indexOf(present);
        if (position < 0) return fileName;
        else return fileName.substring(0, position) + target + fileName.substring(position + present.length());
    }
}
