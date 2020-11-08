package introcontrol;

public class IntroControl {


        public int subtractTenIfGreaterThanTen(int number){
            if(number > 10){return number-10; }
            else{return number;}
        }

        public String descruűibeNumber(int number){
            if(number == 0){return "zero";}
            else{return "non zero";}
        }

        public String greetingtoJoe(String name) {
            if (name.equals("Joe")) {
                return "Hello Joe";
            } else {
                return "";
            }
        }

        public int calculateBonus(int sale) {
            if (sale > 1000000) {return (int) Math.round(sale * 0.1);}
            else {return 0; }
        }

        public int calculateConsumption(int prev, int next){
            if(next<prev){return 10000-prev + next;}
            else{return next-prev;}
        }

        public void printNumbers(int max){
            for(int i=0; i<max+1; i++){
                System.out.println(i);
            }
        }

        public void printNumbersBetweenAnyDirection(int a, int b) {
            if (a < b) {
                for (int i = a; i < b; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = b; i < a; i++) {
                    System.out.println(i);
                }
            }
        }

        public void printOddNumbers(int max){
            for(int i=1; i <max+1; i+=2){
                System.out.println(i);
            }
        }

}
