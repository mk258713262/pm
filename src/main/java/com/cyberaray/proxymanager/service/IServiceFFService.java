package com.cyberaray.proxymanager.service;

import com.cyberaray.proxymanager.entity.ServiceFF;

import java.util.List;


/**
 * ff服务Service接口
 * 
 * @author mok
 * @date 2020-06-16
 */
public interface IServiceFFService
{
    /**
     * 查询ff服务
     * 
     * @param id ff服务ID
     * @return ff服务
     */
    public ServiceFF selectServiceFFById(Long id);

    /**
     * 查询ff服务列表
     * 
     * @param serviceFf ff服务
     * @return ff服务集合
     */
    public List<ServiceFF> selectServiceFFList(ServiceFF serviceFf);

    /**
     * 新增ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    public int insertServiceFF(ServiceFF serviceFf);

    /**
     * 修改ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    public int updateServiceFF(ServiceFF serviceFf);

    /**
     * 批量删除ff服务
     * 
     * @param ids 需要删除的ff服务ID
     * @return 结果
     */
    public int deleteServiceFFByIds(Long[] ids);

    /**
     * 删除ff服务信息
     * 
     * @param id ff服务ID
     * @return 结果
     */
    public int deleteServiceFFById(Long id);
}
