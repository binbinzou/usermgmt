package com.wifishared.usermgmt.service;

import com.wifishared.common.data.dto.user.LoginReqBody;
import com.wifishared.common.data.otd.user.UserRspMsg;
import com.wifishared.common.framework.resultobj.GeneralContentResult;

public interface UserService {

	GeneralContentResult<String> login(LoginReqBody reqbody);

	GeneralContentResult<UserRspMsg> queryUsersMsg(String authorization);

}
