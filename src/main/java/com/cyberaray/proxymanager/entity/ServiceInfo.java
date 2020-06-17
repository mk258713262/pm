package com.cyberaray.proxymanager.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 服务类型对象 service_info
 * 
 * @author mok
 * @date 2020-06-10
 */
@Deprecated
public class ServiceInfo
{
    private static final long serialVersionUID = 1L;

    /** 服务编号 */
    private Long id;

    /** ssh_隧道 */
    private String sshTannel;

    /** ssh_私钥 */
    private String sshPrikey;

    /** ssh_创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sshCreateTime;

    /** ssh_更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sshUpdateTime;

    /** ssh_备注 */
    private String sshRemark;

    /** v2ray_UUID */
    private String v2rayUuid;

    /** v2ray_ip */
    private String v2ryIp;

    /** v2ray端口 */
    private String v2ryPort;

    /** v2ray协议 */
    private String v2rayProtocol;

    /** v2ray_TLS */
    private String v2rayTls;

    /** v2ray_创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date v2rayCreatetime;

    /** v2ray_更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date v2rayUpdatetime;

    /** v2ray_备注 */
    private String v2rayRemark;

    /** v2ray_端口 */
    private String shadowsocksPort;

    /** v2ray_密码 */
    private String shadowsocksPassword;

    /** v2ray_协议 */
    private String shadowsocksProtocol;

    /** v2ray_混淆协议 */
    private String shadowsocksConfusion;

    /** v2ray_创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date shadowsocksCreatetime;

    /** v2ray_更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date shadowsocksUpdatetime;

    /** v2ray_备注 */
    private String vshadowsocksRemark;

    /** FF_端口 */
    private String ffPort;

    /** FF_密钥 */
    private String ffPem;

    /** FF_私钥 */
    private String ffOwnerkey;

    /** FF_创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ffCreatetime;

    /** FF_更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ffUpdatetime;

    /** FF_备注 */
    private String ffRemark;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSshTannel(String sshTannel) 
    {
        this.sshTannel = sshTannel;
    }

    public String getSshTannel() 
    {
        return sshTannel;
    }
    public void setSshPrikey(String sshPrikey) 
    {
        this.sshPrikey = sshPrikey;
    }

    public String getSshPrikey() 
    {
        return sshPrikey;
    }
    public void setSshCreateTime(Date sshCreateTime) 
    {
        this.sshCreateTime = sshCreateTime;
    }

    public Date getSshCreateTime() 
    {
        return sshCreateTime;
    }
    public void setSshUpdateTime(Date sshUpdateTime) 
    {
        this.sshUpdateTime = sshUpdateTime;
    }

    public Date getSshUpdateTime() 
    {
        return sshUpdateTime;
    }
    public void setSshRemark(String sshRemark) 
    {
        this.sshRemark = sshRemark;
    }

    public String getSshRemark() 
    {
        return sshRemark;
    }
    public void setV2rayUuid(String v2rayUuid) 
    {
        this.v2rayUuid = v2rayUuid;
    }

    public String getV2rayUuid() 
    {
        return v2rayUuid;
    }
    public void setV2ryIp(String v2ryIp) 
    {
        this.v2ryIp = v2ryIp;
    }

    public String getV2ryIp() 
    {
        return v2ryIp;
    }
    public void setV2ryPort(String v2ryPort) 
    {
        this.v2ryPort = v2ryPort;
    }

    public String getV2ryPort() 
    {
        return v2ryPort;
    }
    public void setV2rayProtocol(String v2rayProtocol) 
    {
        this.v2rayProtocol = v2rayProtocol;
    }

    public String getV2rayProtocol() 
    {
        return v2rayProtocol;
    }
    public void setV2rayTls(String v2rayTls) 
    {
        this.v2rayTls = v2rayTls;
    }

    public String getV2rayTls() 
    {
        return v2rayTls;
    }
    public void setV2rayCreatetime(Date v2rayCreatetime) 
    {
        this.v2rayCreatetime = v2rayCreatetime;
    }

    public Date getV2rayCreatetime() 
    {
        return v2rayCreatetime;
    }
    public void setV2rayUpdatetime(Date v2rayUpdatetime) 
    {
        this.v2rayUpdatetime = v2rayUpdatetime;
    }

    public Date getV2rayUpdatetime() 
    {
        return v2rayUpdatetime;
    }
    public void setV2rayRemark(String v2rayRemark) 
    {
        this.v2rayRemark = v2rayRemark;
    }

    public String getV2rayRemark() 
    {
        return v2rayRemark;
    }
    public void setShadowsocksPort(String shadowsocksPort) 
    {
        this.shadowsocksPort = shadowsocksPort;
    }

    public String getShadowsocksPort() 
    {
        return shadowsocksPort;
    }
    public void setShadowsocksPassword(String shadowsocksPassword) 
    {
        this.shadowsocksPassword = shadowsocksPassword;
    }

    public String getShadowsocksPassword() 
    {
        return shadowsocksPassword;
    }
    public void setShadowsocksProtocol(String shadowsocksProtocol) 
    {
        this.shadowsocksProtocol = shadowsocksProtocol;
    }

    public String getShadowsocksProtocol() 
    {
        return shadowsocksProtocol;
    }
    public void setShadowsocksConfusion(String shadowsocksConfusion) 
    {
        this.shadowsocksConfusion = shadowsocksConfusion;
    }

    public String getShadowsocksConfusion() 
    {
        return shadowsocksConfusion;
    }
    public void setShadowsocksCreatetime(Date shadowsocksCreatetime) 
    {
        this.shadowsocksCreatetime = shadowsocksCreatetime;
    }

    public Date getShadowsocksCreatetime() 
    {
        return shadowsocksCreatetime;
    }
    public void setShadowsocksUpdatetime(Date shadowsocksUpdatetime) 
    {
        this.shadowsocksUpdatetime = shadowsocksUpdatetime;
    }

    public Date getShadowsocksUpdatetime() 
    {
        return shadowsocksUpdatetime;
    }
    public void setVshadowsocksRemark(String vshadowsocksRemark) 
    {
        this.vshadowsocksRemark = vshadowsocksRemark;
    }

    public String getVshadowsocksRemark() 
    {
        return vshadowsocksRemark;
    }
    public void setFfPort(String ffPort) 
    {
        this.ffPort = ffPort;
    }

    public String getFfPort() 
    {
        return ffPort;
    }
    public void setFfPem(String ffPem) 
    {
        this.ffPem = ffPem;
    }

    public String getFfPem() 
    {
        return ffPem;
    }
    public void setFfOwnerkey(String ffOwnerkey) 
    {
        this.ffOwnerkey = ffOwnerkey;
    }

    public String getFfOwnerkey() 
    {
        return ffOwnerkey;
    }
    public void setFfCreatetime(Date ffCreatetime) 
    {
        this.ffCreatetime = ffCreatetime;
    }

    public Date getFfCreatetime() 
    {
        return ffCreatetime;
    }
    public void setFfUpdatetime(Date ffUpdatetime) 
    {
        this.ffUpdatetime = ffUpdatetime;
    }

    public Date getFfUpdatetime() 
    {
        return ffUpdatetime;
    }
    public void setFfRemark(String ffRemark) 
    {
        this.ffRemark = ffRemark;
    }

    public String getFfRemark() 
    {
        return ffRemark;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "id=" + id +
                ", sshTannel='" + sshTannel + '\'' +
                ", sshPrikey='" + sshPrikey + '\'' +
                ", sshCreateTime=" + sshCreateTime +
                ", sshUpdateTime=" + sshUpdateTime +
                ", sshRemark='" + sshRemark + '\'' +
                ", v2rayUuid='" + v2rayUuid + '\'' +
                ", v2ryIp='" + v2ryIp + '\'' +
                ", v2ryPort='" + v2ryPort + '\'' +
                ", v2rayProtocol='" + v2rayProtocol + '\'' +
                ", v2rayTls='" + v2rayTls + '\'' +
                ", v2rayCreatetime=" + v2rayCreatetime +
                ", v2rayUpdatetime=" + v2rayUpdatetime +
                ", v2rayRemark='" + v2rayRemark + '\'' +
                ", shadowsocksPort='" + shadowsocksPort + '\'' +
                ", shadowsocksPassword='" + shadowsocksPassword + '\'' +
                ", shadowsocksProtocol='" + shadowsocksProtocol + '\'' +
                ", shadowsocksConfusion='" + shadowsocksConfusion + '\'' +
                ", shadowsocksCreatetime=" + shadowsocksCreatetime +
                ", shadowsocksUpdatetime=" + shadowsocksUpdatetime +
                ", vshadowsocksRemark='" + vshadowsocksRemark + '\'' +
                ", ffPort='" + ffPort + '\'' +
                ", ffPem='" + ffPem + '\'' +
                ", ffOwnerkey='" + ffOwnerkey + '\'' +
                ", ffCreatetime=" + ffCreatetime +
                ", ffUpdatetime=" + ffUpdatetime +
                ", ffRemark='" + ffRemark + '\'' +
                '}';
    }
}
