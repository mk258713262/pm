package com.cyberaray.proxymanager.dao;

import com.cyberaray.proxymanager.entity.SysRoleDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleDeptMapper {
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
     * 删除vps和服务关联
     *
     * @param vpsId vps和服务关联ID
     * @return 结果
     */
    int deleteSysRoleDeptById(Long vpsId);

    /**
     * 批量删除vps和服务关联
     *
     * @param vpsIds 需要删除的数据ID
     * @return 结果
     */
    int deleteSysRoleDeptByIds(Long[] vpsIds);
}
