package introjunit;

public class Gentleman {

    public String sayHello(String name){
        if(name.equals(""))
        {
            return "Hello Anonymus";
        }
        return "Hello " + name;
    }


}
