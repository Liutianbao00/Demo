package com.demo.demo.dao;

import com.demo.demo.entity.Yonghu;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface TestDao {
    List<Yonghu> selectAllUsers();
}
