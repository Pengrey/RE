package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p133h7.InterfaceC5867b;
import p463y7.C13128a;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C3122a();

    /* renamed from: A */
    private float f8262A;

    /* renamed from: B */
    private float f8263B;

    /* renamed from: C */
    private boolean f8264C;

    /* renamed from: D */
    private boolean f8265D;

    /* renamed from: E */
    private boolean f8266E;

    /* renamed from: F */
    private float f8267F;

    /* renamed from: G */
    private float f8268G;

    /* renamed from: H */
    private float f8269H;

    /* renamed from: I */
    private float f8270I;

    /* renamed from: J */
    private float f8271J;

    /* renamed from: w */
    private LatLng f8272w;

    /* renamed from: x */
    private String f8273x;

    /* renamed from: y */
    private String f8274y;

    /* renamed from: z */
    private C13128a f8275z;

    public MarkerOptions() {
        this.f8262A = 0.5f;
        this.f8263B = 1.0f;
        this.f8265D = true;
        this.f8266E = false;
        this.f8267F = 0.0f;
        this.f8268G = 0.5f;
        this.f8269H = 0.0f;
        this.f8270I = 1.0f;
    }

    /* renamed from: D */
    public float m31550D() {
        return this.f8269H;
    }

    /* renamed from: E */
    public LatLng m31549E() {
        return this.f8272w;
    }

    /* renamed from: F */
    public float m31548F() {
        return this.f8267F;
    }

    /* renamed from: G */
    public String m31547G() {
        return this.f8274y;
    }

    /* renamed from: H */
    public String m31546H() {
        return this.f8273x;
    }

    /* renamed from: I */
    public float m31545I() {
        return this.f8271J;
    }

    /* renamed from: J */
    public MarkerOptions m31544J(C13128a c13128a) {
        this.f8275z = c13128a;
        return this;
    }

    /* renamed from: K */
    public boolean m31543K() {
        return this.f8264C;
    }

    /* renamed from: L */
    public boolean m31542L() {
        return this.f8266E;
    }

    /* renamed from: M */
    public boolean m31541M() {
        return this.f8265D;
    }

    /* renamed from: N */
    public MarkerOptions m31540N(LatLng latLng) {
        if (latLng != null) {
            this.f8272w = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: O */
    public MarkerOptions m31539O(String str) {
        this.f8274y = str;
        return this;
    }

    /* renamed from: P */
    public MarkerOptions m31538P(String str) {
        this.f8273x = str;
        return this;
    }

    /* renamed from: h */
    public float m31537h() {
        return this.f8270I;
    }

    /* renamed from: t */
    public float m31536t() {
        return this.f8262A;
    }

    /* renamed from: v */
    public float m31535v() {
        return this.f8263B;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 2, m31549E(), i, false);
        C0066a.m42003r(parcel, 3, m31546H(), false);
        C0066a.m42003r(parcel, 4, m31547G(), false);
        C13128a c13128a = this.f8275z;
        C0066a.m42010k(parcel, 5, c13128a == null ? null : c13128a.m1565a().asBinder(), false);
        C0066a.m42012i(parcel, 6, m31536t());
        C0066a.m42012i(parcel, 7, m31535v());
        C0066a.m42018c(parcel, 8, m31543K());
        C0066a.m42018c(parcel, 9, m31541M());
        C0066a.m42018c(parcel, 10, m31542L());
        C0066a.m42012i(parcel, 11, m31548F());
        C0066a.m42012i(parcel, 12, m31534y());
        C0066a.m42012i(parcel, 13, m31550D());
        C0066a.m42012i(parcel, 14, m31537h());
        C0066a.m42012i(parcel, 15, m31545I());
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public float m31534y() {
        return this.f8268G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f8262A = 0.5f;
        this.f8263B = 1.0f;
        this.f8265D = true;
        this.f8266E = false;
        this.f8267F = 0.0f;
        this.f8268G = 0.5f;
        this.f8269H = 0.0f;
        this.f8270I = 1.0f;
        this.f8272w = latLng;
        this.f8273x = str;
        this.f8274y = str2;
        if (iBinder == null) {
            this.f8275z = null;
        } else {
            this.f8275z = new C13128a(InterfaceC5867b.AbstractBinderC5868a.m22841y(iBinder));
        }
        this.f8262A = f;
        this.f8263B = f2;
        this.f8264C = z;
        this.f8265D = z2;
        this.f8266E = z3;
        this.f8267F = f3;
        this.f8268G = f4;
        this.f8269H = f5;
        this.f8270I = f6;
        this.f8271J = f7;
    }
}
