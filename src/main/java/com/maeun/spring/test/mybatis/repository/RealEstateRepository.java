package com.maeun.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.maeun.spring.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	public List<RealEstate> selectLowerRent(@Param("rent") int rent);
	public List<RealEstate> selectComposite(@Param("area") int area, @Param("price") int price);
	public int insertRealEstate(RealEstate realEstate);
	public int insertRealEstateByMap(
			@Param("realtorId") int realtorId
			,	@Param("address") String address
			,	@Param("area") int area
			,	@Param("type") String type
			,	@Param("price") int price
			,	@Param("rentPrice") int rentPrice
			);
	public int updateRealEstate(RealEstate realEstate);
	public int deleteRealEstate(@Param("id") int id);
}
