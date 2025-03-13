package SpringDataJpa.HibernateSpringDataJpa.Entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

//@Embeddable

public class Address {

    private String city;
    private String landmark;

//    public Address(String city, String landmark) {
//        this.city = city;
//        this.landmark = landmark;
//    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
