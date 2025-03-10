package DeleteMeRestApi.RestfulWebServicesAssignment.HelloWorldController;


import org.springframework.web.bind.annotation.*;

@RestController

public class HelloWorldController {
    @RequestMapping(method= RequestMethod.GET,path = "/helloWorld")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world bean ");
    }

    @GetMapping(path="/hello-world-pathvariable/{name}" )
    public HelloWorldBean helloPathVariable(@PathVariable String name){
        return new HelloWorldBean("this is controller "+name);
    }

    @GetMapping(path="/hello-world" )
    public HelloWorldBean helloParam(@RequestParam (defaultValue = "unknown")String name,@RequestParam int id){
        return new HelloWorldBean("this is controller "+name+" the id is "+id);
    }
}
