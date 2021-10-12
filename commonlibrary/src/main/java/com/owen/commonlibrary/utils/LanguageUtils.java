package com.owen.commonlibrary.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;

import androidx.annotation.RequiresApi;

import java.util.Locale;

/**
 * FileName: LanguageUtils
 * Copyright (C), 2019-2021, Shenzhen Hongbao Technology Co., Ltd. All Rights Reserved.
 * Description: 语言资源文件切换
 * Author：QingOY
 * Date: 2021/10/12 10:38
 * History:
 * <author> <time> <version> <desc>
 */
public class LanguageUtils {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void attachBaseContext(Context newBase) {
        //获取我们存储的语言环境 比如 "en","zh",等等
        String language = "";
//        if (LanguageType.system.name().equals(language)) {
            //跟随系统
//            Locale locale = Locale.getDefault();
//            language = locale.getLanguage();
//        }
        //attach 对应语言环境下的context
        attachBaseContext(attachBaseContext(newBase, language));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static Context attachBaseContext(Context context, String language) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return updateResources(context, language);
        } else {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = Locale.forLanguageTag(language);
            DisplayMetrics dm = resources.getDisplayMetrics();
            resources.updateConfiguration(configuration, dm);
            return context;
        }
    }

    @TargetApi(Build.VERSION_CODES.N)
    private static Context updateResources(Context context, String language) {
        Resources resources = context.getResources();
        Locale locale = new Locale(language);
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        configuration.setLocales(new LocaleList(locale));
        return context.createConfigurationContext(configuration);
    }



}
