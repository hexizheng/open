package com.jscn.open.dao;

import com.jscn.open.dao.PartnerService;
import com.jscn.open.dao.PartnerServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerServiceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int countByExample(PartnerServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int deleteByExample(PartnerServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int insert(PartnerService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int insertSelective(PartnerService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	List<PartnerService> selectByExample(PartnerServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	PartnerService selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int updateByExampleSelective(@Param("record") PartnerService record,
			@Param("example") PartnerServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int updateByExample(@Param("record") PartnerService record,
			@Param("example") PartnerServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int updateByPrimaryKeySelective(PartnerService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PARTNER_SERVICE
	 * @mbggenerated  Wed Jun 20 16:46:58 CST 2012
	 */
	int updateByPrimaryKey(PartnerService record);
}