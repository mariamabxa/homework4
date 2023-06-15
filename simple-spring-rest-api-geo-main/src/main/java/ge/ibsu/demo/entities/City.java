package ge.ibsu.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "city")
    private String city;

    @Column(name = "last_update")
    private Date lastUpdate;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.city_id = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCityId(Long city) {
        this.city = city;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
