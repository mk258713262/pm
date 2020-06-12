package com.cyberaray.proxymanager.service;

import com.cyberaray.proxymanager.entity.LinkInfo;

import java.util.List;


/**
 * 链路信息Service接口
 * 
 * @author mok
 * @date 2020-06-10
 */
public interface ILinkInfoService 
{
    /**
     * 查询链路信息
     * 
     * @param id 链路信息ID
     * @return 链路信息
     */
    public LinkInfo selectLinkInfoById(Long id);

    /**
     * 查询链路信息列表
     * 
     * @param linkInfo 链路信息
     * @return 链路信息集合
     */
    public List<LinkInfo> selectLinkInfoList(LinkInfo linkInfo);

    /**
     * 新增链路信息
     * 
     * @param linkInfo 链路信息
     * @return 结果
     */
    public int insertLinkInfo(LinkInfo linkInfo);

    /**
     * 修改链路信息
     * 
     * @param linkInfo 链路信息
     * @return 结果
     */
    public int updateLinkInfo(LinkInfo linkInfo);

    /**
     * 批量删除链路信息
     * 
     * @param ids 需要删除的链路信息ID
     * @return 结果
     */
    public int deleteLinkInfoByIds(Long[] ids);

    /**
     * 删除链路信息信息
     * 
     * @param id 链路信息ID
     * @return 结果
     */
    public int deleteLinkInfoById(Long id);
}
