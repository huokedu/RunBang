package com.yang.rungang.utils;

import com.google.gson.Gson;
import com.yang.rungang.model.bean.weather.WeatherData;
import com.yang.rungang.model.bean.weather.WeatherList;
import com.yang.rungang.model.biz.CityList;

/**
 * Json解析工具类
 * Created by 洋 on 2016/5/4.
 */
public class JsonUtil {

    /**
     * 解析json,获取城市列表
     * @param json
     * @return
     */
    public static CityList parseCityListJson(String json){
        CityList cityList = new CityList();
        Gson gson = new Gson();
        cityList = gson.fromJson(json,CityList.class);

        return cityList;
    }

    /**
     *解析json,获取天气信息
     * @param json
     * @return
     */
    public static WeatherData parseWeatherJson(String json) {
        WeatherList weatherList = new WeatherList();
        Gson gson = new Gson();
        weatherList = gson.fromJson(json,WeatherList.class);

        return weatherList.getWeatherDatas().get(0);

    }

}
