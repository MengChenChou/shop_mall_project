-- A-創表
CREATE SCHEMA `shop_mall_db`;
CREATE TABLE `shop_mall_db.tb_mall_admin_user` (
  `admin_user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '管理員id',
  `login_user_name` varchar(50) NOT NULL COMMENT '管理員登入名稱',
  `login_password` varchar(50) NOT NULL COMMENT '管理員登入密碼',
  `nick_name` varchar(50) NOT NULL COMMENT '管理員顯示暱稱',
  `locked` tinyint DEFAULT '0' COMMENT '是否鎖定 0未鎖定 1已鎖定無法登入',
  PRIMARY KEY (`admin_user_id`)
);
INSERT INTO `shop_mall_db.tb_mall_admin_user` (`admin_user_id`, `login_user_name`, `login_password`, `nick_name`, `locked`)
VALUES
	(1,'admin','e10adc3949ba59abbe56e057f20f883e','十三',0),
	(2,'newbee-admin1','e10adc3949ba59abbe56e057f20f883e','新蜂01',0),
	(3,'newbee-admin2','e10adc3949ba59abbe56e057f20f883e','新蜂02',0);


CREATE TABLE `shop_mall_db.tb_mall_carousel` (
  `carousel_id` int NOT NULL AUTO_INCREMENT COMMENT '首頁輪播圖主鍵id',
  `carousel_url` varchar(100) NOT NULL DEFAULT '' COMMENT '輪播圖',
  `redirect_url` varchar(100) NOT NULL DEFAULT '''##''' COMMENT '典籍後跳轉的地址(默認不跳轉)',
  `carousel_rank` int NOT NULL DEFAULT '0' COMMENT '排序值(字段越大越靠前)',
  `is_deleted` tinyint NOT NULL DEFAULT '0' COMMENT '刪除標示字段(0-未刪除 1-已刪除)',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
  `create_user` int NOT NULL DEFAULT '0' COMMENT '創建者id',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改時間',
  `update_user` int NOT NULL DEFAULT '0' COMMENT '修改者id',
  PRIMARY KEY (`carousel_id`)
);

INSERT INTO `shop_mall_db.tb_mall_carousel` (`carousel_id`, `carousel_url`, `redirect_url`, `carousel_rank`, `is_deleted`, `create_time`, `create_user`, `update_time`, `update_user`)
VALUES
	(1,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner2.jpg','##',200,1,'2019-08-23 17:50:45',0,'2019-11-10 00:23:01',0),
	(2,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner1.png','##',13,0,'2019-11-29 00:00:00',0,'2019-11-29 00:00:00',0),
	(3,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner3.jpg','##',0,1,'2019-09-18 18:26:38',0,'2019-11-10 00:23:01',0),
	(5,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner2.png','##',0,0,'2019-11-29 00:00:00',0,'2019-11-29 00:00:00',0),
	(6,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner1.png','##',101,1,'2019-09-19 23:37:40',0,'2019-11-07 00:15:52',0),
	(7,'https://newbee-mall.oss-cn-beijing.aliyuncs.com/images/banner2.png','##',99,1,'2019-09-19 23:37:58',0,'2019-10-22 00:15:01',0);