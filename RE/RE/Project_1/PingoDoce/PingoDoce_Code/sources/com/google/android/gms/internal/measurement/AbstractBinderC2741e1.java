package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2741e1 extends BinderC2916p0 implements InterfaceC2757f1 {
    public AbstractBinderC2741e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC2757f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC2757f1 ? (InterfaceC2757f1) queryLocalInterface : new C2725d1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2916p0
    /* renamed from: s */
    protected final boolean mo30936s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC2805i1 c2773g1;
        InterfaceC2805i1 interfaceC2805i1 = null;
        InterfaceC2805i1 interfaceC2805i12 = null;
        InterfaceC2805i1 interfaceC2805i13 = null;
        InterfaceC2853l1 interfaceC2853l1 = null;
        InterfaceC2853l1 interfaceC2853l12 = null;
        InterfaceC2853l1 interfaceC2853l13 = null;
        InterfaceC2805i1 interfaceC2805i14 = null;
        InterfaceC2805i1 interfaceC2805i15 = null;
        InterfaceC2805i1 interfaceC2805i16 = null;
        InterfaceC2805i1 interfaceC2805i17 = null;
        InterfaceC2805i1 interfaceC2805i18 = null;
        InterfaceC2805i1 interfaceC2805i19 = null;
        InterfaceC2885n1 interfaceC2885n1 = null;
        InterfaceC2805i1 interfaceC2805i110 = null;
        InterfaceC2805i1 interfaceC2805i111 = null;
        InterfaceC2805i1 interfaceC2805i112 = null;
        InterfaceC2805i1 interfaceC2805i113 = null;
        switch (i) {
            case 1:
                initialize(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), (zzcl) C2932q0.m32199a(parcel, zzcl.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), C2932q0.m32194f(parcel), C2932q0.m32194f(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2773g1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2773g1 = queryLocalInterface instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface : new C2773g1(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, c2773g1, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), C2932q0.m32194f(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m32194f = C2932q0.m32194f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i1 = queryLocalInterface2 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface2 : new C2773g1(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, m32194f, interfaceC2805i1);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i113 = queryLocalInterface3 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface3 : new C2773g1(readStrongBinder3);
                }
                getMaxUserProperties(readString5, interfaceC2805i113);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i112 = queryLocalInterface4 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface4 : new C2773g1(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, interfaceC2805i112);
                break;
            case 11:
                setMeasurementEnabled(C2932q0.m32194f(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i111 = queryLocalInterface5 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface5 : new C2773g1(readStrongBinder5);
                }
                getCurrentScreenName(interfaceC2805i111);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i110 = queryLocalInterface6 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface6 : new C2773g1(readStrongBinder6);
                }
                getCurrentScreenClass(interfaceC2805i110);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    interfaceC2885n1 = queryLocalInterface7 instanceof InterfaceC2885n1 ? (InterfaceC2885n1) queryLocalInterface7 : new C2869m1(readStrongBinder7);
                }
                setInstanceIdProvider(interfaceC2885n1);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i19 = queryLocalInterface8 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface8 : new C2773g1(readStrongBinder8);
                }
                getCachedAppInstanceId(interfaceC2805i19);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i18 = queryLocalInterface9 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface9 : new C2773g1(readStrongBinder9);
                }
                getAppInstanceId(interfaceC2805i18);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i17 = queryLocalInterface10 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface10 : new C2773g1(readStrongBinder10);
                }
                getGmpAppId(interfaceC2805i17);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i16 = queryLocalInterface11 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface11 : new C2773g1(readStrongBinder11);
                }
                generateEventId(interfaceC2805i16);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i15 = queryLocalInterface12 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface12 : new C2773g1(readStrongBinder12);
                }
                onActivitySaveInstanceState(m22841y, interfaceC2805i15, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i14 = queryLocalInterface13 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface13 : new C2773g1(readStrongBinder13);
                }
                performAction(bundle2, interfaceC2805i14, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()), InterfaceC5867b.AbstractBinderC5868a.m22841y(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2853l13 = queryLocalInterface14 instanceof InterfaceC2853l1 ? (InterfaceC2853l1) queryLocalInterface14 : new C2821j1(readStrongBinder14);
                }
                setEventInterceptor(interfaceC2853l13);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2853l12 = queryLocalInterface15 instanceof InterfaceC2853l1 ? (InterfaceC2853l1) queryLocalInterface15 : new C2821j1(readStrongBinder15);
                }
                registerOnMeasurementEventListener(interfaceC2853l12);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2853l1 = queryLocalInterface16 instanceof InterfaceC2853l1 ? (InterfaceC2853l1) queryLocalInterface16 : new C2821j1(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(interfaceC2853l1);
                break;
            case 37:
                initForTests(C2932q0.m32198b(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i13 = queryLocalInterface17 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface17 : new C2773g1(readStrongBinder17);
                }
                getTestFlag(interfaceC2805i13, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(C2932q0.m32194f(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2805i12 = queryLocalInterface18 instanceof InterfaceC2805i1 ? (InterfaceC2805i1) queryLocalInterface18 : new C2773g1(readStrongBinder18);
                }
                isDataCollectionEnabled(interfaceC2805i12);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
