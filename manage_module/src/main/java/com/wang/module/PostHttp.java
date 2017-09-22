package com.wang.module;

import com.heepay.common.util.HttpClientUtils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-09-2217:09
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public class PostHttp {
    private static Lock lock = new ReentrantLock();// 锁对象

    public static void main(String[] args) {

        for (int j = 0; j < 700; j++) {
            Thread th = new Thread() {
                @Override
                public void run() {
                    lock.lock();
                    HttpClientUtils.requestByPostMethod("");
                    lock.unlock();

                }
            };
            th.start();

        }
    }
}
