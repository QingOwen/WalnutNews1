package com.owen.roomapplication.room

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * FileName: KTAccountDataBase
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 11
 * Author：QingOY
 * Date: 2021/4/9 10:08
 * History:
 * <author> <time> <version> <desc>
 *
 */

@Database(entities = [KTAccoutBean::class],version = 1)
abstract class KTAccountDataBase:RoomDatabase() {
    abstract fun kTAccountDao():KTAccountDao
}