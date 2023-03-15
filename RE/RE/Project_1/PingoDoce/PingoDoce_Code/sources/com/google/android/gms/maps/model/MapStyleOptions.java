package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C2631b;
import java.io.IOException;
import p008a7.C0066a;
import p463y7.C13134g;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C13134g();

    /* renamed from: w */
    private String f8261w;

    public MapStyleOptions(String str) {
        C2597i.m33075k(str, "json must not be null");
        this.f8261w = str;
    }

    /* renamed from: h */
    public static MapStyleOptions m31551h(Context context, int i) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(C2631b.m32995c(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String obj = e.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i);
            sb2.append(": ");
            sb2.append(obj);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 2, this.f8261w, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
