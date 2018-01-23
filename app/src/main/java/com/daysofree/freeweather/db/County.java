package com.daysofree.freeweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by tianyi on 2018/1/23.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class County extends DataSupport {

    private int id;

    private String countyName;//县的名字

    private String weatherId;//天气的id

    private int cityId;//所属市的id

}
