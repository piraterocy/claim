package com.kb.claim.mapper.old;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.kb.claim.model.ClaimBean;

//@Mapper
public interface ClaimMapper {
	//"" ;
	@Select("select t.vtext,t.vtextlen from HBB_RISKINFORMATION_TC t WHERE riskid = #{id}")
	@Results({
		@Result(property = "text", column = "vtext"),
		@Result(property = "textlen", column = "vtextlen")
	})
    ClaimBean findById(@Param(value = "id") String id);
}
