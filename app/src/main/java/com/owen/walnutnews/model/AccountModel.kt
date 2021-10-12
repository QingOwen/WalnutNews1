package com.owen.walnutnews.model

import android.content.Context
import com.owen.commonlibrary.db.AccountDbHelp
import com.owen.commonlibrary.db.bean.AccountBean

/**
 * FileName: AccountModel
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 数据类
 * Author：QingOY
 * Date: 2021/10/12 15:54
 * History:
 * <author> <time> <version> <desc>
 *
 */
class AccountModel(context: Context) {

    var model:AccountDbHelp = AccountDbHelp.getInstance(context)

    fun  getAccount(string:String):AccountBean{
      return  model.getAccountBeanDao().getAccountBean(string)
    }


    fun  setAccount(string:AccountBean){
        return  model.getAccountBeanDao().insert(string)
    }



}