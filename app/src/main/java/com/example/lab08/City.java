package com.example.lab08;

public class City {
    private final String city;
    private final String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() { return city; }
    public String getProvinceName() { return province; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return city.equals(other.city) && province.equals(other.province);
    }

    @Override
    public int hashCode() {
        return city.hashCode() * 31 + province.hashCode();
    }
}
