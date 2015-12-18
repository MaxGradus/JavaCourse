package com.maxdegree.entity;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Table;


@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "placeId", nullable = false)
    private Integer placeId;

    @Column(name = "placeName", nullable = false)
    private String placeName;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "date")
    private Long date;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "users_places",
            joinColumns = @JoinColumn(name = "placeId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private User user;


    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}


//final Long MONTH = 2592000000L;
//Long today = new Date().getTime() + MONTH;
//Date date  = new Date(today);

