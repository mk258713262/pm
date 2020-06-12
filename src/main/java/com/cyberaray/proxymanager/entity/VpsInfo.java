package com.cyberaray.proxymanager.entity;

import java.util.Date;

/**
 * VPS信息对象 vps_info
 * 
 * @author mok
 * @date 2020-06-10
 */
public class VpsInfo
{
    private static final long serialVersionUID = 1L;

    /** Vps ID */
    private Long id;

    /** vps名称 */
    private String name;

    /** Vps购买平台 */
    private String platform;

    /** Vps核心数 */
    private String core;

    /** Vps内存 */
    private String memory;

    /** Vps带宽 */
    private String bandwidth;

    /** Vps月流量 */
    private String streamflow;

    /** Vps_ip */
    private String sshport;

    /** Vps_port */
    private String sship;

    /** Vps管理账号 */
    private String sshuser;

    /** Vps管理密码 */
    private String sshpassword;

    /** Vps 管理密钥 */
    private String sshpem;

    /** Vps 是否可用（0不可用，1可用） */
    private Long state;

    /** Vps 在线状态（0不在线，1在线） */
    private Long online;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPlatform(String platform) 
    {
        this.platform = platform;
    }

    public String getPlatform() 
    {
        return platform;
    }
    public void setCore(String core) 
    {
        this.core = core;
    }

    public String getCore() 
    {
        return core;
    }
    public void setMemory(String memory) 
    {
        this.memory = memory;
    }

    public String getMemory() 
    {
        return memory;
    }
    public void setBandwidth(String bandwidth) 
    {
        this.bandwidth = bandwidth;
    }

    public String getBandwidth() 
    {
        return bandwidth;
    }
    public void setStreamflow(String streamflow) 
    {
        this.streamflow = streamflow;
    }

    public String getStreamflow() 
    {
        return streamflow;
    }
    public void setSshport(String sshport) 
    {
        this.sshport = sshport;
    }

    public String getSshport() 
    {
        return sshport;
    }
    public void setSship(String sship) 
    {
        this.sship = sship;
    }

    public String getSship() 
    {
        return sship;
    }
    public void setSshuser(String sshuser) 
    {
        this.sshuser = sshuser;
    }

    public String getSshuser() 
    {
        return sshuser;
    }
    public void setSshpassword(String sshpassword) 
    {
        this.sshpassword = sshpassword;
    }

    public String getSshpassword() 
    {
        return sshpassword;
    }
    public void setSshpem(String sshpem) 
    {
        this.sshpem = sshpem;
    }

    public String getSshpem() 
    {
        return sshpem;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }
    public void setOnline(Long online) 
    {
        this.online = online;
    }

    public Long getOnline() 
    {
        return online;
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
        return "VpsInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", core='" + core + '\'' +
                ", memory='" + memory + '\'' +
                ", bandwidth='" + bandwidth + '\'' +
                ", streamflow='" + streamflow + '\'' +
                ", sshport='" + sshport + '\'' +
                ", sship='" + sship + '\'' +
                ", sshuser='" + sshuser + '\'' +
                ", sshpassword='" + sshpassword + '\'' +
                ", sshpem='" + sshpem + '\'' +
                ", state=" + state +
                ", online=" + online +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
