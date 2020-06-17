package com.cyberaray.proxymanager.service;

import com.cyberaray.proxymanager.entity.ServiceShadowsocks;

import java.util.List;

/**
 * shadowsocks服务Service接口
 * 
 * @author mok
 * @date 2020-06-16
 */
public interface IServiceShadowsocksService 
{
    /**
     * 查询shadowsocks服务
     * 
     * @param id shadowsocks服务ID
     * @return shadowsocks服务
     */
    public ServiceShadowsocks selectServiceShadowsocksById(Long id);

    /**
     * 查询shadowsocks服务列表
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return shadowsocks服务集合
     */
    public List<ServiceShadowsocks> selectServiceShadowsocksList(ServiceShadowsocks serviceShadowsocks);

    /**
     * 新增shadowsocks服务
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return 结果
     */
    public int insertServiceShadowsocks(ServiceShadowsocks serviceShadowsocks);

    /**
     * 修改shadowsocks服务
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return 结果
     */
    public int updateServiceShadowsocks(ServiceShadowsocks serviceShadowsocks);

    /**
     * 批量删除shadowsocks服务
     * 
     * @param ids 需要删除的shadowsocks服务ID
     * @return 结果
     */
    public int deleteServiceShadowsocksByIds(Long[] ids);

    /**
     * 删除shadowsocks服务信息
     * 
     * @param id shadowsocks服务ID
     * @return 结果
     */
    public int deleteServiceShadowsocksById(Long id);
}
