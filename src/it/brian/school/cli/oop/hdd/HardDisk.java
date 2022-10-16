package it.brian.school.cli.oop.hdd;

public class HardDisk {
    private String brand;
    private Integer rpm;
    private Integer accessTime;
    private Integer capacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Integer accessTime) {
        this.accessTime = accessTime;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getScore() {
        Integer score = 0;
        score += rpm;
        score -= (200 * accessTime);
        score += (500 * capacity);
        return score;
    }

    @Override
    public String toString() {
        return "brand = '" + brand + '\'' +
                ", rpm = " + rpm +
                ", accessTime = " + accessTime +
                ", capacity = " + capacity +
                ", score = " + getScore();
    }
}
