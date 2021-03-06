package uz.pdp.task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2.entity.Category;

import javax.persistence.ManyToOne;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();
    String getName();
    boolean isActive();
    Integer getParentCategory();



}
