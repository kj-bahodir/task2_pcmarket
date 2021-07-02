package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Integer getCategory();

    Integer getPhoto();

    String getCode();

    double getPrice();

    boolean isActive();

    Integer getPaymentType();

    Integer getBasket();

}
