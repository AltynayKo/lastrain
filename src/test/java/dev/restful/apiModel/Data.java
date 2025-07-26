package dev.restful.apiModel;

import lombok.Builder;

@Builder
public class Data {
    private int year;           // Corresponds to "year"
    private double price;       // Corresponds to "price"
    private String cpuModel;    // Corresponds to "CPU model"
    private String hardDiskSize; // Corresponds to "Hard disk size"
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpuModel() {
        return cpuModel;
    }
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }
    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", price=" + price +
                ", cpuModel='" + cpuModel + '\'' +
                ", hardDiskSize='" + hardDiskSize + '\'' +
                '}';
    }
}
