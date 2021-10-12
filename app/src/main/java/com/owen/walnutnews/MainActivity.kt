package com.owen.walnutnews

import android.accounts.AccountManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.owen.commonlibrary.db.AccountDbHelp
import com.owen.commonlibrary.db.bean.AccountBean
import com.owen.roomapplication.room.KTAccountDataBase
import com.owen.walnutnews.databinding.ActivityMainBinding
import com.owen.walnutnews.model.AccountModel
import com.owen.walnutnews.view.WalnutActivity
import com.owen.walnutnews.vm.MainViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    private lateinit var mLiveData: MutableLiveData<String>


    private val TAG = "Owen Walnut"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.inflate<ActivityMainBinding>(
            layoutInflater,
            R.layout.activity_main,
            null,
            false
        )
        setContentView(activityMainBinding.root)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mLiveData = mainViewModel.getLiveData()

        mLiveData.postValue("hollow")


        mLiveData.observe(this, {
            //数据变化监听
            Log.i(TAG, it + "")
            activityMainBinding.data = (it + "")
        })

        activityMainBinding.textView.setOnClickListener {
            startActivity(Intent(this, WalnutActivity::class.java))
        }
//        var mAm = AccountModel(this)
//        GlobalScope.launch {
//            var sss = AccountBean()
//            sss.uid = "sdfasdfasdf"
//            var s2 = mAm.setAccount(sss)
//            var s = mAm.getAccount("sdfasdfasdf")
//            Log.e(TAG, s.toString())
//        }


//        var db = Room.databaseBuilder(applicationContext, KTAccountDataBase::class.java,"Account.db").build()


    }


}