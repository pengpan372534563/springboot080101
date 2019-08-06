package com.whhp.springboot080101.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whhp.springboot080101.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}
