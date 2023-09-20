package com.pxu.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartDetail> cartItems;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public List<CartDetail> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartDetail> cartItems) {
        this.cartItems = cartItems;
    }

    // Constructors, getters, and setters
}
