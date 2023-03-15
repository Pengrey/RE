package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import androidx.core.view.C1137c;
import p192k2.C6560b;
import p192k2.C6564c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public final class C0517s {

    /* compiled from: AppCompatReceiveContentHelper.java */
    /* renamed from: androidx.appcompat.widget.s$a */
    /* loaded from: classes.dex */
    class C0518a implements C6560b.InterfaceC6563c {

        /* renamed from: a */
        final /* synthetic */ View f1729a;

        C0518a(View view) {
            this.f1729a = view;
        }

        @Override // p192k2.C6560b.InterfaceC6563c
        /* renamed from: a */
        public boolean mo20572a(C6564c c6564c, int i, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                try {
                    c6564c.m20568d();
                    InputContentInfo inputContentInfo = (InputContentInfo) c6564c.m20567e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
            return C1112b0.m38425i0(this.f1729a, new C1137c.C1138a(new ClipData(c6564c.m20570b(), new ClipData.Item(c6564c.m20571a())), 2).m38238d(c6564c.m20569c()).m38240b(bundle).m38241a()) == null;
        }
    }

    /* compiled from: AppCompatReceiveContentHelper.java */
    /* renamed from: androidx.appcompat.widget.s$b */
    /* loaded from: classes.dex */
    private static final class C0519b {
        /* renamed from: a */
        static boolean m40476a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C1112b0.m38425i0(textView, new C1137c.C1138a(dragEvent.getClipData(), 3).m38241a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        /* renamed from: b */
        static boolean m40475b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C1112b0.m38425i0(view, new C1137c.C1138a(dragEvent.getClipData(), 3).m38241a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6560b.InterfaceC6563c m40480a(View view) {
        return new C0518a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m40479b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && C1112b0.m38470H(view) != null) {
            Activity m40477d = m40477d(view);
            if (m40477d == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C0519b.m40476a(dragEvent, (TextView) view, m40477d);
                    }
                    return C0519b.m40475b(dragEvent, view, m40477d);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m40478c(TextView textView, int i) {
        if ((i == 16908322 || i == 16908337) && C1112b0.m38470H(textView) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C1112b0.m38425i0(textView, new C1137c.C1138a(primaryClip, 1).m38239c(i != 16908322 ? 1 : 0).m38241a());
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static Activity m40477d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
