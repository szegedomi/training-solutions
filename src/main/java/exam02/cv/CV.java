package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class CV {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public CV(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public CV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... skills){
        int index = 0;
        for(String skill : skills){
            index = skill.indexOf("(");
            this.skills.add(new Skill(skill.substring(0,index-1),Integer.parseInt(skill.substring(index+1, index+2))));
        }
    }

    public int findSkillLevelByName(String name){
        for(Skill skill : this.skills){
            if(skill.getName().equals(name)){
                return skill.getLevel();
            }
        }
        return -1;
    }


}
