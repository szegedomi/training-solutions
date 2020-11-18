package stringconcat;

public class Name {

    private String familyName;
    private String givenName;
    private String middleName;
    private Title title;

    public boolean isEmpty(String string){
        return string == null || string == "";
    }

    public Name(String familyName, String middleName, String givenName, Title title){
        if(isEmpty(givenName) || isEmpty(familyName)){
            throw  new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName){
        if(isEmpty(givenName) || isEmpty(familyName)){
            throw  new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
    }

    public String concatNameWesternStyle(){
        String nameString = "";
        if(title != null){
            nameString = nameString.concat(title.getTitleString());
            nameString = nameString.concat(" ");
            nameString = nameString.concat(givenName +" ");
        }
        else{nameString = nameString.concat(givenName + " ");}
        if(middleName != null && middleName != ""){
            nameString = nameString.concat(middleName);
            nameString = nameString.concat(" ");
            nameString = nameString.concat(familyName);
        }
        else{nameString = nameString.concat(familyName);}
        return nameString;
    }

    public String concatNameHungarianStyle(){
        String nameString = "";
        if(title != null){
            nameString += title.getTitleString();
            nameString += " ";
            nameString += familyName + " ";
        }
        else{nameString += familyName + " ";}
        if(middleName != null && middleName != ""){
            nameString += middleName;
            nameString += " ";
            nameString += givenName;
        }
        else{nameString += givenName;}
        return nameString;
    }

}
