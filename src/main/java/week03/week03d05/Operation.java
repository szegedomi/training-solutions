package week03.week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String operation) {
        String[] op = operation.split("\\+");
        this.leftOperand = Integer.parseInt(op[0]);
        this.rightOperand = Integer.parseInt(op[1]);
    }

    public int getResult() {
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        System.out.println(new Operation("20+32").getResult());
    }


}
