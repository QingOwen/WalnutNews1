package com.owen.roomapplication.room

import androidx.room.*

/**
 * FileName: KTAccountDao
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 11Dao
 * Author：QingOY
 * Date: 2021/4/9 10:05
 * History:
 * <author> <time> <version> <desc>
 *
 */
@Dao
interface KTAccountDao {

    @Query("SELECT * FROM KTAccoutBean")
    fun getAllAccountBean():List<KTAccoutBean>

    @Delete
    fun deleteAccount(bean: KTAccoutBean)

    @Insert
    fun instert(vararg bean: KTAccoutBean)

    @Update
    fun updataBean(bean: KTAccoutBean)


}