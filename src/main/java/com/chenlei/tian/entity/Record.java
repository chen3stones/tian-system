package com.chenlei.tian.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Record {
    Long recordId;
    Long userId;
    Integer telVisit;
    Integer homeVisit;
    Integer video;
    Integer makeUp;
    Integer talk;
    Date day;
    String notes;
}
