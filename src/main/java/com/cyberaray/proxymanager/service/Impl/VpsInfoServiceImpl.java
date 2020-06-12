package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.VpsInfoMapper;
import com.cyberaray.proxymanager.entity.VpsInfo;
import com.cyberaray.proxymanager.service.IVpsInfoService;
import com.cyberaray.proxymanager.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * VPS信息Service业务层处理
 * 
 * @author mok
 * @date 2020-06-10
 */
@Service
public class VpsInfoServiceImpl implements IVpsInfoService
{
    @Autowired
    private VpsInfoMapper vpsInfoMapper;

    /**
     * 查询VPS信息
     * 
     * @param id VPS信息ID
     * @return VPS信息
     */
    @Override
    public VpsInfo selectVpsInfoById(Long id)
    {
        return vpsInfoMapper.selectVpsInfoById(id);
    }

    /**
     * 查询VPS信息列表
     * 
     * @param vpsInfo VPS信息
     * @return VPS信息
     */
    @Override
    public List<VpsInfo> selectVpsInfoList(VpsInfo vpsInfo)
    {
        return vpsInfoMapper.selectVpsInfoList(vpsInfo);
    }

    /**
     * 新增VPS信息
     * 
     * @param vpsInfo VPS信息
     * @return 结果
     */
    @Override
    public int insertVpsInfo(VpsInfo vpsInfo)
    {
        vpsInfo.setCreateTime(DateUtils.getNowDate());
        return vpsInfoMapper.insertVpsInfo(vpsInfo);
    }

    /**
     * 修改VPS信息
     * 
     * @param vpsInfo VPS信息
     * @return 结果
     */
    @Override
    public int updateVpsInfo(VpsInfo vpsInfo)
    {
        vpsInfo.setUpdateTime(DateUtils.getNowDate());
        return vpsInfoMapper.updateVpsInfo(vpsInfo);
    }

    /**
     * 批量删除VPS信息
     * 
     * @param ids 需要删除的VPS信息ID
     * @return 结果
     */
    @Override
    public int deleteVpsInfoByIds(Long[] ids)
    {
        return vpsInfoMapper.deleteVpsInfoByIds(ids);
    }

    /**
     * 删除VPS信息信息
     * 
     * @param id VPS信息ID
     * @return 结果
     */
    @Override
    public int deleteVpsInfoById(Long id)
    {
        return vpsInfoMapper.deleteVpsInfoById(id);
    }
}
