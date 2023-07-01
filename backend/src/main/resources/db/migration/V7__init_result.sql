CREATE TABLE IF NOT EXISTS `task` (
    `id`                            varchar(50)           NOT NULL COMMENT '任务ID',
    `status`                        varchar(20)           DEFAULT NULL COMMENT '状态',
    `apply_user`                    varchar(50)           DEFAULT NULL COMMENT '申请人',
    `create_time`                   bigint(13)            DEFAULT NULL COMMENT '创建时间',
    `task_name`                     varchar(256)          DEFAULT NULL COMMENT '任务名称',
    `description`                   varchar(255)          DEFAULT NULL COMMENT '描述',
    `cron`                          varchar(128)          DEFAULT NULL COMMENT 'cron表达式',
    `trigger_id`                    varchar(255)          DEFAULT NULL COMMENT '触发ID',
    `prev_fire_time`                bigint(20)            DEFAULT NULL COMMENT '上次执行时间',
    `last_fire_time`                bigint(20)            DEFAULT NULL COMMENT '下次执行时间',
    `type`                          varchar(32)           DEFAULT NULL COMMENT '类型：manual(手动)/quartz(定时)',
    `severity`                      varchar(32)           DEFAULT NULL COMMENT '风险等级',
    `rule_id`                       varchar(50)           DEFAULT NULL COMMENT '规则ID',
    `rule_tags`                     varchar(256)          DEFAULT NULL COMMENT '标签IDs',
    `account_id`                    varchar(50)           DEFAULT NULL COMMENT '云账号ID',
    `plugin_id`                     varchar(40)           DEFAULT NULL COMMENT '插件ID',
    `plugin_name`                   varchar(128)          DEFAULT NULL COMMENT '云平台名称',
    `plugin_icon`                   varchar(128)          DEFAULT NULL COMMENT '云平台图标',
    `resource_types`                varchar(256)          DEFAULT NULL COMMENT '资源类型',
    `resources_sum`                 bigint(13)            DEFAULT NULL COMMENT '资源总量',
    `return_sum`                    bigint(13)            DEFAULT NULL COMMENT '输出扫描结果资源数',
    `cron_desc`                     varchar(512)          DEFAULT NULL COMMENT '定时时间(cron中文翻译)',
    `scan_type`                     varchar(32)           DEFAULT NULL COMMENT '扫描类型',
    PRIMARY KEY (`id`),
    KEY `IDX_STATUS` (`status`),
    KEY `IDX_APPLY_USER` (`apply_user`),
    KEY `IDX_TYPE` (`type`),
    KEY `IDX_CREATE_TIME` (`create_time`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;


CREATE TABLE IF NOT EXISTS `task_item` (
    `id`                           varchar(50)         NOT NULL,
    `task_id`                      varchar(50)         DEFAULT NULL COMMENT '任务ID',
    `rule_id`                      varchar(50)         DEFAULT NULL COMMENT '规则ID',
    `details`                      longtext            DEFAULT NULL COMMENT 'policy内容,不含actions',
    `tags`                         longtext            DEFAULT NULL COMMENT '标签',
    `custom_data`                  longtext            DEFAULT NULL COMMENT 'policy内容,包含actions',
    `status`                       varchar(20)         DEFAULT NULL COMMENT '状态',
    `count`                        int(11)             DEFAULT '1'  COMMENT '数量',
    `region_id`                    varchar(128)        DEFAULT NULL COMMENT '区域标识',
    `region_name`                  varchar(128)        DEFAULT NULL COMMENT '区域名称',
    `severity`                     varchar(32)         DEFAULT NULL COMMENT '风险等级',
    `account_id`                   varchar(50)         DEFAULT NULL COMMENT '云账号ID',
    `account_url`                  varchar(128)        DEFAULT NULL COMMENT '云账号图标',
    `account_label`                varchar(128)        DEFAULT NULL COMMENT '云账号名称',
    `create_time`                  bigint(13)          DEFAULT NULL COMMENT '创建时间',
    `update_time`                  bigint(13)          DEFAULT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY `IDX_task_id` (`task_id`),
    KEY `IDX_rule_id` (`rule_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;


CREATE TABLE IF NOT EXISTS `task_item_log` (
    `id`                           int(11)             NOT NULL AUTO_INCREMENT,
    `task_item_id`                 varchar(50)         DEFAULT NULL COMMENT '任务项ID',
    `resource_id`                  varchar(50)         DEFAULT NULL COMMENT '资源ID',
    `create_time`                  bigint(13)          DEFAULT NULL COMMENT '创建时间',
    `operator`                     varchar(100)        DEFAULT NULL COMMENT '操作人',
    `operation`                    varchar(255)        DEFAULT NULL COMMENT '操作内容',
    `output`                       mediumtext          DEFAULT NULL COMMENT '输出',
    `result`                       tinyint(1)          DEFAULT NULL COMMENT '结果',
    PRIMARY KEY (`id`),
    KEY `IDX_ITEM_ID` (`task_item_id`),
    KEY `IDX_RES_ID` (`resource_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4;


CREATE TABLE IF NOT EXISTS `task_item_resource`
(
    `id`                          int(11)             NOT NULL AUTO_INCREMENT,
    `task_id`                     varchar(50)         DEFAULT NULL COMMENT '任务ID',
    `task_item_id`                varchar(50)         DEFAULT NULL COMMENT '任务项ID',
    `resource_type`               varchar(64)         DEFAULT NULL COMMENT '资源类型',
    `resource_name`               varchar(128)        DEFAULT NULL COMMENT '资源名称',
    `dir_name`                    varchar(128)        DEFAULT NULL COMMENT '文件夹名称',
    `resource_id`                 varchar(50)         DEFAULT NULL COMMENT '资源ID',
    `resource_command`            longtext            DEFAULT NULL COMMENT 'policy(无actions)',
    `resource_command_action`     longtext            DEFAULT NULL COMMENT 'policy(有actions)',
    PRIMARY KEY (`id`),
    KEY `IDX_ITEM_ID` (`task_item_id`),
    KEY `IDX_RES_ID` (`resource_id`),
    KEY `IDX_task_id` (`task_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `resource`
(
    `id`                         varchar(50)         NOT NULL,
    `resource_name`              varchar(256)        DEFAULT NULL COMMENT '资源名称',
    `dir_name`                   varchar(128)        DEFAULT NULL COMMENT '目录名称',
    `resource_status`            varchar(45)         DEFAULT NULL COMMENT '资源状态',
    `resource_type`              varchar(64)         DEFAULT NULL COMMENT '资源类型',
    `custodian_run_log`          longtext            DEFAULT NULL COMMENT 'custodian-run.log',
    `metadata`                   longtext            DEFAULT NULL COMMENT 'metadata.json',
    `resources`                  longtext            DEFAULT NULL COMMENT 'resources.json',
    `resources_sum`              bigint(13)          DEFAULT NULL COMMENT '资源总量',
    `return_sum`                 bigint(13)          DEFAULT NULL COMMENT '输出扫描结果资源数',
    `plugin_id`                  varchar(40)         DEFAULT NULL COMMENT '插件名称',
    `plugin_name`                varchar(40)         DEFAULT NULL COMMENT '云平台名称',
    `plugin_icon`                varchar(128)        DEFAULT NULL COMMENT '云平台图标',
    `account_id`                 varchar(50)         DEFAULT NULL COMMENT '云账号ID',
    `region_id`                  varchar(128)        DEFAULT NULL COMMENT '区域标识',
    `region_name`                varchar(128)        DEFAULT NULL COMMENT '区域名称',
    `severity`                   varchar(32)         DEFAULT NULL COMMENT '风险等级',
    `create_time`                bigint(13)          DEFAULT NULL COMMENT '创建时间',
    `update_time`                bigint(13)          DEFAULT NULL COMMENT '更新时间',
    `resource_command`           longtext            DEFAULT NULL COMMENT 'policy(无actions)',
    `resource_command_action`    longtext            DEFAULT NULL COMMENT 'policy(有actions)',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `resource_rule` (
    `resource_id`                varchar(50) NOT NULL DEFAULT '' COMMENT '资源ID',
    `rule_id`                    varchar(50)          DEFAULT NULL COMMENT '规则ID',
    `apply_user`                 varchar(50)          DEFAULT NULL COMMENT '申请人',
    PRIMARY KEY (`resource_id`),
    KEY `IDX_rule_id` (`rule_id`),
    KEY `IDX_APPLY_USER` (`apply_user`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `resource_item` (
    `id`                         varchar(50)         NOT NULL,
    `resource_id`                varchar(50)         DEFAULT NULL COMMENT 'resource主键ID',
    `f2c_id`                     varchar(256)        DEFAULT NULL COMMENT '资源ID（唯一标识）',
    `resource_type`              varchar(64)         DEFAULT NULL COMMENT '资源类型',
    `plugin_id`                  varchar(40)         DEFAULT NULL COMMENT '插件名称',
    `plugin_name`                varchar(40)         DEFAULT NULL COMMENT '云平台名称',
    `plugin_icon`                varchar(128)        DEFAULT NULL COMMENT '云平台图标',
    `account_id`                 varchar(50)         DEFAULT NULL COMMENT '云账号ID',
    `region_id`                  varchar(128)        DEFAULT NULL COMMENT '区域标识',
    `region_name`                varchar(128)        DEFAULT NULL COMMENT '区域名称',
    `severity`                   varchar(32)         DEFAULT NULL COMMENT '风险等级',
    `create_time`                bigint(13)          DEFAULT NULL COMMENT '创建时间',
    `update_time`                bigint(13)          DEFAULT NULL COMMENT '更新时间',
    `resource`                   longtext            DEFAULT NULL COMMENT '资源JSON',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;
