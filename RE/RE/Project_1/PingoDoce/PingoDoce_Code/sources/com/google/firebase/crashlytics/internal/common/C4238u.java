package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p294p9.AbstractC8472a0;

/* renamed from: com.google.firebase.crashlytics.internal.common.u */
/* loaded from: classes.dex */
class C4238u implements InterfaceC4242y {

    /* renamed from: a */
    private final File f11549a;

    /* renamed from: b */
    private final String f11550b;

    /* renamed from: c */
    private final String f11551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4238u(String str, String str2, File file) {
        this.f11550b = str;
        this.f11551c = str2;
        this.f11549a = file;
    }

    /* renamed from: d */
    private byte[] m28208d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo28192a = mo28192a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (mo28192a == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (mo28192a != null) {
                    mo28192a.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = mo28192a.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        mo28192a.close();
                        return byteArray;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: a */
    public InputStream mo28192a() {
        if (this.f11549a.exists() && this.f11549a.isFile()) {
            try {
                return new FileInputStream(this.f11549a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: b */
    public String mo28191b() {
        return this.f11551c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4242y
    /* renamed from: c */
    public AbstractC8472a0.AbstractC8478d.AbstractC8480b mo28190c() {
        byte[] m28208d = m28208d();
        if (m28208d != null) {
            return AbstractC8472a0.AbstractC8478d.AbstractC8480b.m15357a().mo15281b(m28208d).mo15280c(this.f11550b).mo15282a();
        }
        return null;
    }
}
