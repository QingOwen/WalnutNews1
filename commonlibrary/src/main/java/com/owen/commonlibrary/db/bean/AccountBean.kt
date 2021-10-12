package com.owen.commonlibrary.db.bean

import androidx.room.Entity
import com.owen.commonlibrary.base.BaseEntity

/**
 * FileName: AccountBean
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 用户信息
 * Author：QingOY
 * Date: 2021/10/12 15:11
 * History:
 * <author> <time> <version> <desc>
 *
 */
@Entity
class AccountBean : BaseEntity() {


    var uid = ""

    var date = ""

    var state =""

    var deviceInfoId = ""


    override fun toString(): String {
        return "AccountBean(uid='$uid', date='$date', state='$state', deviceInfoId='$deviceInfoId')"
    }


}