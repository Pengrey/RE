package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.internal.common.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C4207i implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C4207i f11459a = new C4207i();

    private /* synthetic */ C4207i() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(".ae");
        return startsWith;
    }
}
