package edu.gatech.team10.weshelter;

/**
 * Created by Adrianna Brown on 2/24/2018.
 */

public class Shelter {
    private int key;
    private String name;
    private String capacity;
    private int currOccupancy;
    private String restrictions;
    private double longitude;
    private double latitude;
    private String address;
    private String specialNote;
    private String phone;

    public Shelter() {
        this(null);
    }

    public Shelter(String name) {
        this.name = name;
    }

    public int getKey() {
        return this.key;
    }
    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return this.capacity;
    }
    public void setCapacity (String capacity) {
        this.capacity = capacity;
    }

    public int getCurrOccupancy() {
        return this.currOccupancy;
    }
    public void setCurrOccupancy(int currOccupancy) {
        this.currOccupancy = currOccupancy;
    }

    public String getRestrictions() {
        return this.restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String note) {
        this.specialNote = note;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return this.name;
    }
}