package p374u1;

import android.view.inputmethod.ExtractedText;
import p181jd.Intrinsics;
import p286p1.C8393w;
import sd.C10171u;

/* compiled from: InputState.android.kt */
/* renamed from: u1.k */
/* loaded from: classes.dex */
public final class C10795k {
    /* renamed from: a */
    public static final ExtractedText m7042a(TextFieldValue textFieldValue) {
        boolean m8924G;
        Intrinsics.isThisObjectNull(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.m7000d();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.m7000d().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C8393w.m15536i(textFieldValue.m7001c());
        extractedText.selectionEnd = C8393w.m15537h(textFieldValue.m7001c());
        m8924G = C10171u.m8924G(textFieldValue.m7000d(), '\n', false, 2, null);
        extractedText.flags = !m8924G ? 1 : 0;
        return extractedText;
    }
}
