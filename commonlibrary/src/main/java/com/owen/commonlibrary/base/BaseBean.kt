package com.owen.commonlibrary.base

import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * FileName: BaseBean
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 基类
 * Author：QingOY
 * Date: 2021/10/12 15:12
 * History:
 * <author> <time> <version> <desc>
 *
 */
open abstract class BaseBean :Serializable  {

    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}