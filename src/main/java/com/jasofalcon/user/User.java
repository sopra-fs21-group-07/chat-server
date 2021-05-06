package com.jasofalcon.user;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class User implements Serializable {
    private String id;
    private String user;

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    private String tourID;
    public User() {
    }

    public User(String user) {
        this.user = user;
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(null == o || o.getClass() != this.getClass()) return false;

        User other = (User) o;

        return Objects.equals(this.id, other.id) && Objects.equals(this.user, other.user);
    }
}
