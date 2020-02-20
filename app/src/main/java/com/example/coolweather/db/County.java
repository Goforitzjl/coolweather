package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String cityName;
    private int weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public int getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(int weatherId){
        this.weatherId=weatherId;
    }

    public int getCityId(){
        return cityId;
    }
    public void setCityId(){
        this.cityId=cityId;
    }
}
