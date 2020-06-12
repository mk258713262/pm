package com.cyberaray.proxymanager.dao;

import com.cyberaray.proxymanager.entity.LinkInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LinkInfoMapper {
    /**
     * 查询链路信息
     *
     * @param id 链路信息ID
     * @return 链路信息
     */
     LinkInfo selectLinkInfoById(Long id);

    /**
     * 查询链路信息列表
     *
     * @param linkInfo 链路信息
     * @return 链路信息集合
     */
     List<LinkInfo> selectLinkInfoList(LinkInfo linkInfo);

    /**
     * 新增链路信息
     *
     * @param linkInfo 链路信息
     * @return 结果
     */
     int insertLinkInfo(LinkInfo linkInfo);

    /**
     * 修改链路信息
     *
     * @param linkInfo 链路信息
     * @return 结果
     */
     int updateLinkInfo(LinkInfo linkInfo);

    /**
     * 删除链路信息
     *
     * @param id 链路信息ID
     * @return 结果
     */
     int deleteLinkInfoById(Long id);

    /**
     * 批量删除链路信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
     int deleteLinkInfoByIds(Long[] ids);
}
