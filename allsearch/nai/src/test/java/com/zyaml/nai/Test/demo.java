package com.zyaml.nai.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 测试
 * @author: Gauss
 * @date: 2020-07-14 15:21
 **/
public class demo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String brgindate=sdf.format(new Date());
        Date begin = sdf.parse(brgindate);
        System.out.println(brgindate);
    }
}
