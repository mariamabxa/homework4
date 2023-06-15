package ge.ibsu.demo.dto;

public class AddCity {
    private Long cityId;
    private String city;
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