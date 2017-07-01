package com.jhon.rain.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jhon.rain.api.CityService;
import com.jhon.rain.dao.CityDao;
import com.jhon.rain.domain.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * <p>功能描述</br> 城市业务逻辑接口类 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CityServiceImpl
 * @date 2017/7/1 11:30
 */
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    /**
     * 获取城市逻辑：
     * 如果缓存存在，从缓存中获取城市信息
     * 如果缓存不存在，从 DB 中获取城市信息，然后插入缓存
     */
    public City findCityByName(String name) {
        //return new City(1L,2L,"温岭","是我的故乡");
        return cityDao.findByName(name);
    }
}
