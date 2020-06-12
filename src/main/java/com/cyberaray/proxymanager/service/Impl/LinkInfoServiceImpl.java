package com.cyberaray.proxymanager.service.Impl;

import java.util.List;

import com.cyberaray.proxymanager.dao.LinkInfoMapper;
import com.cyberaray.proxymanager.entity.LinkInfo;
import com.cyberaray.proxymanager.service.ILinkInfoService;
import com.cyberaray.proxymanager.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 链路信息Service业务层处理
 * 
 * @author mok
 * @date 2020-06-10
 */
@Service
public class LinkInfoServiceImpl implements ILinkInfoService
{
    @Autowired
    private LinkInfoMapper linkInfoMapper;

    /**
     * 查询链路信息
     * 
     * @param id 链路信息ID
     * @return 链路信息
     */
    @Override
    public LinkInfo selectLinkInfoById(Long id)
    {
        return linkInfoMapper.selectLinkInfoById(id);
    }

    /**
     * 查询链路信息列表
     * 
     * @param linkInfo 链路信息
     * @return 链路信息
     */
    @Override
    public List<LinkInfo> selectLinkInfoList(LinkInfo linkInfo)
    {
        return linkInfoMapper.selectLinkInfoList(linkInfo);
    }

    /**
     * 新增链路信息
     * 
     * @param linkInfo 链路信息
     * @return 结果
     */
    @Override
    public int insertLinkInfo(LinkInfo linkInfo)
    {
        linkInfo.setCreateTime(DateUtils.getNowDate());
        return linkInfoMapper.insertLinkInfo(linkInfo);
    }

    /**
     * 修改链路信息
     * 
     * @param linkInfo 链路信息
     * @return 结果
     */
    @Override
    public int updateLinkInfo(LinkInfo linkInfo)
    {
        linkInfo.setUpdateTime(DateUtils.getNowDate());
        return linkInfoMapper.updateLinkInfo(linkInfo);
    }

    /**
     * 批量删除链路信息
     * 
     * @param ids 需要删除的链路信息ID
     * @return 结果
     */
    @Override
    public int deleteLinkInfoByIds(Long[] ids)
    {
        return linkInfoMapper.deleteLinkInfoByIds(ids);
    }

    /**
     * 删除链路信息信息
     * 
     * @param id 链路信息ID
     * @return 结果
     */
    @Override
    public int deleteLinkInfoById(Long id)
    {
        return linkInfoMapper.deleteLinkInfoById(id);
    }
}
