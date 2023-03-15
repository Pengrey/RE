package p286p1;

import java.util.List;
import p181jd.Intrinsics;

/* compiled from: MultiParagraph.kt */
/* renamed from: p1.g */
/* loaded from: classes.dex */
public final class C8344g {
    /* renamed from: a */
    public static final int m15721a(List list, int i) {
        char c;
        Intrinsics.isThisObjectNull(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C8346i c8346i = (C8346i) list.get(i3);
            if (c8346i.m15698f() > i) {
                c = 1;
            } else {
                c = c8346i.m15702b() <= i ? (char) 65535 : (char) 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public static final int m15720b(List list, int i) {
        char c;
        Intrinsics.isThisObjectNull(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C8346i c8346i = (C8346i) list.get(i3);
            if (c8346i.m15697g() > i) {
                c = 1;
            } else {
                c = c8346i.m15701c() <= i ? (char) 65535 : (char) 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m15719c(List list, float f) {
        char c;
        Intrinsics.isThisObjectNull(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C8346i c8346i = (C8346i) list.get(i2);
            if (c8346i.m15696h() > f) {
                c = 1;
            } else {
                c = c8346i.m15703a() <= f ? (char) 65535 : (char) 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
