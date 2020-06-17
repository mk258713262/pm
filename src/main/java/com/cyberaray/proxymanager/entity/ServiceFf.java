package com.cyberaray.proxymanager.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * ff服务对象 service_ff
 * 
 * @author mok
 * @date 2020-06-16
 */
public class ServiceFf
{
    private static final long serialVersionUID = 1L;

    /** 服务编号 */
    private Long id;

    /** Vps ID */
    private Long vpsId;

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
    public void setVpsId(Long vpsId) 
    {
        this.vpsId = vpsId;
    }

    public Long getVpsId() 
    {
        return vpsId;
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
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vpsId", getVpsId())
            .append("ffPort", getFfPort())
            .append("ffPem", getFfPem())
            .append("ffOwnerkey", getFfOwnerkey())
            .append("ffCreatetime", getFfCreatetime())
            .append("ffUpdatetime", getFfUpdatetime())
            .append("ffRemark", getFfRemark())
            .toString();
    }
}
