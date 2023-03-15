package com.redmadrobot.inputmask.helper;

import androidx.constraintlayout.widget.C0868i;
import java.util.List;
import kotlin.Metadata;
import lc.AbstractC7034d;
import lc.C7033c;
import mc.C7166a;
import mc.C7167b;
import mc.C7168c;
import mc.C7169d;
import mc.C7175e;
import p181jd.Intrinsics;
import sd._Strings;

/* compiled from: Compiler.kt */
/* loaded from: classes2.dex */
public final class Compiler {

    /* renamed from: a */
    private final List<C7033c> f12046a;

    /* compiled from: Compiler.kt */
    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m20207d2 = {"Lcom/redmadrobot/inputmask/helper/Compiler$FormatError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "input-mask-android_release"}, m20206k = 1, m20205mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class FormatError extends Exception {
    }

    public Compiler(List<C7033c> list) {
        Intrinsics.m20926i(list, "customNotations");
        this.f12046a = list;
    }

    /* renamed from: b */
    private final AbstractC7034d m27500b(String str, boolean z, boolean z2, Character ch2) {
        char m8868N0;
        String m8870L0;
        String m8870L02;
        String m8870L03;
        String m8870L04;
        String m8870L05;
        String m8870L06;
        String m8870L07;
        String m8870L08;
        String m8870L09;
        String m8870L010;
        String m8870L011;
        String m8870L012;
        String m8870L013;
        if (str.length() == 0) {
            return new C7166a();
        }
        m8868N0 = _Strings.m8868N0(str);
        if (m8868N0 != '{') {
            if (m8868N0 != '}') {
                switch (m8868N0) {
                    case '[':
                        if (ch2 == null || '\\' != ch2.charValue()) {
                            m8870L011 = _Strings.m8870L0(str, 1);
                            return m27500b(m8870L011, true, false, Character.valueOf(m8868N0));
                        }
                        break;
                    case C0868i.f2963s0 /* 92 */:
                        if (ch2 == null || '\\' != ch2.charValue()) {
                            m8870L012 = _Strings.m8870L0(str, 1);
                            return m27500b(m8870L012, z, z2, Character.valueOf(m8868N0));
                        }
                        break;
                    case C0868i.f2968t0 /* 93 */:
                        if (ch2 == null || '\\' != ch2.charValue()) {
                            m8870L013 = _Strings.m8870L0(str, 1);
                            return m27500b(m8870L013, false, false, Character.valueOf(m8868N0));
                        }
                        break;
                }
            } else if (ch2 == null || '\\' != ch2.charValue()) {
                m8870L010 = _Strings.m8870L0(str, 1);
                return m27500b(m8870L010, false, false, Character.valueOf(m8868N0));
            }
        } else if (ch2 == null || '\\' != ch2.charValue()) {
            m8870L0 = _Strings.m8870L0(str, 1);
            return m27500b(m8870L0, false, true, Character.valueOf(m8868N0));
        }
        if (!z) {
            if (z2) {
                m8870L03 = _Strings.m8870L0(str, 1);
                return new C7167b(m27500b(m8870L03, false, true, Character.valueOf(m8868N0)), m8868N0);
            }
            m8870L02 = _Strings.m8870L0(str, 1);
            return new C7168c(m27500b(m8870L02, false, false, Character.valueOf(m8868N0)), m8868N0);
        } else if (m8868N0 == '-') {
            m8870L04 = _Strings.m8870L0(str, 1);
            return new C7169d(m27500b(m8870L04, true, false, Character.valueOf(m8868N0)), new C7169d.AbstractC7170a.C7171a());
        } else if (m8868N0 == '0') {
            m8870L05 = _Strings.m8870L0(str, 1);
            return new C7175e(m27500b(m8870L05, true, false, Character.valueOf(m8868N0)), new C7175e.AbstractC7176a.C7181e());
        } else if (m8868N0 == '9') {
            m8870L06 = _Strings.m8870L0(str, 1);
            return new C7169d(m27500b(m8870L06, true, false, Character.valueOf(m8868N0)), new C7169d.AbstractC7170a.C7174d());
        } else if (m8868N0 == 'A') {
            m8870L07 = _Strings.m8870L0(str, 1);
            return new C7175e(m27500b(m8870L07, true, false, Character.valueOf(m8868N0)), new C7175e.AbstractC7176a.C7180d());
        } else if (m8868N0 == '_') {
            m8870L08 = _Strings.m8870L0(str, 1);
            return new C7175e(m27500b(m8870L08, true, false, Character.valueOf(m8868N0)), new C7175e.AbstractC7176a.C7177a());
        } else if (m8868N0 == 'a') {
            m8870L09 = _Strings.m8870L0(str, 1);
            return new C7169d(m27500b(m8870L09, true, false, Character.valueOf(m8868N0)), new C7169d.AbstractC7170a.C7173c());
        } else if (m8868N0 != 8230) {
            return m27499c(m8868N0, str);
        } else {
            return new C7175e(m27498d(ch2));
        }
    }

    /* renamed from: c */
    private final AbstractC7034d m27499c(char c, String str) {
        String m8870L0;
        String m8870L02;
        for (C7033c c7033c : this.f12046a) {
            if (c7033c.m19539a() == c) {
                if (c7033c.m19537c()) {
                    m8870L02 = _Strings.m8870L0(str, 1);
                    return new C7169d(m27500b(m8870L02, true, false, Character.valueOf(c)), new C7169d.AbstractC7170a.C7172b(c, c7033c.m19538b()));
                }
                m8870L0 = _Strings.m8870L0(str, 1);
                return new C7175e(m27500b(m8870L0, true, false, Character.valueOf(c)), new C7175e.AbstractC7176a.C7178b(c, c7033c.m19538b()));
            }
        }
        throw new FormatError();
    }

    /* renamed from: d */
    private final C7175e.AbstractC7176a m27498d(Character ch2) {
        return ((ch2 != null && ch2.charValue() == '0') || (ch2 != null && ch2.charValue() == '9')) ? new C7175e.AbstractC7176a.C7181e() : ((ch2 != null && ch2.charValue() == 'A') || (ch2 != null && ch2.charValue() == 'a')) ? new C7175e.AbstractC7176a.C7180d() : ((ch2 != null && ch2.charValue() == '_') || (ch2 != null && ch2.charValue() == '-')) ? new C7175e.AbstractC7176a.C7177a() : (ch2 != null && ch2.charValue() == 8230) ? new C7175e.AbstractC7176a.C7177a() : (ch2 != null && ch2.charValue() == '[') ? new C7175e.AbstractC7176a.C7177a() : m27497e(ch2);
    }

    /* renamed from: e */
    private final C7175e.AbstractC7176a m27497e(Character ch2) {
        for (C7033c c7033c : this.f12046a) {
            char m19539a = c7033c.m19539a();
            if (ch2 != null && m19539a == ch2.charValue()) {
                return new C7175e.AbstractC7176a.C7178b(ch2.charValue(), c7033c.m19538b());
            }
        }
        throw new FormatError();
    }

    /* renamed from: a */
    public final AbstractC7034d m27501a(String str) throws FormatError {
        Intrinsics.m20926i(str, "formatString");
        return m27500b(new C4454b().m27493d(str), false, false, null);
    }
}
