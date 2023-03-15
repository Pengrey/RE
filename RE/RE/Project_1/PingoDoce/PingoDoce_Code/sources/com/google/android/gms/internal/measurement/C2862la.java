package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.la */
/* loaded from: classes.dex */
final class C2862la implements Iterator {

    /* renamed from: w */
    private int f7840w = -1;

    /* renamed from: x */
    private boolean f7841x;

    /* renamed from: y */
    private Iterator f7842y;

    /* renamed from: z */
    final /* synthetic */ C2894na f7843z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2862la(C2894na c2894na, C2782ga c2782ga) {
        this.f7843z = c2894na;
    }

    /* renamed from: a */
    private final Iterator m32479a() {
        Map map;
        if (this.f7842y == null) {
            map = this.f7843z.f7899y;
            this.f7842y = map.entrySet().iterator();
        }
        return this.f7842y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7840w + 1;
        list = this.f7843z.f7898x;
        if (i >= list.size()) {
            map = this.f7843z.f7899y;
            return !map.isEmpty() && m32479a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f7841x = true;
        int i = this.f7840w + 1;
        this.f7840w = i;
        list = this.f7843z.f7898x;
        if (i < list.size()) {
            list2 = this.f7843z.f7898x;
            return (Map.Entry) list2.get(this.f7840w);
        }
        return (Map.Entry) m32479a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7841x) {
            this.f7841x = false;
            this.f7843z.m32409r();
            int i = this.f7840w;
            list = this.f7843z.f7898x;
            if (i < list.size()) {
                C2894na c2894na = this.f7843z;
                int i2 = this.f7840w;
                this.f7840w = i2 - 1;
                c2894na.m32411p(i2);
                return;
            }
            m32479a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
