package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceInfoMapper;
import com.cyberaray.proxymanager.entity.ServiceInfo;
import com.cyberaray.proxymanager.service.IServiceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务类型Service业务层处理
 * 
 * @author mok
 * @date 2020-06-10
 */
@Service
@Deprecated
public class ServiceInfoServiceImpl implements IServiceInfoService
{
    @Autowired
    private ServiceInfoMapper serviceInfoMapper;

    /**
     * 查询服务类型
     * 
     * @param id 服务类型ID
     * @return 服务类型
     */
    @Override
    public ServiceInfo selectServiceInfoById(Long id)
    {
        return serviceInfoMapper.selectServiceInfoById(id);
    }

    /**
     * 查询服务类型列表
     * 
     * @param serviceInfo 服务类型
     * @return 服务类型
     */
    @Override
    public List<ServiceInfo> selectServiceInfoList(ServiceInfo serviceInfo)
    {
        return serviceInfoMapper.selectServiceInfoList(serviceInfo);
    }

    /**
     * 新增服务类型
     * 
     * @param serviceInfo 服务类型
     * @return 结果
     */
    @Override
    public int insertServiceInfo(ServiceInfo serviceInfo)
    {
        return serviceInfoMapper.insertServiceInfo(serviceInfo);
    }

    /**
     * 修改服务类型
     * 
     * @param serviceInfo 服务类型
     * @return 结果
     */
    @Override
    public int updateServiceInfo(ServiceInfo serviceInfo)
    {
        return serviceInfoMapper.updateServiceInfo(serviceInfo);
    }

    /**
     * 批量删除服务类型
     * 
     * @param ids 需要删除的服务类型ID
     * @return 结果
     */
    @Override
    public int deleteServiceInfoByIds(Long[] ids)
    {
        return serviceInfoMapper.deleteServiceInfoByIds(ids);
    }

    /**
     * 删除服务类型信息
     * 
     * @param id 服务类型ID
     * @return 结果
     */
    @Override
    public int deleteServiceInfoById(Long id)
    {
        return serviceInfoMapper.deleteServiceInfoById(id);
    }
}
