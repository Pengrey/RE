package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* loaded from: classes.dex */
public final class C2725d1 extends C2900o0 implements InterfaceC2757f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2725d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeLong(j);
        m32406H(23, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32196d(m32405s, bundle);
        m32406H(9, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeLong(j);
        m32406H(24, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void generateEventId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(22, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getCachedAppInstanceId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(19, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(10, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getCurrentScreenClass(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(17, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getCurrentScreenName(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(16, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getGmpAppId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(21, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getMaxUserProperties(String str, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(6, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32197c(m32405s, z);
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32406H(5, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void initialize(InterfaceC5867b interfaceC5867b, zzcl zzclVar, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        C2932q0.m32196d(m32405s, zzclVar);
        m32405s.writeLong(j);
        m32406H(1, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32196d(m32405s, bundle);
        C2932q0.m32197c(m32405s, z);
        C2932q0.m32197c(m32405s, z2);
        m32405s.writeLong(j);
        m32406H(2, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void logHealthData(int i, String str, InterfaceC5867b interfaceC5867b, InterfaceC5867b interfaceC5867b2, InterfaceC5867b interfaceC5867b3) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeInt(5);
        m32405s.writeString(str);
        C2932q0.m32195e(m32405s, interfaceC5867b);
        C2932q0.m32195e(m32405s, interfaceC5867b2);
        C2932q0.m32195e(m32405s, interfaceC5867b3);
        m32406H(33, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityCreated(InterfaceC5867b interfaceC5867b, Bundle bundle, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        C2932q0.m32196d(m32405s, bundle);
        m32405s.writeLong(j);
        m32406H(27, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityDestroyed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeLong(j);
        m32406H(28, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityPaused(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeLong(j);
        m32406H(29, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityResumed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeLong(j);
        m32406H(30, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivitySaveInstanceState(InterfaceC5867b interfaceC5867b, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        C2932q0.m32195e(m32405s, interfaceC2805i1);
        m32405s.writeLong(j);
        m32406H(31, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityStarted(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeLong(j);
        m32406H(25, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void onActivityStopped(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeLong(j);
        m32406H(26, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void registerOnMeasurementEventListener(InterfaceC2853l1 interfaceC2853l1) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC2853l1);
        m32406H(35, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, bundle);
        m32405s.writeLong(j);
        m32406H(8, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void setCurrentScreen(InterfaceC5867b interfaceC5867b, String str, String str2, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32195e(m32405s, interfaceC5867b);
        m32405s.writeString(str);
        m32405s.writeString(str2);
        m32405s.writeLong(j);
        m32406H(15, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32197c(m32405s, z);
        m32406H(39, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public final void setUserProperty(String str, String str2, InterfaceC5867b interfaceC5867b, boolean z, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32195e(m32405s, interfaceC5867b);
        C2932q0.m32197c(m32405s, z);
        m32405s.writeLong(j);
        m32406H(4, m32405s);
    }
}
