package com.chenlei.tian.service.impl;

import com.chenlei.tian.dao.RecordMapper;
import com.chenlei.tian.entity.Record;
import com.chenlei.tian.service.PortalService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class PortalImpl implements PortalService {
    @Resource
    RecordMapper recordMapper;
    @Override
    public int addRecord(Long userId, Record record) {
        record.setUserId(userId);
        return recordMapper.insertIntoRecord(record);
    }
}
