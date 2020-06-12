package com.cyberaray.proxymanager.service;

import java.util.List;

import com.cyberaray.proxymanager.entity.VpsInfo;

/**
 * VPS信息Service接口
 * 
 * @author mok
 * @date 2020-06-10
 */
public interface IVpsInfoService 
{
    /**
     * 查询VPS信息
     * 
     * @param id VPS信息ID
     * @return VPS信息
     */
    public VpsInfo selectVpsInfoById(Long id);

    /**
     * 查询VPS信息列表
     * 
     * @param vpsInfo VPS信息
     * @return VPS信息集合
     */
    public List<VpsInfo> selectVpsInfoList(VpsInfo vpsInfo);

    /**
     * 新增VPS信息
     * 
     * @param vpsInfo VPS信息
     * @return 结果
     */
    public int insertVpsInfo(VpsInfo vpsInfo);

    /**
     * 修改VPS信息
     * 
     * @param vpsInfo VPS信息
     * @return 结果
     */
    public int updateVpsInfo(VpsInfo vpsInfo);

    /**
     * 批量删除VPS信息
     * 
     * @param ids 需要删除的VPS信息ID
     * @return 结果
     */
    public int deleteVpsInfoByIds(Long[] ids);

    /**
     * 删除VPS信息信息
     * 
     * @param id VPS信息ID
     * @return 结果
     */
    public int deleteVpsInfoById(Long id);
}
