package SpringBoot_3_Feb_2025.AssignmentSol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceClass {

    private CustomProperties props;

    @Autowired
    public ServiceClass(CustomProperties props){
        this.props=props;
    }

    public void printProperties() {
        System.out.println("Name: " + props.getName());
        System.out.println("ID: " + props.getId());
    }
}
