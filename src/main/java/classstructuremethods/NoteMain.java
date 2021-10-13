package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Benkő Attila");
        note.setTopic("SV2.0");
        note.setText("Rendben halad");

        System.out.println(note.getNoteText());
        System.out.println("Name: " + note.getName());
        System.out.println("Topic: " + note.getTopic());
        System.out.println("Text :" + note.getText());
    }
}
