package p374u1;

import android.view.inputmethod.EditorInfo;
import p181jd.Intrinsics;
import p192k2.C6558a;
import p286p1.C8393w;
import p374u1.C10788f;
import p374u1.C10796l;
import p374u1.C10798m;

/* compiled from: TextInputServiceAndroid.android.kt */
/* renamed from: u1.x */
/* loaded from: classes.dex */
public final class C10817x {
    /* renamed from: a */
    private static final boolean m6977a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public static final void m6976b(EditorInfo editorInfo, C10790g c10790g, TextFieldValue textFieldValue) {
        Intrinsics.isThisObjectNull(editorInfo, "<this>");
        Intrinsics.isThisObjectNull(c10790g, "imeOptions");
        Intrinsics.isThisObjectNull(textFieldValue, "textFieldValue");
        int m7055d = c10790g.m7055d();
        C10788f.C10789a c10789a = C10788f.f27895b;
        int i = 6;
        if (C10788f.m7070l(m7055d, c10789a.m7066a())) {
            if (!c10790g.m7053f()) {
                i = 0;
            }
        } else if (C10788f.m7070l(m7055d, c10789a.m7062e())) {
            i = 1;
        } else if (C10788f.m7070l(m7055d, c10789a.m7064c())) {
            i = 2;
        } else if (C10788f.m7070l(m7055d, c10789a.m7063d())) {
            i = 5;
        } else if (C10788f.m7070l(m7055d, c10789a.m7061f())) {
            i = 7;
        } else if (C10788f.m7070l(m7055d, c10789a.m7060g())) {
            i = 3;
        } else if (C10788f.m7070l(m7055d, c10789a.m7059h())) {
            i = 4;
        } else if (!C10788f.m7070l(m7055d, c10789a.m7065b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int m7054e = c10790g.m7054e();
        C10798m.C10799a c10799a = C10798m.f27919a;
        if (C10798m.m7020j(m7054e, c10799a.m7011g())) {
            editorInfo.inputType = 1;
        } else if (C10798m.m7020j(m7054e, c10799a.m7017a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C10798m.m7020j(m7054e, c10799a.m7015c())) {
            editorInfo.inputType = 2;
        } else if (C10798m.m7020j(m7054e, c10799a.m7012f())) {
            editorInfo.inputType = 3;
        } else if (C10798m.m7020j(m7054e, c10799a.m7010h())) {
            editorInfo.inputType = 17;
        } else if (C10798m.m7020j(m7054e, c10799a.m7016b())) {
            editorInfo.inputType = 33;
        } else if (C10798m.m7020j(m7054e, c10799a.m7013e())) {
            editorInfo.inputType = 129;
        } else if (C10798m.m7020j(m7054e, c10799a.m7014d())) {
            editorInfo.inputType = 18;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!c10790g.m7053f() && m6977a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C10788f.m7070l(c10790g.m7055d(), c10789a.m7066a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m6977a(editorInfo.inputType, 1)) {
            int m7056c = c10790g.m7056c();
            C10796l.C10797a c10797a = C10796l.f27914a;
            if (C10796l.m7036f(m7056c, c10797a.m7033a())) {
                editorInfo.inputType |= 4096;
            } else if (C10796l.m7036f(m7056c, c10797a.m7030d())) {
                editorInfo.inputType |= 8192;
            } else if (C10796l.m7036f(m7056c, c10797a.m7031c())) {
                editorInfo.inputType |= 16384;
            }
            if (c10790g.m7057b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = C8393w.m15535j(textFieldValue.m7001c());
        editorInfo.initialSelEnd = C8393w.m15538g(textFieldValue.m7001c());
        C6558a.m20578f(editorInfo, textFieldValue.m7000d());
        editorInfo.imeOptions |= 33554432;
    }
}
