package DeleteMeRestApi.RestfulWebServicesAssignment.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController

public class UserResourceController {

    private UserDaoService service;
@Autowired
    public UserResourceController(UserDaoService service){
        this.service=service;

    }


@GetMapping("/users")
public List<User> retrieveAllUsers(){
    return service.findAll();


}

@GetMapping("users/{id}")
    public User retrieveOne(@PathVariable int id){

    return service.findOne(id);



    //for exception handling we can use this part-
//    User myUser=service.findOneWithException(id);
//
//    if(myUser==null)
//        throw new UserNotFoundException("id:"+id);
//
//        return myUser;

}

@PostMapping("/users")
    public ResponseEntity<User> postUser(@RequestBody User user ){

    User savedUser = service.saveUser(user);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(savedUser.getId())
            .toUri();

    //to change the response status code to 201 created and
    //provide the uri for the new user being added
    return ResponseEntity.created(location).build();



}
@DeleteMapping("users{id}")
    public void deleteUser(@PathVariable int id){
     service.deleteOne(id);
}
}
