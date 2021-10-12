package com.owen.walnutnews.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.tencent.mmkv.MMKV

/**
 * FileName: WNApplication
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 主要入口
 * Author：QingOY
 * Date: 2021/10/12 11:37
 * History:
 * <author> <time> <version> <desc>
 *
 */
class WNApplication :Application() {


    override fun onCreate() {
        super.onCreate()

        MMKV.initialize(this)//初始化MMKV 替代哦SP

        ARouter.init(this)


    }


    override fun onTerminate() {
        super.onTerminate()
        ARouter.getInstance().destroy()
    }



}