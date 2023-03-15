package com.github.razir.progressbutton;

import android.widget.TextView;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressButtonHolder.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m20207d2 = {"Lcom/github/razir/progressbutton/ProgressButtonHolder;", "Landroidx/lifecycle/s;", "Ljava/lang/ref/WeakReference;", "Landroid/widget/TextView;", "textView", "<init>", "(Ljava/lang/ref/WeakReference;)V", "progressbutton_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class ProgressButtonHolder implements InterfaceC1485s {

    /* renamed from: w */
    private final WeakReference f6923w;

    public ProgressButtonHolder(WeakReference weakReference) {
        Intrinsics.m20926i(weakReference, "textView");
        this.f6923w = weakReference;
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        TextView textView;
        Intrinsics.m20926i(interfaceC1491v, "source");
        Intrinsics.m20926i(enumC1471b, "event");
        if (enumC1471b != AbstractC1469p.EnumC1471b.ON_DESTROY || (textView = (TextView) this.f6923w.get()) == null) {
            return;
        }
        Intrinsics.isNotNull(textView, "it");
        C2370b.m33776g(textView);
        C2378g.m33743d(textView);
        C2378g.m33738i(textView);
        C2378g.m33739h(textView);
        C2378g.m33740g().remove(textView);
    }
}
