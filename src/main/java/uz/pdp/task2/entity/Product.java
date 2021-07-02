package uz.pdp.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    private double price;

    private boolean active=true;

    @OneToOne
    private PaymentType paymentType;

    @ManyToOne
    private Basket basket;

}
