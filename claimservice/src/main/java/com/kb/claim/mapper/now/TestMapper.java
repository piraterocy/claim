package com.kb.claim.mapper.now;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.kb.claim.model.TestBean;

//@Mapper
public interface TestMapper {
	//"" ;
	@Select("select t.f1,t.f2 from tab_test t WHERE f2 = #{id}")
	@Results({
		@Result(property = "f1", column = "f1"),
		@Result(property = "f2", column = "f2")
	})
    TestBean findById(@Param(value = "id") String id);
}
