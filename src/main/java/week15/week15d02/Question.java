package week15.week15d02;

public class Question {

    private String question;
    private String answer;
    private int point;
    private String category;

    public Question(String question, String answer, int point, String category) {
        this.question = question;
        this.answer = answer;
        this.point = point;
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoint() {
        return point;
    }

    public String getCategory() {
        return category;
    }
}
