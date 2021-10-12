package com.owen.commonlibrary.db

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.owen.commonlibrary.db.bean.AccountBean
import com.owen.commonlibrary.db.dao.AccountBeanDao

/**
 * FileName: AccountDbHelp
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 用户信息数据库
 * Author：QingOY
 * Date: 2021/10/12 15:08
 * History:
 * <author> <time> <version> <desc>
 *
 */
@Database(entities = [ AccountBean::class ],version = 1,exportSchema = true)
 abstract class AccountDbHelp :RoomDatabase() {

     companion object{
         private  var instance:AccountDbHelp? = null

         fun getInstance(context: Context):AccountDbHelp{
             if (instance==null){
                 return create(context)
             }
             return instance!!
         }


         private fun  create(context: Context):AccountDbHelp{
            var dbName = "walnut_account_"+"id"+".db"
            return Room.databaseBuilder(context,AccountDbHelp::class.java,dbName).build()
         }

     }

    fun onReset(){
        instance = null
    }

     abstract fun getAccountBeanDao():AccountBeanDao


}