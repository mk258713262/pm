package com.cyberaray.proxymanager.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * shadowsocks服务对象 service_shadowsocks
 * 
 * @author mok
 * @date 2020-06-16
 */
public class ServiceShadowsocks
{
    private static final long serialVersionUID = 1L;

    /** 服务编号 */
    private Long id;

    /** Vps ID */
    private Long vpsId;

    /** shadowsocks_端口 */
    private String shadowsocksPort;

    /** shadowsocks_密码 */
    private String shadowsocksPassword;

    /** shadowsocks_协议 */
    private String shadowsocksProtocol;

    /** shadowsocks_混淆协议 */
    private String shadowsocksConfusion;

    /** shadowsocks_创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date shadowsocksCreatetime;

    /** shadowsocks_更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date shadowsocksUpdatetime;

    /** shadowsocks_备注 */
    private String shadowsocksRemark;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setVpsId(Long vpsId) 
    {
        this.vpsId = vpsId;
    }

    public Long getVpsId() 
    {
        return vpsId;
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
        this.shadowsocksRemark = vshadowsocksRemark;
    }

    public String getVshadowsocksRemark() 
    {
        return shadowsocksRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vpsId", getVpsId())
            .append("shadowsocksPort", getShadowsocksPort())
            .append("shadowsocksPassword", getShadowsocksPassword())
            .append("shadowsocksProtocol", getShadowsocksProtocol())
            .append("shadowsocksConfusion", getShadowsocksConfusion())
            .append("shadowsocksCreatetime", getShadowsocksCreatetime())
            .append("shadowsocksUpdatetime", getShadowsocksUpdatetime())
            .append("vshadowsocksRemark", getVshadowsocksRemark())
            .toString();
    }
}
