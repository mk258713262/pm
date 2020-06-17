package com.cyberaray.proxymanager.dao;

import java.util.List;

import com.cyberaray.proxymanager.entity.ServiceV2ray;
import org.apache.ibatis.annotations.Mapper;

/**
 * V2Ray服务Mapper接口
 * 
 * @author mok
 * @date 2020-06-16
 */
@Mapper
public interface ServiceV2rayMapper 
{
    /**
     * 查询V2Ray服务
     * 
     * @param id V2Ray服务ID
     * @return V2Ray服务
     */
    public ServiceV2ray selectServiceV2rayById(Long id);

    /**
     * 查询V2Ray服务列表
     * 
     * @param serviceV2ray V2Ray服务
     * @return V2Ray服务集合
     */
    public List<ServiceV2ray> selectServiceV2rayList(ServiceV2ray serviceV2ray);

    /**
     * 新增V2Ray服务
     * 
     * @param serviceV2ray V2Ray服务
     * @return 结果
     */
    public int insertServiceV2ray(ServiceV2ray serviceV2ray);

    /**
     * 修改V2Ray服务
     * 
     * @param serviceV2ray V2Ray服务
     * @return 结果
     */
    public int updateServiceV2ray(ServiceV2ray serviceV2ray);

    /**
     * 删除V2Ray服务
     * 
     * @param id V2Ray服务ID
     * @return 结果
     */
    public int deleteServiceV2rayById(Long id);

    /**
     * 批量删除V2Ray服务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteServiceV2rayByIds(Long[] ids);
}
