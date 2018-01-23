package com.daysofree.freeweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Province extends DataSupport {

    private int id;

    private String provinceName;//省的名字

    private int provinceCode;//省的代号

}
