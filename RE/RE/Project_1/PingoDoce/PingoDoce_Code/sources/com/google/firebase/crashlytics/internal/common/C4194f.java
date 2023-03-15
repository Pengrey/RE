package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.f */
/* loaded from: classes.dex */
public class C4194f {

    /* renamed from: a */
    private static final AtomicLong f11442a = new AtomicLong(0);

    /* renamed from: b */
    private static String f11443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4194f(C4239v c4239v) {
        byte[] bArr = new byte[10];
        m28379e(bArr);
        m28380d(bArr);
        m28381c(bArr);
        String m28352z = C4196g.m28352z(c4239v.mo28195a());
        String m28356v = C4196g.m28356v(bArr);
        Locale locale = Locale.US;
        f11443b = String.format(locale, "%s%s%s%s", m28356v.substring(0, 12), m28356v.substring(12, 16), m28356v.subSequence(16, 20), m28352z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m28383a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m28382b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m28381c(byte[] bArr) {
        byte[] m28382b = m28382b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m28382b[0];
        bArr[9] = m28382b[1];
    }

    /* renamed from: d */
    private void m28380d(byte[] bArr) {
        byte[] m28382b = m28382b(f11442a.incrementAndGet());
        bArr[6] = m28382b[0];
        bArr[7] = m28382b[1];
    }

    /* renamed from: e */
    private void m28379e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m28383a = m28383a(time / 1000);
        bArr[0] = m28383a[0];
        bArr[1] = m28383a[1];
        bArr[2] = m28383a[2];
        bArr[3] = m28383a[3];
        byte[] m28382b = m28382b(time % 1000);
        bArr[4] = m28382b[0];
        bArr[5] = m28382b[1];
    }

    public String toString() {
        return f11443b;
    }
}
