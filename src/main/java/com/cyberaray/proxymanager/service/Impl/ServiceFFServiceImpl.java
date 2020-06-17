package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceFFMapper;
import com.cyberaray.proxymanager.entity.ServiceFF;
import com.cyberaray.proxymanager.service.IServiceFFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ff服务Service业务层处理
 * 
 * @author mok
 * @date 2020-06-16
 */
@Service
public class ServiceFFServiceImpl implements IServiceFFService
{
    @Autowired
    private ServiceFFMapper serviceFFMapper;

    /**
     * 查询ff服务
     * 
     * @param id ff服务ID
     * @return ff服务
     */
    @Override
    public ServiceFF selectServiceFFById(Long id)
    {
        return serviceFFMapper.selectServiceFfById(id);
    }

    /**
     * 查询ff服务列表
     * 
     * @param serviceFF ff服务
     * @return ff服务
     */
    @Override
    public List<ServiceFF> selectServiceFFList(ServiceFF serviceFF)
    {
        return serviceFFMapper.selectServiceFfList(serviceFF);
    }

    /**
     * 新增ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    @Override
    public int insertServiceFF(ServiceFF serviceFf)
    {
        return serviceFFMapper.insertServiceFf(serviceFf);
    }

    /**
     * 修改ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    @Override
    public int updateServiceFF(ServiceFF serviceFf)
    {
        return serviceFFMapper.updateServiceFf(serviceFf);
    }

    /**
     * 批量删除ff服务
     * 
     * @param ids 需要删除的ff服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceFFByIds(Long[] ids)
    {
        return serviceFFMapper.deleteServiceFfByIds(ids);
    }

    /**
     * 删除ff服务信息
     * 
     * @param id ff服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceFFById(Long id)
    {
        return serviceFFMapper.deleteServiceFfById(id);
    }
}
