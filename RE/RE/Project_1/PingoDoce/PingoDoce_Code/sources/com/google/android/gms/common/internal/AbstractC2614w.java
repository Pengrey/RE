package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.w */
/* loaded from: classes.dex */
public abstract class AbstractC2614w<TListener> {

    /* renamed from: a */
    private TListener f7520a;

    /* renamed from: b */
    private boolean f7521b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC2576b f7522c;

    public AbstractC2614w(AbstractC2576b abstractC2576b, TListener tlistener) {
        this.f7522c = abstractC2576b;
        this.f7520a = tlistener;
    }

    /* renamed from: a */
    protected abstract void mo33024a(TListener tlistener);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33023b();

    /* renamed from: c */
    public final void m33022c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f7520a;
            if (this.f7521b) {
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo33024a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f7521b = true;
        }
        m33020e();
    }

    /* renamed from: d */
    public final void m33021d() {
        synchronized (this) {
            this.f7520a = null;
        }
    }

    /* renamed from: e */
    public final void m33020e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m33021d();
        arrayList = this.f7522c.f7455l;
        synchronized (arrayList) {
            arrayList2 = this.f7522c.f7455l;
            arrayList2.remove(this);
        }
    }
}
