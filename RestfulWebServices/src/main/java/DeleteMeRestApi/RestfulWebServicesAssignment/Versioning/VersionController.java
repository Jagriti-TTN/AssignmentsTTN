package DeleteMeRestApi.RestfulWebServicesAssignment.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//To demonstrate versioning by URI
@RestController
public class VersionController {

    @GetMapping("v1/person")
    public PersonVersion1 getPersonV1(){
        return new PersonVersion1("jagriti mishra");
    }

    @GetMapping("v2/person")
    public PersonVersion2 getPersonV2(){
        return new PersonVersion2(new Name("Smriti","Mishra"));
    }
}
