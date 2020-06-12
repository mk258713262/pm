package com.cyberaray.proxymanager.service;

import java.util.List;

import com.cyberaray.proxymanager.entity.ServiceInfo;

/**
 * 服务类型Service接口
 * 
 * @author mok
 * @date 2020-06-10
 */
public interface IServiceInfoService 
{
    /**
     * 查询服务类型
     * 
     * @param id 服务类型ID
     * @return 服务类型
     */
     ServiceInfo selectServiceInfoById(Long id);

    /**
     * 查询服务类型列表
     * 
     * @param serviceInfo 服务类型
     * @return 服务类型集合
     */
     List<ServiceInfo> selectServiceInfoList(ServiceInfo serviceInfo);

    /**
     * 新增服务类型
     * 
     * @param serviceInfo 服务类型
     * @return 结果
     */
     int insertServiceInfo(ServiceInfo serviceInfo);

    /**
     * 修改服务类型
     * 
     * @param serviceInfo 服务类型
     * @return 结果
     */
     int updateServiceInfo(ServiceInfo serviceInfo);

    /**
     * 批量删除服务类型
     * 
     * @param ids 需要删除的服务类型ID
     * @return 结果
     */
     int deleteServiceInfoByIds(Long[] ids);

    /**
     * 删除服务类型信息
     * 
     * @param id 服务类型ID
     * @return 结果
     */
     int deleteServiceInfoById(Long id);
}
