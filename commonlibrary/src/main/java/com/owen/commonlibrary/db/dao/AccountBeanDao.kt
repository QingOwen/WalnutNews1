package com.owen.commonlibrary.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.owen.commonlibrary.db.bean.AccountBean

/**
 * FileName: AccountBeanDao
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 增删改查接口类
 * Author：QingOY
 * Date: 2021/10/12 15:29
 * History:
 * <author> <time> <version> <desc>
 *
 */
@Dao
interface AccountBeanDao {

    @Insert
    fun insert(array: AccountBean)

    @Query("select * from AccountBean where uid = :id")
    fun getAccountBean(id:String):AccountBean



}