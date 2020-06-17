package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceSshMapper;
import com.cyberaray.proxymanager.entity.ServiceSsh;
import com.cyberaray.proxymanager.service.IServiceSshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SSH服务Service业务层处理
 * 
 * @author mok
 * @date 2020-06-16
 */
@Service
public class ServiceSshServiceImpl implements IServiceSshService
{
    @Autowired
    private ServiceSshMapper serviceSshMapper;

    /**
     * 查询SSH服务
     * 
     * @param id SSH服务ID
     * @return SSH服务
     */
    @Override
    public ServiceSsh selectServiceSshById(Long id)
    {
        return serviceSshMapper.selectServiceSshById(id);
    }

    /**
     * 查询SSH服务列表
     * 
     * @param serviceSsh SSH服务
     * @return SSH服务
     */
    @Override
    public List<ServiceSsh> selectServiceSshList(ServiceSsh serviceSsh)
    {
        return serviceSshMapper.selectServiceSshList(serviceSsh);
    }

    /**
     * 新增SSH服务
     * 
     * @param serviceSsh SSH服务
     * @return 结果
     */
    @Override
    public int insertServiceSsh(ServiceSsh serviceSsh)
    {
        return serviceSshMapper.insertServiceSsh(serviceSsh);
    }

    /**
     * 修改SSH服务
     * 
     * @param serviceSsh SSH服务
     * @return 结果
     */
    @Override
    public int updateServiceSsh(ServiceSsh serviceSsh)
    {
        return serviceSshMapper.updateServiceSsh(serviceSsh);
    }

    /**
     * 批量删除SSH服务
     * 
     * @param ids 需要删除的SSH服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceSshByIds(Long[] ids)
    {
        return serviceSshMapper.deleteServiceSshByIds(ids);
    }

    /**
     * 删除SSH服务信息
     * 
     * @param id SSH服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceSshById(Long id)
    {
        return serviceSshMapper.deleteServiceSshById(id);
    }
}
