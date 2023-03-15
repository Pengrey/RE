package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p294p9.AbstractC8472a0;

/* renamed from: com.google.firebase.crashlytics.internal.common.e */
/* loaded from: classes.dex */
class C4192e implements InterfaceC4242y {

    /* renamed from: a */
    private final byte[] f11438a;

    /* renamed from: b */
    private final String f11439b;

    /* renamed from: c */
    private final String f11440c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4192e(String str, String str2, byte[] bArr) {
        this.f11439b = str;
        this.f11440c = str2;
        this.f11438a = bArr;
    }

    /* renamed from: d */
    private byte[] m28385d() {
        if (m28384e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f11438a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m28384e() {
        byte[] bArr = this.f11438a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: a */
    public InputStream mo28192a() {
        if (m28384e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f11438a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: b */
    public String mo28191b() {
        return this.f11440c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: c */
    public AbstractC8472a0.AbstractC8478d.AbstractC8480b mo28190c() {
        byte[] m28385d = m28385d();
        if (m28385d == null) {
            return null;
        }
        return AbstractC8472a0.AbstractC8478d.AbstractC8480b.m15357a().mo15281b(m28385d).mo15280c(this.f11439b).mo15282a();
    }
}
