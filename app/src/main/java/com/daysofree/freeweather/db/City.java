package com.daysofree.freeweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class City extends DataSupport {

    private int id;

    private String cityName;//城市的名字

    private int cityCode;//城市的代号

    private int provinceId;//城市所在省的id值
}
