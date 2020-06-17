package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceV2rayMapper;
import com.cyberaray.proxymanager.entity.ServiceV2ray;
import com.cyberaray.proxymanager.service.IServiceV2rayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * V2Ray服务Service业务层处理
 * 
 * @author mok
 * @date 2020-06-16
 */
@Service
public class ServiceV2rayServiceImpl implements IServiceV2rayService
{
    @Autowired
    private ServiceV2rayMapper serviceV2rayMapper;

    /**
     * 查询V2Ray服务
     * 
     * @param id V2Ray服务ID
     * @return V2Ray服务
     */
    @Override
    public ServiceV2ray selectServiceV2rayById(Long id)
    {
        return serviceV2rayMapper.selectServiceV2rayById(id);
    }

    /**
     * 查询V2Ray服务列表
     * 
     * @param serviceV2ray V2Ray服务
     * @return V2Ray服务
     */
    @Override
    public List<ServiceV2ray> selectServiceV2rayList(ServiceV2ray serviceV2ray)
    {
        return serviceV2rayMapper.selectServiceV2rayList(serviceV2ray);
    }

    /**
     * 新增V2Ray服务
     * 
     * @param serviceV2ray V2Ray服务
     * @return 结果
     */
    @Override
    public int insertServiceV2ray(ServiceV2ray serviceV2ray)
    {
        return serviceV2rayMapper.insertServiceV2ray(serviceV2ray);
    }

    /**
     * 修改V2Ray服务
     * 
     * @param serviceV2ray V2Ray服务
     * @return 结果
     */
    @Override
    public int updateServiceV2ray(ServiceV2ray serviceV2ray)
    {
        return serviceV2rayMapper.updateServiceV2ray(serviceV2ray);
    }

    /**
     * 批量删除V2Ray服务
     * 
     * @param ids 需要删除的V2Ray服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceV2rayByIds(Long[] ids)
    {
        return serviceV2rayMapper.deleteServiceV2rayByIds(ids);
    }

    /**
     * 删除V2Ray服务信息
     * 
     * @param id V2Ray服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceV2rayById(Long id)
    {
        return serviceV2rayMapper.deleteServiceV2rayById(id);
    }
}
