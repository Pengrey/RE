package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    private static void m33059A(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i3);
        sb2.append(" got ");
        sb2.append(i2);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    /* renamed from: B */
    private static void m33058B(Parcel parcel, int i, int i2) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == i2) {
            return;
        }
        String hexString = Integer.toHexString(m33034x);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i2);
        sb2.append(" got ");
        sb2.append(m33034x);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    /* renamed from: a */
    public static Bundle m33057a(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m33034x);
        return readBundle;
    }

    /* renamed from: b */
    public static int[] m33056b(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m33034x);
        return createIntArray;
    }

    /* renamed from: c */
    public static <T extends Parcelable> T m33055c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m33034x);
        return createFromParcel;
    }

    /* renamed from: d */
    public static String m33054d(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m33034x);
        return readString;
    }

    /* renamed from: e */
    public static String[] m33053e(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m33034x);
        return createStringArray;
    }

    /* renamed from: f */
    public static ArrayList<String> m33052f(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m33034x);
        return createStringArrayList;
    }

    /* renamed from: g */
    public static <T> T[] m33051g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m33034x);
        return tArr;
    }

    /* renamed from: h */
    public static <T> ArrayList<T> m33050h(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m33034x);
        return createTypedArrayList;
    }

    /* renamed from: i */
    public static void m33049i(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(i);
        throw new ParseException(sb2.toString(), parcel);
    }

    /* renamed from: j */
    public static int m33048j(int i) {
        return (char) i;
    }

    /* renamed from: k */
    public static boolean m33047k(Parcel parcel, int i) {
        m33058B(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: l */
    public static Boolean m33046l(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == 0) {
            return null;
        }
        m33059A(parcel, i, m33034x, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: m */
    public static byte m33045m(Parcel parcel, int i) {
        m33058B(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: n */
    public static double m33044n(Parcel parcel, int i) {
        m33058B(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m33043o(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == 0) {
            return null;
        }
        m33059A(parcel, i, m33034x, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static float m33042p(Parcel parcel, int i) {
        m33058B(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: q */
    public static Float m33041q(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == 0) {
            return null;
        }
        m33059A(parcel, i, m33034x, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: r */
    public static int m33040r(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: s */
    public static IBinder m33039s(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33034x == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m33034x);
        return readStrongBinder;
    }

    /* renamed from: t */
    public static int m33038t(Parcel parcel, int i) {
        m33058B(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: u */
    public static Integer m33037u(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == 0) {
            return null;
        }
        m33059A(parcel, i, m33034x, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: v */
    public static long m33036v(Parcel parcel, int i) {
        m33058B(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: w */
    public static Long m33035w(Parcel parcel, int i) {
        int m33034x = m33034x(parcel, i);
        if (m33034x == 0) {
            return null;
        }
        m33059A(parcel, i, m33034x, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: x */
    public static int m33034x(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: y */
    public static void m33033y(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m33034x(parcel, i));
    }

    /* renamed from: z */
    public static int m33032z(Parcel parcel) {
        int m33040r = m33040r(parcel);
        int m33034x = m33034x(parcel, m33040r);
        int dataPosition = parcel.dataPosition();
        if (m33048j(m33040r) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m33040r));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = m33034x + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("Size read is invalid start=");
            sb2.append(dataPosition);
            sb2.append(" end=");
            sb2.append(i);
            throw new ParseException(sb2.toString(), parcel);
        }
        return i;
    }
}
