package com.cyberaray.proxymanager.dao;

import java.util.List;

import com.cyberaray.proxymanager.entity.ServiceSsh;
import org.apache.ibatis.annotations.Mapper;

/**
 * SSH服务Mapper接口
 * 
 * @author mok
 * @date 2020-06-16
 */
@Mapper
public interface ServiceSshMapper 
{
    /**
     * 查询SSH服务
     * 
     * @param id SSH服务ID
     * @return SSH服务
     */
    public ServiceSsh selectServiceSshById(Long id);

    /**
     * 查询SSH服务列表
     * 
     * @param serviceSsh SSH服务
     * @return SSH服务集合
     */
    public List<ServiceSsh> selectServiceSshList(ServiceSsh serviceSsh);

    /**
     * 新增SSH服务
     * 
     * @param serviceSsh SSH服务
     * @return 结果
     */
    public int insertServiceSsh(ServiceSsh serviceSsh);

    /**
     * 修改SSH服务
     * 
     * @param serviceSsh SSH服务
     * @return 结果
     */
    public int updateServiceSsh(ServiceSsh serviceSsh);

    /**
     * 删除SSH服务
     * 
     * @param id SSH服务ID
     * @return 结果
     */
    public int deleteServiceSshById(Long id);

    /**
     * 批量删除SSH服务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteServiceSshByIds(Long[] ids);
}
