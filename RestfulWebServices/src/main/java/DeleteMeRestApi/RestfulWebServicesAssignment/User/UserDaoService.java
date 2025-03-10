package DeleteMeRestApi.RestfulWebServicesAssignment.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoService {
   private static List<User> users = new ArrayList<>();
    static{
        users.add(new User(1,"jagriti", LocalDate.now().minusYears(26)));
        users.add(new User(2,"preeti",LocalDate.now().minusYears(30)));


    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id ){

        return users.stream().filter(e->e.getId()==id).findFirst().get();
    }

    public User findOneWithException(int id){

        return users.stream().filter(e->e.getId()==id)
                .findFirst().orElse(null);

    }

    public User saveUser(User user){
        users.add(user);
        return user;
    }

    public void deleteOne(int id){
        users.removeIf(user->user.getId()==id);
    }
}
