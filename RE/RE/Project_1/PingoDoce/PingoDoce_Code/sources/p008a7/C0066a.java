package p008a7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: a7.a */
/* loaded from: classes.dex */
public class C0066a {
    /* renamed from: a */
    public static int m42020a(Parcel parcel) {
        return m41998w(parcel, 20293);
    }

    /* renamed from: b */
    public static void m42019b(Parcel parcel, int i) {
        m41997x(parcel, i);
    }

    /* renamed from: c */
    public static void m42018c(Parcel parcel, int i, boolean z) {
        m41996y(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m42017d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m41996y(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m41996y(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m42016e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeBundle(bundle);
        m41997x(parcel, m41998w);
    }

    /* renamed from: f */
    public static void m42015f(Parcel parcel, int i, byte b) {
        m41996y(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: g */
    public static void m42014g(Parcel parcel, int i, double d) {
        m41996y(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m42013h(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m41996y(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m41996y(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m42012i(Parcel parcel, int i, float f) {
        m41996y(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m42011j(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m41996y(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m41996y(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m42010k(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m41997x(parcel, m41998w);
    }

    /* renamed from: l */
    public static void m42009l(Parcel parcel, int i, int i2) {
        m41996y(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m42008m(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeIntArray(iArr);
        m41997x(parcel, m41998w);
    }

    /* renamed from: n */
    public static void m42007n(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m41996y(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m41996y(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m42006o(Parcel parcel, int i, long j) {
        m41996y(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: p */
    public static void m42005p(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m41996y(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m41996y(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m42004q(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m41997x(parcel, m41998w);
    }

    /* renamed from: r */
    public static void m42003r(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeString(str);
        m41997x(parcel, m41998w);
    }

    /* renamed from: s */
    public static void m42002s(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeStringArray(strArr);
        m41997x(parcel, m41998w);
    }

    /* renamed from: t */
    public static void m42001t(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeStringList(list);
        m41997x(parcel, m41998w);
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m42000u(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m41995z(parcel, t, i2);
            }
        }
        m41997x(parcel, m41998w);
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m41999v(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m41996y(parcel, i, 0);
                return;
            }
            return;
        }
        int m41998w = m41998w(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m41995z(parcel, t, 0);
            }
        }
        m41997x(parcel, m41998w);
    }

    /* renamed from: w */
    private static int m41998w(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: x */
    private static void m41997x(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: y */
    private static void m41996y(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: z */
    private static <T extends Parcelable> void m41995z(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
