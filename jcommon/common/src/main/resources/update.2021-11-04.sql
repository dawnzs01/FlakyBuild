alter table task_execute_history add trigger_type int(10) default 0 COMMENT '执行类型 0自动触发、1手动执行';