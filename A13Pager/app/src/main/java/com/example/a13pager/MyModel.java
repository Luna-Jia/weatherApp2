package com.example.a13pager;

public class MyModel {
    String mv_city;
    String mv_cond;
    int mv_color;
    String mv_zipCode;
    String mv_currentTemp;
    String mv_highTemp;
    String mv_lowTemp;
    String mv_weatherIcon0;

    public MyModel(String city, String cond, int color, String zipCode, String tempNow, String highTemp, String lowTemp, String weatherIcon0 ) {
        mv_city = city;
        mv_cond = cond;
        mv_color = color;
        mv_zipCode = zipCode;
        mv_currentTemp = tempNow;
        mv_highTemp = highTemp;
        mv_lowTemp = lowTemp;
        mv_weatherIcon0 = weatherIcon0;

    }

    public String mf_getCity() {
        return mv_city;
    }

    public String mf_getCond() {
        return mv_cond;
    }

    public int mf_getColor() {
        return mv_color;
    }

    public String mf_getZipCode() {
        return mv_zipCode;
    }

    public String mf_getCurrentTemp() {
        return mv_currentTemp;
    }
    public String mf_getHighTemp() {return mv_highTemp;}
    public String mf_getLowTemp() {return mv_lowTemp;}
    public String mf_getWeatherIcon0() {return mv_weatherIcon0;}
}
