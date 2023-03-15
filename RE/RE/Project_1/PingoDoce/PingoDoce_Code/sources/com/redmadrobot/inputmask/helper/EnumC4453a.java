package com.redmadrobot.inputmask.helper;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
import lc.C7028a;
import p181jd.Intrinsics;
import p202kc.C6640a;
import p202kc.C6642c;

/* renamed from: com.redmadrobot.inputmask.helper.a */
/* loaded from: classes2.dex */
public enum EnumC4453a {
    WHOLE_STRING,
    PREFIX,
    CAPACITY,
    EXTRACTED_VALUE_CAPACITY;

    private final String prefixIntersection(String str, String str2) {
        if (str.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (str2.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int i = 0;
        while (i < str.length() && i < str2.length()) {
            if (str.charAt(i) != str2.charAt(i)) {
                String substring = str.substring(0, i);
                Intrinsics.isNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            i++;
        }
        String substring2 = str.substring(0, i);
        Intrinsics.isNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring2;
    }

    public final int calculateAffinityOfMask(C6642c c6642c, C7028a c7028a) {
        int length;
        int m20411e;
        Intrinsics.m20926i(c6642c, "mask");
        Intrinsics.m20926i(c7028a, "text");
        int i = C6640a.f17921a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        length = c6642c.mo20395b(c7028a).m20400c().length();
                        if (length > c6642c.m20410f()) {
                            return Integer.MIN_VALUE;
                        }
                        m20411e = c6642c.m20410f();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (c7028a.m19549c().length() > c6642c.m20411e()) {
                    return Integer.MIN_VALUE;
                } else {
                    length = c7028a.m19549c().length();
                    m20411e = c6642c.m20411e();
                }
                return length - m20411e;
            }
            return prefixIntersection(c6642c.mo20395b(c7028a).m20399d().m19549c(), c7028a.m19549c()).length();
        }
        return c6642c.mo20395b(c7028a).m20402a();
    }
}
