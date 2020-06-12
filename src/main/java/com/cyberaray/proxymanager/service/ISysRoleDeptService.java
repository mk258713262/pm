package com.cyberaray.proxymanager.service;

import java.util.List;

import com.cyberaray.proxymanager.entity.SysRoleDept;

/**
 * vps和服务关联Service接口
 * 
 * @author mok
 * @date 2020-06-10
 */
public interface ISysRoleDeptService 
{
    /**
     * 查询vps和服务关联
     * 
     * @param vpsId vps和服务关联ID
     * @return vps和服务关联
     */
     SysRoleDept selectSysRoleDeptById(Long vpsId);

    /**
     * 查询vps和服务关联列表
     * 
     * @param sysRoleDept vps和服务关联
     * @return vps和服务关联集合
     */
     List<SysRoleDept> selectSysRoleDeptList(SysRoleDept sysRoleDept);

    /**
     * 新增vps和服务关联
     * 
     * @param sysRoleDept vps和服务关联
     * @return 结果
     */
     int insertSysRoleDept(SysRoleDept sysRoleDept);

    /**
     * 修改vps和服务关联
     * 
     * @param sysRoleDept vps和服务关联
     * @return 结果
     */
     int updateSysRoleDept(SysRoleDept sysRoleDept);

    /**
     * 批量删除vps和服务关联
     * 
     * @param vpsIds 需要删除的vps和服务关联ID
     * @return 结果
     */
     int deleteSysRoleDeptByIds(Long[] vpsIds);

    /**
     * 删除vps和服务关联信息
     * 
     * @param vpsId vps和服务关联ID
     * @return 结果
     */
     int deleteSysRoleDeptById(Long vpsId);
}
