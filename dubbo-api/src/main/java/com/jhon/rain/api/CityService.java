package com.jhon.rain.api;

import com.jhon.rain.domain.City;

/**
 * <p>功能描述</br> 城市业务逻辑接口类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CityService
 * @date 2017/7/1 11:30
 */
public interface CityService {
    /**
     * 根据城市 ID,查询城市信息
     *
     * @param name
     * @return
     */
    City findCityByName(String name);
}
