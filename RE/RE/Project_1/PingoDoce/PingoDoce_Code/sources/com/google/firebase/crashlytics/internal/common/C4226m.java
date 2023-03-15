package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;
import p219l9.C7011f;
import p355s9.C10098f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.m */
/* loaded from: classes.dex */
public class C4226m {

    /* renamed from: a */
    private final String f11521a;

    /* renamed from: b */
    private final C10098f f11522b;

    public C4226m(String str, C10098f c10098f) {
        this.f11521a = str;
        this.f11522b = c10098f;
    }

    /* renamed from: b */
    private File m28257b() {
        return this.f11522b.m9160d(this.f11521a);
    }

    /* renamed from: a */
    public boolean m28258a() {
        try {
            return m28257b().createNewFile();
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19612e("Error creating marker: " + this.f11521a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m28256c() {
        return m28257b().exists();
    }

    /* renamed from: d */
    public boolean m28255d() {
        return m28257b().delete();
    }
}
