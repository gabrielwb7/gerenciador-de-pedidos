package com.projetoweb.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetoweb.course.entities.pk.OrdemItemPK;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@Table(name = "tb_order_item")
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrdemItemPK id = new OrdemItemPK();

    @Column
    private Integer quantity;

    @Column
    private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }
}
