package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceShadowsocksMapper;
import com.cyberaray.proxymanager.entity.ServiceShadowsocks;
import com.cyberaray.proxymanager.service.IServiceShadowsocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * shadowsocks服务Service业务层处理
 * 
 * @author mok
 * @date 2020-06-16
 */
@Service
public class ServiceShadowsocksServiceImpl implements IServiceShadowsocksService
{
    @Autowired
    private ServiceShadowsocksMapper serviceShadowsocksMapper;

    /**
     * 查询shadowsocks服务
     * 
     * @param id shadowsocks服务ID
     * @return shadowsocks服务
     */
    @Override
    public ServiceShadowsocks selectServiceShadowsocksById(Long id)
    {
        return serviceShadowsocksMapper.selectServiceShadowsocksById(id);
    }

    /**
     * 查询shadowsocks服务列表
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return shadowsocks服务
     */
    @Override
    public List<ServiceShadowsocks> selectServiceShadowsocksList(ServiceShadowsocks serviceShadowsocks)
    {
        return serviceShadowsocksMapper.selectServiceShadowsocksList(serviceShadowsocks);
    }

    /**
     * 新增shadowsocks服务
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return 结果
     */
    @Override
    public int insertServiceShadowsocks(ServiceShadowsocks serviceShadowsocks)
    {
        return serviceShadowsocksMapper.insertServiceShadowsocks(serviceShadowsocks);
    }

    /**
     * 修改shadowsocks服务
     * 
     * @param serviceShadowsocks shadowsocks服务
     * @return 结果
     */
    @Override
    public int updateServiceShadowsocks(ServiceShadowsocks serviceShadowsocks)
    {
        return serviceShadowsocksMapper.updateServiceShadowsocks(serviceShadowsocks);
    }

    /**
     * 批量删除shadowsocks服务
     * 
     * @param ids 需要删除的shadowsocks服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceShadowsocksByIds(Long[] ids)
    {
        return serviceShadowsocksMapper.deleteServiceShadowsocksByIds(ids);
    }

    /**
     * 删除shadowsocks服务信息
     * 
     * @param id shadowsocks服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceShadowsocksById(Long id)
    {
        return serviceShadowsocksMapper.deleteServiceShadowsocksById(id);
    }
}
