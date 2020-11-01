package classstructuremethods;

public class Note {

    private String name; //name of the user
    private String topic; //topic of the note
    private String text; //description of the note

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteText(){
        return(this.getName() + ": (" + this.getTopic() + ") " + this.getText() + "\n");
    }
}
