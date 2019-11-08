package com.chenlei.tian.controller;

import com.chenlei.tian.entity.Record;
import com.chenlei.tian.service.PortalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Api
@RestController
@RequestMapping("/portal")
public class PortalController {
    @Resource
    PortalService portalService;
    @RequestMapping(value = "/addRecord",method = RequestMethod.POST)
    public void addRecord(@RequestBody Record record) {
        portalService.addRecord(1L,record);
    }
}
