package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes.dex */
public interface InterfaceC2757f1 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getAppInstanceId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getCurrentScreenClass(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getCurrentScreenName(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getGmpAppId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void getTestFlag(InterfaceC2805i1 interfaceC2805i1, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC5867b interfaceC5867b, zzcl zzclVar, long j) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC2805i1 interfaceC2805i1) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException;

    void logHealthData(int i, String str, InterfaceC5867b interfaceC5867b, InterfaceC5867b interfaceC5867b2, InterfaceC5867b interfaceC5867b3) throws RemoteException;

    void onActivityCreated(InterfaceC5867b interfaceC5867b, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException;

    void onActivityPaused(InterfaceC5867b interfaceC5867b, long j) throws RemoteException;

    void onActivityResumed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC5867b interfaceC5867b, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException;

    void onActivityStarted(InterfaceC5867b interfaceC5867b, long j) throws RemoteException;

    void onActivityStopped(InterfaceC5867b interfaceC5867b, long j) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC2853l1 interfaceC2853l1) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(InterfaceC5867b interfaceC5867b, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC2853l1 interfaceC2853l1) throws RemoteException;

    void setInstanceIdProvider(InterfaceC2885n1 interfaceC2885n1) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC5867b interfaceC5867b, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC2853l1 interfaceC2853l1) throws RemoteException;
}
