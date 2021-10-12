package com.owen.roomapplication.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * FileName: KTAccoutBean
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: kt测试bean
 * Author：QingOY
 * Date: 2021/4/9 10:01
 * History:
 * <author> <time> <version> <desc>
 *
 */
@Entity
data class KTAccoutBean(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "uuid") val uuid: String?,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "data") val data: Long,
    @ColumnInfo(name = "isUser") val isUser: Boolean
)