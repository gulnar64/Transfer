package exceptions;

import entities.User;

public class UserNotFound extends RuntimeException{
    public UserNotFound(User user) {
        super(user.getId() + " idli user yoxdur");
    }
}
