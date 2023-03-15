package p442x9;

import java.util.HashMap;

/* renamed from: x9.c */
/* loaded from: classes.dex */
public class C12328c implements InterfaceC12329d {

    /* renamed from: a */
    private final int f32484a;

    public C12328c(int i) {
        this.f32484a = i;
    }

    /* renamed from: b */
    private static boolean m3062b(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m3061c(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && m3062b(stackTraceElementArr, num.intValue(), i3)) {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            } else {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i5 = 1;
                i2 = i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    @Override // p442x9.InterfaceC12329d
    /* renamed from: a */
    public StackTraceElement[] mo3060a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m3061c = m3061c(stackTraceElementArr, this.f32484a);
        return m3061c.length < stackTraceElementArr.length ? m3061c : stackTraceElementArr;
    }
}
