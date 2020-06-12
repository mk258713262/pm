package com.cyberaray.proxymanager.entity;

import java.util.Date;

/**
 * 链路信息对象 link_info
 * 
 * @author mok
 * @date 2020-06-10
 */
public class LinkInfo
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 链路类型 */
    private String linkType;

    /** 协议类型 */
    private String protocolType;

    /** ip：端口 */
    private String ipPort;

    /** 出口IP */
    private String expIp;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    /** 备注 */
    private String remark;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLinkType(String linkType) 
    {
        this.linkType = linkType;
    }

    public String getLinkType() 
    {
        return linkType;
    }
    public void setProtocolType(String protocolType) 
    {
        this.protocolType = protocolType;
    }

    public String getProtocolType() 
    {
        return protocolType;
    }
    public void setIpPort(String ipPort) 
    {
        this.ipPort = ipPort;
    }

    public String getIpPort() 
    {
        return ipPort;
    }
    public void setExpIp(String expIp) 
    {
        this.expIp = expIp;
    }

    public String getExpIp() 
    {
        return expIp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "LinkInfo{" +
                "id=" + id +
                ", linkType='" + linkType + '\'' +
                ", protocolType='" + protocolType + '\'' +
                ", ipPort='" + ipPort + '\'' +
                ", expIp='" + expIp + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
