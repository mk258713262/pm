-- ----------------------------
--��·��Ϣ�� 
-- ----------------------------
drop table if exists link_info;
create table link_info (
  id           int(11)			not null auto_increment    comment  '���',
  link_type         varchar(200)    default ''                 comment '��·����',
  protocol_type     varchar(200)    default ''                 comment 'Э������',
  ip_port           varchar(20)     default ''                 comment 'ip���˿�',
  exp_ip            varchar(15)     default ''                 comment '����IP',
  create_time 	    timestamp null default CURRENT_TIMESTAMP()                comment '����ʱ��',
  update_time       timestamp null default CURRENT_TIMESTAMP()                 comment '����ʱ��',
  remark            varchar(500)    default null               comment '��ע',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8  comment = '��·��Ϣ��';
-- ----------------------------
--vps��Ϣ��  
-- ----------------------------
drop table if exists vps_info;
create table vps_info (
  id            int(11)      not null auto_increment    comment 'Vps ID',
  name          varchar(100)    default ''				   comment 'vps����',
  platform      varchar(100)    default ''				   comment 'Vps����ƽ̨',
  core          varchar(10)    default ''				   comment 'Vps������',
  memory        varchar(10)    default ''				   comment 'Vps�ڴ�',
  bandwidth     varchar(10)    default ''				   comment 'Vps����',
  streamflow    varchar(10)    default ''				   comment 'Vps������',
  sshport       varchar(15)    default ''                 comment 'Vps_ip',
  sship         varchar(10)    default ''                 comment 'Vps_port',
  sshuser       varchar(100)    default 'root'                 comment 'Vps�����˺�',
  sshpassword        varchar(50)    default ''				   comment 'Vps��������',
  sshpem        varchar(100)    default ''                 comment 'Vps ������Կ',
  state         int(11) default null                 comment 'Vps �Ƿ���ã�0�����ã�1���ã�',
  online        int(11) default null                  comment 'Vps ����״̬��0�����ߣ�1���ߣ�',
  create_time 	    timestamp null default CURRENT_TIMESTAMP()               comment '����ʱ��',
  update_time       timestamp null default CURRENT_TIMESTAMP()               comment '����ʱ��',
  remark            varchar(500)    default null               comment '��ע',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8  comment = 'VPS��Ϣ��';
-- ----------------------------
--�������ͱ�  
-- ----------------------------
drop table if exists service_info;
create table service_info (
  id        int(11)      not null auto_increment    comment '������',
  ssh_tannel        varchar(100)    default ''                 comment 'ssh_���',
  ssh_prikey        varchar(100)    default ''                 comment 'ssh_˽Կ',
  ssh_create_time 	timestamp null DEFAULT CURRENT_TIMESTAMP()    comment 'ssh_����ʱ��',
  ssh_update_time   timestamp null DEFAULT CURRENT_TIMESTAMP()     comment 'ssh_����ʱ��',
  ssh_remark        varchar(500)    default null               comment 'ssh_��ע',

  v2ray_UUID		varchar(200)    default ''                 comment 'v2ray_UUID',
  v2ry_ip			varchar(15)    default ''                  comment 'v2ray_ip',
  v2ry_port			varchar(10)    default ''                  comment 'v2ray�˿�',
  v2ray_protocol	varchar(100)    default ''                 comment 'v2rayЭ��',
  v2ray_TLS			varchar(100)    default ''                 comment 'v2ray_TLS',
  v2ray_createtime 	     timestamp null default CURRENT_TIMESTAMP()      comment 'v2ray_����ʱ��',
  v2ray_updatetime       timestamp null default CURRENT_TIMESTAMP()      comment 'v2ray_����ʱ��',
  v2ray_remark           varchar(500)    default null               comment 'v2ray_��ע',
 
  shadowsocks_port       varchar(10)    default ''                 comment 'v2ray_�˿�',
  shadowsocks_password   varchar(20)    default ''                 comment 'v2ray_����',
  shadowsocks_protocol   varchar(100)    default ''                 comment 'v2ray_Э��',
  shadowsocks_confusion  varchar(100)    default ''                 comment 'v2ray_����Э��',
  shadowsocks_createtime 	   timestamp null default CURRENT_TIMESTAMP()       comment 'v2ray_����ʱ��',
  shadowsocks_updatetime       timestamp null default CURRENT_TIMESTAMP()        comment 'v2ray_����ʱ��',
  vshadowsocks_remark          varchar(500)    default null               comment 'v2ray_��ע',

  FF_port			  varchar(10)    default ''                 comment 'FF_�˿�',
  FF_pem			  varchar(100)    default ''                 comment 'FF_��Կ',
  FF_ownerKey		  varchar(100)    default ''                 comment 'FF_˽Կ',
  FF_createtime 	  timestamp null default CURRENT_TIMESTAMP()                comment 'FF_����ʱ��',
  FF_updatetime       timestamp null default CURRENT_TIMESTAMP()                comment 'FF_����ʱ��',
  FF_remark           varchar(500)    default null               comment 'FF_��ע',
  primary key (id)
) engine=innodb auto_increment=1 default charset=utf8 comment = '�������ͱ�';

-- ----------------------------
--vps�ͷ������͹�����  1-N
-- ----------------------------
drop table if exists sys_role_dept;
create table sys_role_dept (
  vps_id   int(11) not null comment 'VPS_ID',
  service_id   int(11) not null comment 'service_ID',
  primary key(vps_id, service_id)
) engine=innodb  default charset=utf8 comment = 'vps�ͷ��������';

DROP TABLE IF EXISTS `user`;

-- ----------------------------
--�û���Ϣ�� 
-- ----------------------------
 SET character_set_client = utf8mb4 ;
 drop table if exists user;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '�û�id',
  `username` varchar(50) DEFAULT NULL COMMENT '�û���',
  `password` varchar(50) DEFAULT NULL COMMENT '����',
  `salt` varchar(50) DEFAULT NULL COMMENT '���ֶ�',
  `email` varchar(100) DEFAULT NULL COMMENT '����',
  `type` int(11) DEFAULT NULL COMMENT '0-��ͨ�û�; 1-����Ա;',
  `status` int(11) DEFAULT NULL COMMENT '0-δ����; 1-�Ѽ���;',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '����ʱ��',
  PRIMARY KEY (`id`),
  KEY `index_username` (`username`(20)),
  KEY `index_email` (`email`(20))
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COMMENT = '�û���Ϣ��';



CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '0-��ͨ�û�; 1-��������Ա;',
  `status` int(11) DEFAULT NULL COMMENT '0-δ����; 1-�Ѽ���;',
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
  `status` int(11) DEFAULT '0' COMMENT '0-��Ч; 1-��Ч;',
  `expired` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `index_ticket` (`ticket`(20))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;