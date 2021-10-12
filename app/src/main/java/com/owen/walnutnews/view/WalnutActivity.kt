package com.owen.walnutnews.view

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.owen.walnutnews.R
import com.owen.walnutnews.databinding.ActivityWalnutBinding
import com.owen.walnutnews.vm.MainViewModel

class WalnutActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       var binding= DataBindingUtil.inflate<ActivityWalnutBinding>(layoutInflater,R.layout.activity_walnut,null,false)
        setContentView(binding.root)
        var  vm = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.button.setOnClickListener {

            vm.getLiveData().postValue("Second Activity LiveData")

        }


    }
}