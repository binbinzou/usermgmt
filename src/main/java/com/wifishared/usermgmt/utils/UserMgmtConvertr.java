package com.wifishared.usermgmt.utils;

import com.wifishared.common.data.dto.user.LoginReqBody;
import com.wifishared.common.data.otd.user.UserDeviceRsp;
import com.wifishared.common.data.otd.user.UserRspMsg;
import com.wifishared.usermgmt.constant.UserMgmtConstant;
import com.wifishared.usermgmt.domain.User;
import com.wifishared.usermgmt.domain.UserDevice;

public class UserMgmtConvertr {

	public static User loginReqBody2User(LoginReqBody reqbody) {
		User user = new User();
		user.setPhoneNumber(reqbody.getPhoneNumber());
		user.setNickName(reqbody.getPhoneNumber());
		user.setStatus(UserMgmtConstant.USER_STATUS_ENABLED);
		return user;
	}
	

	public static UserDevice loginReqBody2UserDetail(LoginReqBody reqbody,String userId) {
		UserDevice userDevice = new UserDevice();
		userDevice.setUserId(userId);
		userDevice.setDeviceId(reqbody.getDeviceUuid());
		userDevice.setDeviceName(reqbody.getDeviceName());
		userDevice.setDeviceSystem(reqbody.getDeviceSystem());
		userDevice.setSystemVersion(reqbody.getSystemVersion());
		userDevice.setStatus(UserMgmtConstant.USER_STATUS_ENABLED);
		return userDevice;
	}
	
	public static UserRspMsg userAndUserDevice2UserRspMsg(User user,UserDevice userDevice) {
		UserRspMsg userRspMsg = new UserRspMsg();
		userRspMsg.setCertifiaction(String.valueOf(user.getCertification()));
		userRspMsg.setDeviceId(userDevice.getDeviceId());
		userRspMsg.setDeviceName(userDevice.getDeviceName());
		userRspMsg.setHeadImg(user.getHeadImg());
		userRspMsg.setName(user.getName());
		userRspMsg.setNickName(user.getNickName());
		userRspMsg.setPhoneNumber(user.getPhoneNumber());
		return userRspMsg;
	}
	
	public static UserDeviceRsp userDevice2UserDeviceRsp(UserDevice userDevice) {
		UserDeviceRsp deviceRsp = new UserDeviceRsp();
		deviceRsp.setDeviceId(userDevice.getDeviceId());
		deviceRsp.setId(userDevice.getId());
		deviceRsp.setDevideName(userDevice.getDeviceName());
		return deviceRsp;
	}
	
}
