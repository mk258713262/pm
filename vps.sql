-- ----------------------------
--链路信息表 
-- ----------------------------
drop table if exists link_info;
create table link_info (
  id           int(11)			not null auto_increment    comment  '编号',
  link_type         varchar(200)    default ''                 comment '链路类型',
  protocol_type     varchar(200)    default ''                 comment '协议类型',
  ip_port           varchar(20)     default ''                 comment 'ip：端口',
  exp_ip            varchar(15)     default ''                 comment '出口IP',
  create_time 	    timestamp null default CURRENT_TIMESTAMP()                comment '创建时间',
  update_time       timestamp null default CURRENT_TIMESTAMP()                 comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8  comment = '链路信息表';
-- ----------------------------
--vps信息表  
-- ----------------------------
drop table if exists vps_info;
create table vps_info (
  id            int(11)      not null auto_increment    comment 'Vps ID',
  name          varchar(100)    default ''				   comment 'vps名称',
  platform      varchar(100)    default ''				   comment 'Vps购买平台',
  core          varchar(10)    default ''				   comment 'Vps核心数',
  memory        varchar(10)    default ''				   comment 'Vps内存',
  bandwidth     varchar(10)    default ''				   comment 'Vps带宽',
  streamflow    varchar(10)    default ''				   comment 'Vps月流量',
  sshport       varchar(15)    default ''                 comment 'Vps_ip',
  sship         varchar(10)    default ''                 comment 'Vps_port',
  sshuser       varchar(100)    default 'root'                 comment 'Vps管理账号',
  sshpassword        varchar(50)    default ''				   comment 'Vps管理密码',
  sshpem        varchar(100)    default ''                 comment 'Vps 管理密钥',
  state         int(11) default null                 comment 'Vps 是否可用（0不可用，1可用）',
  online        int(11) default null                  comment 'Vps 在线状态（0不在线，1在线）',
  create_time 	    timestamp null default CURRENT_TIMESTAMP()               comment '创建时间',
  update_time       timestamp null default CURRENT_TIMESTAMP()               comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8  comment = 'VPS信息表';
-- ----------------------------
--服务类型表  
-- ----------------------------
drop table if exists service_info;
create table service_info (
  id        int(11)      not null auto_increment    comment '服务编号',
  ssh_tannel        varchar(100)    default ''                 comment 'ssh_隧道',
  ssh_prikey        varchar(100)    default ''                 comment 'ssh_私钥',
  ssh_create_time 	timestamp null DEFAULT CURRENT_TIMESTAMP()    comment 'ssh_创建时间',
  ssh_update_time   timestamp null DEFAULT CURRENT_TIMESTAMP()     comment 'ssh_更新时间',
  ssh_remark        varchar(500)    default null               comment 'ssh_备注',

  v2ray_UUID		varchar(200)    default ''                 comment 'v2ray_UUID',
  v2ry_ip			varchar(15)    default ''                  comment 'v2ray_ip',
  v2ry_port			varchar(10)    default ''                  comment 'v2ray端口',
  v2ray_protocol	varchar(100)    default ''                 comment 'v2ray协议',
  v2ray_TLS			varchar(100)    default ''                 comment 'v2ray_TLS',
  v2ray_createtime 	     timestamp null default CURRENT_TIMESTAMP()      comment 'v2ray_创建时间',
  v2ray_updatetime       timestamp null default CURRENT_TIMESTAMP()      comment 'v2ray_更新时间',
  v2ray_remark           varchar(500)    default null               comment 'v2ray_备注',
 
  shadowsocks_port       varchar(10)    default ''                 comment 'v2ray_端口',
  shadowsocks_password   varchar(20)    default ''                 comment 'v2ray_密码',
  shadowsocks_protocol   varchar(100)    default ''                 comment 'v2ray_协议',
  shadowsocks_confusion  varchar(100)    default ''                 comment 'v2ray_混淆协议',
  shadowsocks_createtime 	   timestamp null default CURRENT_TIMESTAMP()       comment 'v2ray_创建时间',
  shadowsocks_updatetime       timestamp null default CURRENT_TIMESTAMP()        comment 'v2ray_更新时间',
  vshadowsocks_remark          varchar(500)    default null               comment 'v2ray_备注',

  FF_port			  varchar(10)    default ''                 comment 'FF_端口',
  FF_pem			  varchar(100)    default ''                 comment 'FF_密钥',
  FF_ownerKey		  varchar(100)    default ''                 comment 'FF_私钥',
  FF_createtime 	  timestamp null default CURRENT_TIMESTAMP()                comment 'FF_创建时间',
  FF_updatetime       timestamp null default CURRENT_TIMESTAMP()                comment 'FF_更新时间',
  FF_remark           varchar(500)    default null               comment 'FF_备注',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8 comment = '服务类型表';

-- ----------------------------
--vps和服务类型关联表  1-N
-- ----------------------------
drop table if exists sys_role_dept;
create table sys_role_dept (
  vps_id   int(11) not null comment 'VPS_ID',
  service_id   int(11) not null comment 'service_ID',
  primary key(vps_id, service_id)
) engine=innodb  default charset=utf8 comment = 'vps和服务关联表';

DROP TABLE IF EXISTS `user`;

-- ----------------------------
--用户信息表 
-- ----------------------------
 SET character_set_client = utf8mb4 ;
 drop table if exists user;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `salt` varchar(50) DEFAULT NULL COMMENT '盐字段',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `type` int(11) DEFAULT NULL COMMENT '0-普通用户; 1-管理员;',
  `status` int(11) DEFAULT NULL COMMENT '0-未激活; 1-已激活;',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `index_username` (`username`(20)),
  KEY `index_email` (`email`(20))
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COMMENT = '用户信息表';



CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '0-普通用户; 1-超级管理员;',
  `status` int(11) DEFAULT NULL COMMENT '0-未激活; 1-已激活;',
  `activation_code` varchar(100) DEFAULT NULL,
  `header_url` varchar(200) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_username` (`username`(20)),
  KEY `index_email` (`email`(20))
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `login_ticket`;
CREATE TABLE `login_ticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `ticket` varchar(45) NOT NULL,
  `status` int(11) DEFAULT '0' COMMENT '0-有效; 1-无效;',
  `expired` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `index_ticket` (`ticket`(20))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;