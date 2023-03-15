package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C1076h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public final class C0527v {

    /* renamed from: a */
    private TextView f1762a;

    /* renamed from: b */
    private TextClassifier f1763b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0527v(TextView textView) {
        this.f1762a = (TextView) C1076h.m38619f(textView);
    }

    /* renamed from: a */
    public TextClassifier m40410a() {
        TextClassifier textClassifier = this.f1763b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1762a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m40409b(TextClassifier textClassifier) {
        this.f1763b = textClassifier;
    }
}
