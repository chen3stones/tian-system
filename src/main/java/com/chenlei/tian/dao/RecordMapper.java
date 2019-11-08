package com.chenlei.tian.dao;

import com.chenlei.tian.entity.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface RecordMapper {
    Record getRecordByDate(Date date);
    int insertIntoRecord(@Param("r") Record record);
}
