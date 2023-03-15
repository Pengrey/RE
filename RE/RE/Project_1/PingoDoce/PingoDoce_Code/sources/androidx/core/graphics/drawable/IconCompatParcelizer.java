package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3263a = versionedParcel.m35598p(iconCompat.f3263a, 1);
        iconCompat.f3265c = versionedParcel.m35601j(iconCompat.f3265c, 2);
        iconCompat.f3266d = versionedParcel.m35597r(iconCompat.f3266d, 3);
        iconCompat.f3267e = versionedParcel.m35598p(iconCompat.f3267e, 4);
        iconCompat.f3268f = versionedParcel.m35598p(iconCompat.f3268f, 5);
        iconCompat.f3269g = (ColorStateList) versionedParcel.m35597r(iconCompat.f3269g, 6);
        iconCompat.f3271i = versionedParcel.m35596t(iconCompat.f3271i, 7);
        iconCompat.f3272j = versionedParcel.m35596t(iconCompat.f3272j, 8);
        iconCompat.m38895o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m35593x(true, true);
        iconCompat.m38894p(versionedParcel.m35603f());
        int i = iconCompat.f3263a;
        if (-1 != i) {
            versionedParcel.m35613F(i, 1);
        }
        byte[] bArr = iconCompat.f3265c;
        if (bArr != null) {
            versionedParcel.m35615B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3266d;
        if (parcelable != null) {
            versionedParcel.m35612H(parcelable, 3);
        }
        int i2 = iconCompat.f3267e;
        if (i2 != 0) {
            versionedParcel.m35613F(i2, 4);
        }
        int i3 = iconCompat.f3268f;
        if (i3 != 0) {
            versionedParcel.m35613F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3269g;
        if (colorStateList != null) {
            versionedParcel.m35612H(colorStateList, 6);
        }
        String str = iconCompat.f3271i;
        if (str != null) {
            versionedParcel.m35611J(str, 7);
        }
        String str2 = iconCompat.f3272j;
        if (str2 != null) {
            versionedParcel.m35611J(str2, 8);
        }
    }
}
