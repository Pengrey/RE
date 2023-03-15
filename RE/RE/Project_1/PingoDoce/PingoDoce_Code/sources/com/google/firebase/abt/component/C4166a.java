package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p121g9.C5627a;
import p136ha.InterfaceC5882b;
import p157i9.InterfaceC6056a;

/* renamed from: com.google.firebase.abt.component.a */
/* loaded from: classes.dex */
public class C4166a {

    /* renamed from: a */
    private final Map<String, C5627a> f11375a = new HashMap();

    /* renamed from: b */
    private final Context f11376b;

    /* renamed from: c */
    private final InterfaceC5882b<InterfaceC6056a> f11377c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4166a(Context context, InterfaceC5882b<InterfaceC6056a> interfaceC5882b) {
        this.f11376b = context;
        this.f11377c = interfaceC5882b;
    }

    /* renamed from: a */
    protected C5627a m28473a(String str) {
        return new C5627a(this.f11376b, this.f11377c, str);
    }

    /* renamed from: b */
    public synchronized C5627a m28472b(String str) {
        if (!this.f11375a.containsKey(str)) {
            this.f11375a.put(str, m28473a(str));
        }
        return this.f11375a.get(str);
    }
}
