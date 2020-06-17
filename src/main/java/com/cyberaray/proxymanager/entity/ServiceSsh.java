package com.cyberaray.proxymanager.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * SSH服务对象 service_ssh
 * 
 * @author mok
 * @date 2020-06-16
 */
public class ServiceSsh
{
    private static final long serialVersionUID = 1L;

    /** 服务编号 */
    private Long id;

    /** Vps ID */
    private Long vpsId;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vpsId", getVpsId())
            .append("sshTannel", getSshTannel())
            .append("sshPrikey", getSshPrikey())
            .append("sshCreateTime", getSshCreateTime())
            .append("sshUpdateTime", getSshUpdateTime())
            .append("sshRemark", getSshRemark())
            .toString();
    }
}
