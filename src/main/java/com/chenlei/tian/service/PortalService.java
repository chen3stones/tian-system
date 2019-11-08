package com.chenlei.tian.service;

import com.chenlei.tian.entity.Record;
import org.springframework.stereotype.Component;


public interface PortalService {
    int addRecord(Long userId,Record record);
}
