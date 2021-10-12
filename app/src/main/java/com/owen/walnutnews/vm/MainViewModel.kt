package com.owen.walnutnews.vm

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.owen.commonlibrary.db.bean.AccountBean
import com.owen.walnutnews.model.AccountModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * FileName: MainViewMod
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description:
 * Author：QingOY
 * Date: 2021/10/12 11:10
 * History:
 * <author> <time> <version> <desc>
 *
 */
class MainViewModel(context: Context) : ViewModel() {
    private var lift = MutableLiveData("")
    private var accountModel = AccountModel(context)

    fun getLiveData():MutableLiveData<String>{
        return lift
    }



    fun updateLiveData(accountBean: AccountBean){
        accountModel.setAccount(accountBean)
    }






}