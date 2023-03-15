package android.support.p016v4.p017os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p016v4.p017os.InterfaceC0276a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0273a();

    /* renamed from: w */
    final Handler f603w = null;

    /* renamed from: x */
    InterfaceC0276a f604x;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    class C0273a implements Parcelable.Creator<ResultReceiver> {
        C0273a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    class BinderC0274b extends InterfaceC0276a.AbstractBinderC0277a {
        BinderC0274b() {
        }

        @Override // android.support.p016v4.p017os.InterfaceC0276a
        /* renamed from: O1 */
        public void mo41376O1(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f603w;
            if (handler != null) {
                handler.post(new RunnableC0275c(i, bundle));
            } else {
                resultReceiver.mo41379a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    class RunnableC0275c implements Runnable {

        /* renamed from: w */
        final int f606w;

        /* renamed from: x */
        final Bundle f607x;

        RunnableC0275c(int i, Bundle bundle) {
            this.f606w = i;
            this.f607x = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo41379a(this.f606w, this.f607x);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f604x = InterfaceC0276a.AbstractBinderC0277a.m41375s(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo41379a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f604x == null) {
                this.f604x = new BinderC0274b();
            }
            parcel.writeStrongBinder(this.f604x.asBinder());
        }
    }
}
