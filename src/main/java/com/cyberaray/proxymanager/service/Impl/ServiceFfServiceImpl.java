package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.ServiceFfMapper;
import com.cyberaray.proxymanager.entity.ServiceFf;
import com.cyberaray.proxymanager.service.IServiceFfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ff服务Service业务层处理
 * 
 * @author mok
 * @date 2020-06-16
 */
@Service
public class ServiceFfServiceImpl implements IServiceFfService
{
    @Autowired
    private ServiceFfMapper serviceFfMapper;

    /**
     * 查询ff服务
     * 
     * @param id ff服务ID
     * @return ff服务
     */
    @Override
    public ServiceFf selectServiceFfById(Long id)
    {
        return serviceFfMapper.selectServiceFfById(id);
    }

    /**
     * 查询ff服务列表
     * 
     * @param serviceFf ff服务
     * @return ff服务
     */
    @Override
    public List<ServiceFf> selectServiceFfList(ServiceFf serviceFf)
    {
        return serviceFfMapper.selectServiceFfList(serviceFf);
    }

    /**
     * 新增ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    @Override
    public int insertServiceFf(ServiceFf serviceFf)
    {
        return serviceFfMapper.insertServiceFf(serviceFf);
    }

    /**
     * 修改ff服务
     * 
     * @param serviceFf ff服务
     * @return 结果
     */
    @Override
    public int updateServiceFf(ServiceFf serviceFf)
    {
        return serviceFfMapper.updateServiceFf(serviceFf);
    }

    /**
     * 批量删除ff服务
     * 
     * @param ids 需要删除的ff服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceFfByIds(Long[] ids)
    {
        return serviceFfMapper.deleteServiceFfByIds(ids);
    }

    /**
     * 删除ff服务信息
     * 
     * @param id ff服务ID
     * @return 结果
     */
    @Override
    public int deleteServiceFfById(Long id)
    {
        return serviceFfMapper.deleteServiceFfById(id);
    }
}
