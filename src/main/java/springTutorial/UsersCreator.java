package springTutorial;

import java.util.logging.Logger;

/**
 * Created by Daniel_D'AGE on 21.07.2018.
 */
public class UsersCreator {
    Logger logger = Logger.getLogger(this.getClass().getName());


    public User createUser (String userName){

        logger.info("Tworzenie użytkownika: " + userName);
        User user = new User();
        user.setName(userName);
        return user;
    }

}
