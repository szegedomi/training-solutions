package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("Shopping");
        note.setText("Don't forget to buy milk!");

        System.out.println(note.getNoteText());

    }


}
