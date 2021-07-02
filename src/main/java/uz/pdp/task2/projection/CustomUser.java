package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.User;


@Projection(types = User.class)
public interface CustomUser {

    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getAddress();

}
