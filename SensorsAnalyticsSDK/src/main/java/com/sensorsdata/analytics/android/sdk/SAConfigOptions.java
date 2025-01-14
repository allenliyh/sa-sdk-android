/*
 * Created by dengshiwei on 2019/03/11.
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

public final class SAConfigOptions extends AbstractSAConfigOptions {
    /**
     * 是否设置点击图开关
     */
    boolean mInvokeHeatMapEnabled;

    /**
     * 是否设置点击图对话框
     */
    boolean mInvokeHeatMapConfirmDialog;

    /**
     * 是否设置点击图证书检查
     */
    boolean mInvokeHeatMapSSLCheck;

    /**
     * 是否设置可视化全埋点开关
     */
    boolean mInvokeVisualizedEnabled;

    /**
     * 是否设置可视化全埋点对话框
     */
    boolean mInvokeVisualizedConfirmDialog;

    /**
     * 是否设置点击图证书检查
     */
    boolean mInvokeVisualizedSSLCheck;

    /**
     * 是否设置打印日志
     */
    boolean mInvokeLog;

    /**
     * 私有构造函数
     */
    private SAConfigOptions() {
    }

    /**
     * 获取 SAOptionsConfig 实例
     *
     * @param serverUrl，数据上报服务器地址
     */
    public SAConfigOptions(String serverUrl) {
        this.mServerUrl = serverUrl;
    }

    /**
     * 设置远程配置请求地址
     *
     * @param remoteConfigUrl，远程配置请求地址
     * @return SAOptionsConfig
     */
    public SAConfigOptions setRemoteConfigUrl(String remoteConfigUrl) {
        this.mRemoteConfigUrl = remoteConfigUrl;
        return this;
    }

    /**
     * 设置数据上报地址
     *
     * @param serverUrl，数据上报地址
     * @return SAOptionsConfig
     */
    public SAConfigOptions setServerUrl(String serverUrl) {
        this.mServerUrl = serverUrl;
        return this;
    }

    /**
     * 设置 AutoTrackEvent 的类型，可通过 '|' 进行连接
     *
     * @param autoTrackEventType 开启的 AutoTrack 类型
     * @return SAOptionsConfig
     */
    public SAConfigOptions setAutoTrackEventType(int autoTrackEventType) {
        this.mAutoTrackEventType = autoTrackEventType;
        return this;
    }

    /**
     * 设置是否开启 AppCrash 采集，默认是关闭的
     *
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableTrackAppCrash() {
        this.mEnableTrackAppCrash = true;
        return this;
    }

    /**
     * 设置两次数据发送的最小时间间隔，最小值 5 秒
     *
     * @param flushInterval 时间间隔，单位毫秒
     * @return SAOptionsConfig
     */
    public SAConfigOptions setFlushInterval(int flushInterval) {
        this.mFlushInterval = Math.max(5 * 1000, flushInterval);
        return this;
    }

    /**
     * 设置本地缓存日志的最大条目数
     *
     * @param flushBulkSize 缓存数目
     * @return SAOptionsConfig
     */
    public SAConfigOptions setFlushBulkSize(int flushBulkSize) {
        this.mFlushBulkSize = Math.max(50, flushBulkSize);
        return this;
    }

    /**
     * 设置本地缓存上限值，单位 byte，默认为 32MB：32 * 1024 * 1024，最小值 16MB
     *
     * @param maxCacheSize 单位 byte
     * @return SAOptionsConfig
     */
    public SAConfigOptions setMaxCacheSize(long maxCacheSize) {
        this.mMaxCacheSize = Math.max(16 * 1024 * 1024, maxCacheSize);
        return this;
    }

    /**
     * 设置远程配置请求最小间隔时长
     *
     * @param minRequestInterval 最小时长间隔，单位：小时，默认 24
     * @return SAOptionsConfig
     */
    public SAConfigOptions setMinRequestInterval(int minRequestInterval) {
        this.mMinRequestInterval = minRequestInterval;
        return this;
    }

    /**
     * 设置远程配置请求最大间隔时长
     *
     * @param maxRequestInterval 最大时长间隔，单位：小时，默认 48
     * @return SAOptionsConfig
     */
    public SAConfigOptions setMaxRequestInterval(int maxRequestInterval) {
        this.mMaxRequestInterval = maxRequestInterval;
        return this;
    }

    /**
     * 禁用分散请求远程配置
     *
     * @return SAOptionsConfig
     */
    public SAConfigOptions disableRandomTimeRequestRemoteConfig() {
        this.mDisableRandomTimeRequestRemoteConfig = true;
        return this;
    }

    /**
     * 设置点击图是否可用
     *
     * @param enableHeatMap 点击图是否可用
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableHeatMap(boolean enableHeatMap) {
        this.mHeatMapEnabled = enableHeatMap;
        this.mInvokeHeatMapEnabled = true;
        return this;
    }

    /**
     * 设置点击图提示对话框是否可用
     *
     * @param enableDialog 对话框状态是否可用
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableHeatMapConfirmDialog(boolean enableDialog) {
        this.mHeatMapConfirmDialogEnabled = enableDialog;
        this.mInvokeHeatMapConfirmDialog = true;
        return this;
    }

    /**
     * 设置点击图是否检查证书
     *
     * @param enableHeatMapSSLCheck 点击图是否检查证书
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableHeatMapSSLCheck(boolean enableHeatMapSSLCheck) {
        this.mHeatMapSSLChecked = enableHeatMapSSLCheck;
        this.mInvokeHeatMapSSLCheck = true;
        return this;
    }

    /**
     * 设置可视化全埋点是否可用
     *
     * @param enableVisualizedAutoTrack 可视化全埋点是否可用
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableVisualizedAutoTrack(boolean enableVisualizedAutoTrack) {
        this.mVisualizedEnabled = enableVisualizedAutoTrack;
        this.mInvokeVisualizedEnabled = true;
        return this;
    }

    /**
     * 设置可视化全埋点提示对话框是否可用
     *
     * @param enableDialog 对话框状态是否可用
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableVisualizedAutoTrackConfirmDialog(boolean enableDialog) {
        this.mVisualizedConfirmDialogEnabled = enableDialog;
        this.mInvokeVisualizedConfirmDialog = true;
        return this;
    }

    /**
     * 设置可视化全埋点是否检查证书
     *
     * @param enableVisualizedSSLCheck 可视化全埋点是否检查证书
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableVisualizedAutoTrackSSLCheck(boolean enableVisualizedSSLCheck) {
        this.mVisualizedSSLChecked = enableVisualizedSSLCheck;
        this.mInvokeVisualizedSSLCheck = true;
        return this;
    }

    /**
     * 是否打印日志
     *
     * @param enableLog 是否开启打印日志
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableLog(boolean enableLog) {
        this.mLogEnabled = enableLog;
        this.mInvokeLog = true;
        return this;
    }

    /**
     * 是否开启 RN 数据采集
     *
     * @param enableRN 是否开启 RN 采集
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableReactNativeAutoTrack(boolean enableRN) {
        this.mRNAutoTrackEnabled = enableRN;
        return this;
    }

    /**
     * 是否开启屏幕方向采集
     *
     * @param enableScreenOrientation 是否开启屏幕方向采集
     * @return SAOptionsConfig
     */
    public SAConfigOptions enableTrackScreenOrientation(boolean enableScreenOrientation) {
        this.mTrackScreenOrientationEnabled = enableScreenOrientation;
        return this;
    }

    /**
     * 设置数据的网络上传策略
     *
     * @param networkTypePolicy 数据的网络上传策略
     * @return SAOptionsConfig
     */
    public SAConfigOptions setNetworkTypePolicy(int networkTypePolicy) {
        this.mNetworkTypePolicy = networkTypePolicy;
        return this;
    }

    /**
     * 设置匿名 ID
     *
     * @param anonymousId 匿名 ID
     * @return SAOptionsConfig
     */
    public SAConfigOptions setAnonymousId(String anonymousId) {
        this.mAnonymousId = anonymousId;
        return this;
    }

    /**
     * 是否开启多进程
     * @param enableMultiProcess 是否开启多进程
     * @return SAConfigOptions
     */
    public SAConfigOptions enableMultiProcess(boolean enableMultiProcess) {
        this.enableMultiProcess = enableMultiProcess;
        return this;
    }
}