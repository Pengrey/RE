package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.k2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C3867k2 implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f11017a = new C3867k2();

    private C3867k2() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = C3871l2.f11021a.matcher(str).matches();
        return matches;
    }
}
