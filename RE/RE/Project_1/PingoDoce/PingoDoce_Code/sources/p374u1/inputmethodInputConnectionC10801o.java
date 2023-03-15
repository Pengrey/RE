package p374u1;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p286p1.C8393w;
import p489zc._Collections;

/* compiled from: RecordingInputConnection.android.kt */
/* renamed from: u1.o  reason: invalid class name */
/* loaded from: classes.dex */
public final class inputmethodInputConnectionC10801o implements InputConnection {

    /* renamed from: a */
    private final InterfaceC10792h f27928a;

    /* renamed from: b */
    private final boolean f27929b;

    /* renamed from: c */
    private int f27930c;

    /* renamed from: d */
    private TextFieldValue f27931d;

    /* renamed from: e */
    private boolean f27932e;

    /* renamed from: f */
    private final List f27933f;

    /* renamed from: g */
    private boolean f27934g;

    public inputmethodInputConnectionC10801o(TextFieldValue textFieldValue, InterfaceC10792h interfaceC10792h, boolean z) {
        Intrinsics.isThisObjectNull(textFieldValue, "initState");
        Intrinsics.isThisObjectNull(interfaceC10792h, "eventCallback");
        this.f27928a = interfaceC10792h;
        this.f27929b = z;
        this.f27931d = textFieldValue;
        this.f27933f = new ArrayList();
        this.f27934g = true;
    }

    /* renamed from: a */
    private final void m7009a(InterfaceC10786d interfaceC10786d) {
        m7008b();
        try {
            this.f27933f.add(interfaceC10786d);
        } finally {
            m7007c();
        }
    }

    /* renamed from: b */
    private final boolean m7008b() {
        this.f27930c++;
        return true;
    }

    /* renamed from: c */
    private final boolean m7007c() {
        List<? extends InterfaceC10786d> m453p0;
        int i = this.f27930c - 1;
        this.f27930c = i;
        if (i == 0 && (!this.f27933f.isEmpty())) {
            InterfaceC10792h interfaceC10792h = this.f27928a;
            m453p0 = _Collections.m453p0(this.f27933f);
            interfaceC10792h.mo7049c(m453p0);
            this.f27933f.clear();
        }
        return this.f27930c > 0;
    }

    public boolean beginBatchEdit() {
        boolean z = this.f27934g;
        return z ? m7008b() : z;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f27934g;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.f27933f.clear();
        this.f27930c = 0;
        this.f27934g = false;
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f27934g;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Intrinsics.isThisObjectNull(inputContentInfo, "inputContentInfo");
        boolean z = this.f27934g;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f27934g;
        return z ? m7006d() : z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new EditCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final boolean m7006d() {
        return this.f27929b;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10784b(i, i2));
            return true;
        }
        return z;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10785c(i, i2));
            return true;
        }
        return z;
    }

    /* renamed from: e */
    public final InterfaceC10792h m7005e() {
        return this.f27928a;
    }

    public boolean endBatchEdit() {
        return m7007c();
    }

    public boolean finishComposingText() {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10787e());
            return true;
        }
        return z;
    }

    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f27931d.m7000d(), C8393w.m15536i(this.f27931d.m7001c()), i);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f27932e = (i & 1) != 0;
        return C10795k.m7042a(this.f27931d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i) {
        if (C8393w.m15539f(this.f27931d.m7001c())) {
            return null;
        }
        return C10808t.m6997a(this.f27931d).toString();
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return C10808t.m6996b(this.f27931d, i).toString();
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return C10808t.m6995c(this.f27931d, i).toString();
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.f27934g;
        if (z) {
            Log.w("RecordingIC", "performContextMenuAction is not supported");
            return false;
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int m7066a;
        boolean z = this.f27934g;
        if (z) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        m7066a = C10788f.f27895b.m7064c();
                        break;
                    case 3:
                        m7066a = C10788f.f27895b.m7060g();
                        break;
                    case 4:
                        m7066a = C10788f.f27895b.m7059h();
                        break;
                    case 5:
                        m7066a = C10788f.f27895b.m7063d();
                        break;
                    case 6:
                        m7066a = C10788f.f27895b.m7065b();
                        break;
                    case 7:
                        m7066a = C10788f.f27895b.m7061f();
                        break;
                    default:
                        Log.w("RecordingIC", Intrinsics.addStrAndObj("IME sends unsupported Editor Action: ", Integer.valueOf(i)));
                        m7066a = C10788f.f27895b.m7066a();
                        break;
                }
            } else {
                m7066a = C10788f.f27895b.m7066a();
            }
            m7005e().mo7050b(m7066a);
            return true;
        }
        return z;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f27934g;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.f27934g;
        if (z) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "event");
        boolean z = this.f27934g;
        if (z) {
            m7005e().mo7051a(keyEvent);
            return true;
        }
        return z;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10802p(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10803q(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.f27934g;
        if (z) {
            m7009a(new C10804r(i, i2));
            return true;
        }
        return z;
    }
}
