package com.cyberaray.proxymanager.entity;


/**
 * vps和服务关联对象 sys_role_dept
 * 
 * @author mok
 * @date 2020-06-10
 */
@Deprecated
public class SysRoleDept
{
    private static final long serialVersionUID = 1L;

    /** VPS_ID */
    private Long vpsId;

    /** service_ID */
    private Long serviceId;

    public void setVpsId(Long vpsId) 
    {
        this.vpsId = vpsId;
    }

    public Long getVpsId() 
    {
        return vpsId;
    }
    public void setServiceId(Long serviceId) 
    {
        this.serviceId = serviceId;
    }

    public Long getServiceId() 
    {
        return serviceId;
    }

    @Override
    public String toString() {
        return "SysRoleDept{" +
                "vpsId=" + vpsId +
                ", serviceId=" + serviceId +
                '}';
    }
}
