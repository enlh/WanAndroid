package com.cxz.wanandroid.rx.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by chenxz on 2018/4/21.
 */
class TrampolineMainScheduler<T> private constructor() :
    BaseScheduler<T>(Schedulers.trampoline(), AndroidSchedulers.mainThread())
