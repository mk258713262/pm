package com.cyberaray.proxymanager.dao;

import com.cyberaray.proxymanager.entity.ServiceFF;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ff服务Mapper接口
 * 
 * @author mok
 * @date 2020-06-16
 */
@Mapper
public interface ServiceFFMapper
{
    /**
     * 查询ff服务
     * 
     * @param id ff服务ID
     * @return ff服务
     */
    public ServiceFF selectServiceFfById(Long id);

    /**
     * 查询ff服务列表
     * 
     * @param serviceFf ff服务
     * @return ff服务集合
     */
    public List<ServiceFF> selectServiceFfList(ServiceFF serviceFf);

    /**
     * 新增ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    public int insertServiceFf(ServiceFF serviceFf);

    /**
     * 修改ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    public int updateServiceFf(ServiceFF serviceFf);

    /**
     * 删除ff服务
     * 
     * @param id ff服务ID
     * @return 结果
     */
    public int deleteServiceFfById(Long id);

    /**
     * 批量删除ff服务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteServiceFfByIds(Long[] ids);
}
