package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1137c;
import androidx.core.view.InterfaceC1212v;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C1247j implements InterfaceC1212v {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewOnReceiveContentListener.java */
    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes.dex */
    public static final class C1248a {
        /* renamed from: a */
        static CharSequence m37837a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextViewOnReceiveContentListener.java */
    /* renamed from: androidx.core.widget.j$b */
    /* loaded from: classes.dex */
    public static final class C1249b {
        /* renamed from: a */
        static CharSequence m37836a(Context context, ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    private static CharSequence m37839b(Context context, ClipData.Item item, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1248a.m37837a(context, item, i);
        }
        return C1249b.m37836a(context, item, i);
    }

    /* renamed from: c */
    private static void m37838c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC1212v
    /* renamed from: a */
    public C1137c mo37840a(View view, C1137c c1137c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1137c);
        }
        if (c1137c.m38245d() == 2) {
            return c1137c;
        }
        ClipData m38247b = c1137c.m38247b();
        int m38246c = c1137c.m38246c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m38247b.getItemCount(); i++) {
            CharSequence m37839b = m37839b(context, m38247b.getItemAt(i), m38246c);
            if (m37839b != null) {
                if (!z) {
                    m37838c(editable, m37839b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m37839b);
                }
            }
        }
        return null;
    }
}
