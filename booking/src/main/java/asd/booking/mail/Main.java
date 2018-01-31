/*
 * Created on Jan 29, 2018
 */
package asd.booking.mail;

import asd.booking.dao.TrainDAO;
import asd.booking.dao.UserDAO;
import asd.booking.domain.User;

public class Main {

    public static void main(String[] args) {
//        SendEmailUtils.getInstance().sendEmail(null);
        User user = new User();
        user.setUserName("kimtey");
        user.setPassword("123");
        UserDAO.login(user);
        TrainDAO.findByFromAndTo("Chicago", "Gary");
    }

}
