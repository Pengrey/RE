package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Objects;
import p294p9.AbstractC8472a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.b */
/* loaded from: classes.dex */
public final class C4186b extends AbstractC4228o {

    /* renamed from: a */
    private final AbstractC8472a0 f11427a;

    /* renamed from: b */
    private final String f11428b;

    /* renamed from: c */
    private final File f11429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4186b(AbstractC8472a0 abstractC8472a0, String str, File file) {
        Objects.requireNonNull(abstractC8472a0, "Null report");
        this.f11427a = abstractC8472a0;
        Objects.requireNonNull(str, "Null sessionId");
        this.f11428b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f11429c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.AbstractC4228o
    /* renamed from: b */
    public AbstractC8472a0 mo28229b() {
        return this.f11427a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.AbstractC4228o
    /* renamed from: c */
    public File mo28228c() {
        return this.f11429c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.AbstractC4228o
    /* renamed from: d */
    public String mo28227d() {
        return this.f11428b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4228o) {
            AbstractC4228o abstractC4228o = (AbstractC4228o) obj;
            return this.f11427a.equals(abstractC4228o.mo28229b()) && this.f11428b.equals(abstractC4228o.mo28227d()) && this.f11429c.equals(abstractC4228o.mo28228c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11427a.hashCode() ^ 1000003) * 1000003) ^ this.f11428b.hashCode()) * 1000003) ^ this.f11429c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f11427a + ", sessionId=" + this.f11428b + ", reportFile=" + this.f11429c + "}";
    }
}
