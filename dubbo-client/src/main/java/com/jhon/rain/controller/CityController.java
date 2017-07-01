package com.jhon.rain.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jhon.rain.api.CityService;
import com.jhon.rain.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CityController
 * @date 2017/7/1 11:47
 */
@RestController
public class CityController {

    @Reference(version = "1.0.0")
    private CityService cityService;


    @RequestMapping(value = "/api/city/{name}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("name") String name) {
        return cityService.findCityByName(name);
    }

}
