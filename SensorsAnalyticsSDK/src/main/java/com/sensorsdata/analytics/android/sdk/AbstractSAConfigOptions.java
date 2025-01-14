/*
 * Created by dengshiwei on 2019/04/18.
 * Copyright 2015－2019 Sensors Data Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sensorsdata.analytics.android.sdk;

/**
 * SDK 配置抽象类
 */
abstract class AbstractSAConfigOptions {
    /**
     * 请求配置地址，默认从 ServerUrl 解析
     */
    String mRemoteConfigUrl;

    /**
     * 远程配置请求最小间隔时长，单位：小时，默认 24
     */
    int mMinRequestInterval = 24;

    /**
     * 远程配置请求最大间隔时长，单位：小时，默认 48
     */
    int mMaxRequestInterval = 48;

    /**
     * 禁用随机时间请求远程配置
     */
    boolean mDisableRandomTimeRequestRemoteConfig;

    /**
     * 数据上报服务器地址
     */
    String mServerUrl;

    /**
     * AutoTrack 类型
     */
    int mAutoTrackEventType;

    /**
     * 是否开启 TrackAppCrash
     */
    boolean mEnableTrackAppCrash;

    /**
     * 两次数据发送的最小时间间隔，单位毫秒
     */
    int mFlushInterval;

    /**
     * 本地缓存日志的最大条目数
     */
    int mFlushBulkSize;

    /**
     * 本地缓存上限值，单位 byte，默认为 32MB：32 * 1024 * 1024
     */
    long mMaxCacheSize;

    /**
     * 点击图是否可用
     */
    boolean mHeatMapEnabled;

    /**
     * 点击图对话框是否可用
     */
    boolean mHeatMapConfirmDialogEnabled;

    /**
     * 点击图证书检查
     */
    boolean mHeatMapSSLChecked;

    /**
     * 可视化全埋点是否可用
     */
    boolean mVisualizedEnabled;

    /**
     * 可视化全埋点对话框是否可用
     */
    boolean mVisualizedConfirmDialogEnabled;

    /**
     * 可视化全埋点证书检查
     */
    boolean mVisualizedSSLChecked;

    /**
     * 是否开启打印日志
     */
    boolean mLogEnabled;

    /**
     * 开启 RN 采集
     */
    boolean mRNAutoTrackEnabled;

    /**
     * 采集屏幕方向
     */
    boolean mTrackScreenOrientationEnabled;

    /**
     * 网络上传策略
     */
    int mNetworkTypePolicy = SensorsNetworkType.TYPE_3G | SensorsNetworkType.TYPE_4G | SensorsNetworkType.TYPE_WIFI | SensorsNetworkType.TYPE_5G;

    /**
     * AnonymousId，匿名 ID
     */
    String mAnonymousId;

    /**
     * 是否开启多进程
     */
    boolean enableMultiProcess = true;
}