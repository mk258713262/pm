package com.cyberaray.proxymanager.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * V2Ray服务对象 service_v2ray
 * 
 * @author mok
 * @date 2020-06-16
 */
public class ServiceV2ray
{
    private static final long serialVersionUID = 1L;

    /** 服务编号 */
    private Long id;

    /** Vps ID */
    private Long vpsId;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vpsId", getVpsId())
            .append("v2rayUuid", getV2rayUuid())
            .append("v2ryIp", getV2ryIp())
            .append("v2ryPort", getV2ryPort())
            .append("v2rayProtocol", getV2rayProtocol())
            .append("v2rayTls", getV2rayTls())
            .append("v2rayCreatetime", getV2rayCreatetime())
            .append("v2rayUpdatetime", getV2rayUpdatetime())
            .append("v2rayRemark", getV2rayRemark())
            .toString();
    }
}
