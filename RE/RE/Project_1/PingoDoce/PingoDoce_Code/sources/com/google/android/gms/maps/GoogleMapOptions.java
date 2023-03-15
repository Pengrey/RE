package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p008a7.C0066a;
import p418w7.C11592f;
import p440x7.C12301f;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C3116c();

    /* renamed from: A */
    private Boolean f8213A;

    /* renamed from: B */
    private Boolean f8214B;

    /* renamed from: C */
    private Boolean f8215C;

    /* renamed from: D */
    private Boolean f8216D;

    /* renamed from: E */
    private Boolean f8217E;

    /* renamed from: F */
    private Boolean f8218F;

    /* renamed from: G */
    private Boolean f8219G;

    /* renamed from: H */
    private Boolean f8220H;

    /* renamed from: I */
    private Boolean f8221I;

    /* renamed from: J */
    private Float f8222J;

    /* renamed from: K */
    private Float f8223K;

    /* renamed from: L */
    private LatLngBounds f8224L;

    /* renamed from: M */
    private Boolean f8225M;

    /* renamed from: N */
    private Integer f8226N;

    /* renamed from: O */
    private String f8227O;

    /* renamed from: w */
    private Boolean f8228w;

    /* renamed from: x */
    private Boolean f8229x;

    /* renamed from: y */
    private int f8230y;

    /* renamed from: z */
    private CameraPosition f8231z;

    public GoogleMapOptions() {
        this.f8230y = -1;
        this.f8222J = null;
        this.f8223K = null;
        this.f8224L = null;
        this.f8226N = null;
        this.f8227O = null;
    }

    /* renamed from: D */
    public static GoogleMapOptions m31604D(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C11592f.f29636a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C11592f.f29650o;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.m31592P(obtainAttributes.getInt(i, -1));
        }
        int i2 = C11592f.f29660y;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.m31584X(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C11592f.f29659x;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.m31585W(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C11592f.f29651p;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.m31575y(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C11592f.f29653r;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.m31589S(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C11592f.f29655t;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.m31587U(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C11592f.f29654s;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.m31588T(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C11592f.f29656u;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.m31586V(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C11592f.f29658w;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.m31582Z(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = C11592f.f29657v;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.m31583Y(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = C11592f.f29649n;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.m31595M(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = C11592f.f29652q;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.m31593O(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = C11592f.f29637b;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.m31578h(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = C11592f.f29640e;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.m31590R(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.m31591Q(obtainAttributes.getFloat(C11592f.f29639d, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{m31579c0(context, "backgroundColor"), m31579c0(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.m31577t(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.m31594N(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.m31596L(m31580b0(context, attributeSet));
        googleMapOptions.m31576v(m31581a0(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: a0 */
    public static CameraPosition m31581a0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C11592f.f29636a);
        int i = C11592f.f29641f;
        float f = obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i2 = C11592f.f29642g;
        LatLng latLng = new LatLng(f, obtainAttributes.hasValue(i2) ? obtainAttributes.getFloat(i2, 0.0f) : 0.0f);
        CameraPosition.C3120a m31562h = CameraPosition.m31562h();
        m31562h.m31559c(latLng);
        int i3 = C11592f.f29644i;
        if (obtainAttributes.hasValue(i3)) {
            m31562h.m31557e(obtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = C11592f.f29638c;
        if (obtainAttributes.hasValue(i4)) {
            m31562h.m31561a(obtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = C11592f.f29643h;
        if (obtainAttributes.hasValue(i5)) {
            m31562h.m31558d(obtainAttributes.getFloat(i5, 0.0f));
        }
        obtainAttributes.recycle();
        return m31562h.m31560b();
    }

    /* renamed from: b0 */
    public static LatLngBounds m31580b0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C11592f.f29636a);
        int i = C11592f.f29647l;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = C11592f.f29648m;
        Float valueOf2 = obtainAttributes.hasValue(i2) ? Float.valueOf(obtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = C11592f.f29645j;
        Float valueOf3 = obtainAttributes.hasValue(i3) ? Float.valueOf(obtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = C11592f.f29646k;
        Float valueOf4 = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    /* renamed from: c0 */
    private static int m31579c0(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    /* renamed from: E */
    public Integer m31603E() {
        return this.f8226N;
    }

    /* renamed from: F */
    public CameraPosition m31602F() {
        return this.f8231z;
    }

    /* renamed from: G */
    public LatLngBounds m31601G() {
        return this.f8224L;
    }

    /* renamed from: H */
    public String m31600H() {
        return this.f8227O;
    }

    /* renamed from: I */
    public int m31599I() {
        return this.f8230y;
    }

    /* renamed from: J */
    public Float m31598J() {
        return this.f8223K;
    }

    /* renamed from: K */
    public Float m31597K() {
        return this.f8222J;
    }

    /* renamed from: L */
    public GoogleMapOptions m31596L(LatLngBounds latLngBounds) {
        this.f8224L = latLngBounds;
        return this;
    }

    /* renamed from: M */
    public GoogleMapOptions m31595M(boolean z) {
        this.f8219G = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: N */
    public GoogleMapOptions m31594N(String str) {
        this.f8227O = str;
        return this;
    }

    /* renamed from: O */
    public GoogleMapOptions m31593O(boolean z) {
        this.f8220H = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: P */
    public GoogleMapOptions m31592P(int i) {
        this.f8230y = i;
        return this;
    }

    /* renamed from: Q */
    public GoogleMapOptions m31591Q(float f) {
        this.f8223K = Float.valueOf(f);
        return this;
    }

    /* renamed from: R */
    public GoogleMapOptions m31590R(float f) {
        this.f8222J = Float.valueOf(f);
        return this;
    }

    /* renamed from: S */
    public GoogleMapOptions m31589S(boolean z) {
        this.f8218F = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: T */
    public GoogleMapOptions m31588T(boolean z) {
        this.f8215C = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: U */
    public GoogleMapOptions m31587U(boolean z) {
        this.f8225M = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: V */
    public GoogleMapOptions m31586V(boolean z) {
        this.f8217E = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: W */
    public GoogleMapOptions m31585W(boolean z) {
        this.f8229x = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: X */
    public GoogleMapOptions m31584X(boolean z) {
        this.f8228w = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: Y */
    public GoogleMapOptions m31583Y(boolean z) {
        this.f8213A = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: Z */
    public GoogleMapOptions m31582Z(boolean z) {
        this.f8216D = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    public GoogleMapOptions m31578h(boolean z) {
        this.f8221I = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: t */
    public GoogleMapOptions m31577t(Integer num) {
        this.f8226N = num;
        return this;
    }

    public String toString() {
        return C13701c.m573c(this).m572a("MapType", Integer.valueOf(this.f8230y)).m572a("LiteMode", this.f8219G).m572a("Camera", this.f8231z).m572a("CompassEnabled", this.f8214B).m572a("ZoomControlsEnabled", this.f8213A).m572a("ScrollGesturesEnabled", this.f8215C).m572a("ZoomGesturesEnabled", this.f8216D).m572a("TiltGesturesEnabled", this.f8217E).m572a("RotateGesturesEnabled", this.f8218F).m572a("ScrollGesturesEnabledDuringRotateOrZoom", this.f8225M).m572a("MapToolbarEnabled", this.f8220H).m572a("AmbientEnabled", this.f8221I).m572a("MinZoomPreference", this.f8222J).m572a("MaxZoomPreference", this.f8223K).m572a("BackgroundColor", this.f8226N).m572a("LatLngBoundsForCameraTarget", this.f8224L).m572a("ZOrderOnTop", this.f8228w).m572a("UseViewLifecycleInFragment", this.f8229x).toString();
    }

    /* renamed from: v */
    public GoogleMapOptions m31576v(CameraPosition cameraPosition) {
        this.f8231z = cameraPosition;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42015f(parcel, 2, C12301f.m3116a(this.f8228w));
        C0066a.m42015f(parcel, 3, C12301f.m3116a(this.f8229x));
        C0066a.m42009l(parcel, 4, m31599I());
        C0066a.m42004q(parcel, 5, m31602F(), i, false);
        C0066a.m42015f(parcel, 6, C12301f.m3116a(this.f8213A));
        C0066a.m42015f(parcel, 7, C12301f.m3116a(this.f8214B));
        C0066a.m42015f(parcel, 8, C12301f.m3116a(this.f8215C));
        C0066a.m42015f(parcel, 9, C12301f.m3116a(this.f8216D));
        C0066a.m42015f(parcel, 10, C12301f.m3116a(this.f8217E));
        C0066a.m42015f(parcel, 11, C12301f.m3116a(this.f8218F));
        C0066a.m42015f(parcel, 12, C12301f.m3116a(this.f8219G));
        C0066a.m42015f(parcel, 14, C12301f.m3116a(this.f8220H));
        C0066a.m42015f(parcel, 15, C12301f.m3116a(this.f8221I));
        C0066a.m42011j(parcel, 16, m31597K(), false);
        C0066a.m42011j(parcel, 17, m31598J(), false);
        C0066a.m42004q(parcel, 18, m31601G(), i, false);
        C0066a.m42015f(parcel, 19, C12301f.m3116a(this.f8225M));
        C0066a.m42007n(parcel, 20, m31603E(), false);
        C0066a.m42003r(parcel, 21, m31600H(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public GoogleMapOptions m31575y(boolean z) {
        this.f8214B = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.f8230y = -1;
        this.f8222J = null;
        this.f8223K = null;
        this.f8224L = null;
        this.f8226N = null;
        this.f8227O = null;
        this.f8228w = C12301f.m3115b(b);
        this.f8229x = C12301f.m3115b(b2);
        this.f8230y = i;
        this.f8231z = cameraPosition;
        this.f8213A = C12301f.m3115b(b3);
        this.f8214B = C12301f.m3115b(b4);
        this.f8215C = C12301f.m3115b(b5);
        this.f8216D = C12301f.m3115b(b6);
        this.f8217E = C12301f.m3115b(b7);
        this.f8218F = C12301f.m3115b(b8);
        this.f8219G = C12301f.m3115b(b9);
        this.f8220H = C12301f.m3115b(b10);
        this.f8221I = C12301f.m3115b(b11);
        this.f8222J = f;
        this.f8223K = f2;
        this.f8224L = latLngBounds;
        this.f8225M = C12301f.m3115b(b12);
        this.f8226N = num;
        this.f8227O = str;
    }
}
