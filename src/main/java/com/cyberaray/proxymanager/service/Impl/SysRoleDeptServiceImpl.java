package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.SysRoleDeptMapper;
import com.cyberaray.proxymanager.entity.SysRoleDept;
import com.cyberaray.proxymanager.service.ISysRoleDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * vps和服务关联Service业务层处理
 * 
 * @author mok
 * @date 2020-06-10
 */
@Service
@Deprecated
public class SysRoleDeptServiceImpl implements ISysRoleDeptService
{
    @Autowired
    private SysRoleDeptMapper sysRoleDeptMapper;

    /**
     * 查询vps和服务关联
     * 
     * @param vpsId vps和服务关联ID
     * @return vps和服务关联
     */
    @Override
    public SysRoleDept selectSysRoleDeptById(Long vpsId)
    {
        return sysRoleDeptMapper.selectSysRoleDeptById(vpsId);
    }

    /**
     * 查询vps和服务关联列表
     * 
     * @param sysRoleDept vps和服务关联
     * @return vps和服务关联
     */
    @Override
    public List<SysRoleDept> selectSysRoleDeptList(SysRoleDept sysRoleDept)
    {
        return sysRoleDeptMapper.selectSysRoleDeptList(sysRoleDept);
    }

    /**
     * 新增vps和服务关联
     * 
     * @param sysRoleDept vps和服务关联
     * @return 结果
     */
    @Override
    public int insertSysRoleDept(SysRoleDept sysRoleDept)
    {
        return sysRoleDeptMapper.insertSysRoleDept(sysRoleDept);
    }

    /**
     * 修改vps和服务关联
     * 
     * @param sysRoleDept vps和服务关联
     * @return 结果
     */
    @Override
    public int updateSysRoleDept(SysRoleDept sysRoleDept)
    {
        return sysRoleDeptMapper.updateSysRoleDept(sysRoleDept);
    }

    /**
     * 批量删除vps和服务关联
     * 
     * @param vpsIds 需要删除的vps和服务关联ID
     * @return 结果
     */
    @Override
    public int deleteSysRoleDeptByIds(Long[] vpsIds)
    {
        return sysRoleDeptMapper.deleteSysRoleDeptByIds(vpsIds);
    }

    /**
     * 删除vps和服务关联信息
     * 
     * @param vpsId vps和服务关联ID
     * @return 结果
     */
    @Override
    public int deleteSysRoleDeptById(Long vpsId)
    {
        return sysRoleDeptMapper.deleteSysRoleDeptById(vpsId);
    }
}
