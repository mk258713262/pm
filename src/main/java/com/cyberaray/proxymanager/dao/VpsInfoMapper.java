package com.cyberaray.proxymanager.dao;

import com.cyberaray.proxymanager.entity.VpsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VpsInfoMapper {
    /**
     * 查询VPS信息
     *
     * @param id VPS信息ID
     * @return VPS信息
     */
    VpsInfo selectVpsInfoById(Long id);

    /**
     * 查询VPS信息列表
     *
     * @param vpsInfo VPS信息
     * @return VPS信息集合
     */
    List<VpsInfo> selectVpsInfoList(VpsInfo vpsInfo);

    /**
     * 新增VPS信息
     *
     * @param vpsInfo VPS信息
     * @return 结果
     */
    int insertVpsInfo(VpsInfo vpsInfo);

    /**
     * 修改VPS信息
     *
     * @param vpsInfo VPS信息
     * @return 结果
     */
    int updateVpsInfo(VpsInfo vpsInfo);

    /**
     * 删除VPS信息
     *
     * @param id VPS信息ID
     * @return 结果
     */
    int deleteVpsInfoById(Long id);

    /**
     * 批量删除VPS信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteVpsInfoByIds(Long[] ids);
}
