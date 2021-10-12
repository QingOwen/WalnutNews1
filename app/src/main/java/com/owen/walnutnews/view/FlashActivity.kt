package com.owen.walnutnews.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.owen.walnutnews.MainActivity
import com.owen.walnutnews.R
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import java.util.concurrent.TimeUnit

class FlashActivity : AppCompatActivity() {
    private lateinit var   mDisposable:Disposable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash)


        Observable.timer(1, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Long> {
                override fun onSubscribe(d: Disposable) {
                    mDisposable = d
                }

                override fun onNext(t: Long) {
                }

                override fun onError(e: Throwable) {
                }

                override fun onComplete() {
                    startActivity(Intent(this@FlashActivity, MainActivity::class.java))
                    finish()
                    closeTime()
                }
            })
    }


    fun closeTime(){
        if (mDisposable!=null){
            mDisposable.dispose()
        }
    }


}