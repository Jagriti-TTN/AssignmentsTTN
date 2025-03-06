package SpringBoot_3_Feb_2025.AssignmentSol;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class CustomProperties {

    private String name;
    private int id;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
       return this.id;
    }

}
