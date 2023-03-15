package com.redmadrobot.inputmask.helper;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.redmadrobot.inputmask.helper.Compiler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p181jd.Intrinsics;
import p489zc._Arrays;
import p489zc._Collections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: com.redmadrobot.inputmask.helper.b */
/* loaded from: classes2.dex */
public final class C4454b {
    /* renamed from: a */
    private final void m27496a(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            Intrinsics.isNotNull(charArray, "(this as java.lang.String).toCharArray()");
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (char c : charArray) {
                if ('\\' == c) {
                    z = !z;
                } else {
                    if ('[' == c) {
                        if (z2) {
                            throw new Compiler.FormatError();
                        }
                        z2 = !z;
                    }
                    if (']' == c && !z) {
                        z2 = false;
                    }
                    if ('{' == c) {
                        if (z3) {
                            throw new Compiler.FormatError();
                        }
                        z3 = !z;
                    }
                    if ('}' == c && !z) {
                        z3 = false;
                    }
                    z = false;
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r11 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        if (r12 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r4 != false) goto L46;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List m27495b(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.redmadrobot.inputmask.helper.C4454b.m27495b(java.util.List):java.util.List");
    }

    /* renamed from: c */
    private final List m27494c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            char[] charArray = str.toCharArray();
            Intrinsics.isNotNull(charArray, "(this as java.lang.String).toCharArray()");
            int length = charArray.length;
            String str2 = BuildConfig.VERSION_NAME;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char c = charArray[i];
                if ('\\' == c && !z) {
                    str2 = str2 + c;
                    z = true;
                } else {
                    if (('[' == c || '{' == c) && !z) {
                        if (str2.length() > 0) {
                            arrayList.add(str2);
                        }
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    str2 = str2 + c;
                    if ((']' == c || '}' == c) && !z) {
                        arrayList.add(str2);
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    z = false;
                }
                i++;
            }
            if (!(str2.length() == 0)) {
                arrayList.add(str2);
            }
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    private final List m27492e(List list) {
        boolean m8948C;
        boolean m8922H;
        String m8935y;
        String m8935y2;
        List<Character> m280N;
        String m474U;
        boolean m8922H2;
        boolean m8922H3;
        String m8935y3;
        String m8935y4;
        List<Character> m280N2;
        String m474U2;
        boolean m8922H4;
        String m8935y5;
        String m8935y6;
        String m8935y7;
        String m8935y8;
        List<Character> m280N3;
        String m474U3;
        String m8935y9;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m8948C = StringsJVM.m8948C(str, "[", false, 2, null);
            if (m8948C) {
                m8922H = C10171u.m8922H(str, "0", false, 2, null);
                if (!m8922H) {
                    m8922H2 = C10171u.m8922H(str, "9", false, 2, null);
                    if (!m8922H2) {
                        m8922H3 = C10171u.m8922H(str, "a", false, 2, null);
                        if (!m8922H3) {
                            m8922H4 = C10171u.m8922H(str, "A", false, 2, null);
                            if (!m8922H4) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("[");
                                m8935y5 = StringsJVM.m8935y(str, "[", BuildConfig.VERSION_NAME, false, 4, null);
                                m8935y6 = StringsJVM.m8935y(m8935y5, "]", BuildConfig.VERSION_NAME, false, 4, null);
                                m8935y7 = StringsJVM.m8935y(m8935y6, "_", "A", false, 4, null);
                                m8935y8 = StringsJVM.m8935y(m8935y7, "-", "a", false, 4, null);
                                if (m8935y8 != null) {
                                    char[] charArray = m8935y8.toCharArray();
                                    Intrinsics.isNotNull(charArray, "(this as java.lang.String).toCharArray()");
                                    m280N3 = _Arrays.m280N(charArray);
                                    m474U3 = _Collections.m474U(m280N3, BuildConfig.VERSION_NAME, null, null, 0, null, null, 62, null);
                                    sb2.append(m474U3);
                                    sb2.append("]");
                                    m8935y9 = StringsJVM.m8935y(sb2.toString(), "A", "_", false, 4, null);
                                    str = StringsJVM.m8935y(m8935y9, "a", "-", false, 4, null);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("[");
                        m8935y3 = StringsJVM.m8935y(str, "[", BuildConfig.VERSION_NAME, false, 4, null);
                        m8935y4 = StringsJVM.m8935y(m8935y3, "]", BuildConfig.VERSION_NAME, false, 4, null);
                        if (m8935y4 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        char[] charArray2 = m8935y4.toCharArray();
                        Intrinsics.isNotNull(charArray2, "(this as java.lang.String).toCharArray()");
                        m280N2 = _Arrays.m280N(charArray2);
                        m474U2 = _Collections.m474U(m280N2, BuildConfig.VERSION_NAME, null, null, 0, null, null, 62, null);
                        sb3.append(m474U2);
                        sb3.append("]");
                        str = sb3.toString();
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[");
                m8935y = StringsJVM.m8935y(str, "[", BuildConfig.VERSION_NAME, false, 4, null);
                m8935y2 = StringsJVM.m8935y(m8935y, "]", BuildConfig.VERSION_NAME, false, 4, null);
                if (m8935y2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                char[] charArray3 = m8935y2.toCharArray();
                Intrinsics.isNotNull(charArray3, "(this as java.lang.String).toCharArray()");
                m280N = _Arrays.m280N(charArray3);
                m474U = _Collections.m474U(m280N, BuildConfig.VERSION_NAME, null, null, 0, null, null, 62, null);
                sb4.append(m474U);
                sb4.append("]");
                str = sb4.toString();
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m27493d(String str) throws Compiler.FormatError {
        String m474U;
        Intrinsics.m20926i(str, "formatString");
        m27496a(str);
        m474U = _Collections.m474U(m27492e(m27495b(m27494c(str))), BuildConfig.VERSION_NAME, null, null, 0, null, null, 62, null);
        return m474U;
    }
}
