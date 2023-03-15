package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4397c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p239mb.C7155b;
import p239mb.C7158e;

/* renamed from: com.google.zxing.qrcode.decoder.e */
/* loaded from: classes2.dex */
public final class C4427e {

    /* renamed from: a */
    private final C4397c f11943a = new C4397c(C4395a.f11898l);

    /* renamed from: a */
    private void m27619a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f11943a.m27670a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m27703a();
        }
    }

    /* renamed from: b */
    private C7158e m27618b(C4414a c4414a, Map<EnumC4399d, ?> map) throws FormatException, ChecksumException {
        C4432j m27633e = c4414a.m27633e();
        EnumC4428f m27613d = c4414a.m27634d().m27613d();
        C4415b[] m27629b = C4415b.m27629b(c4414a.m27635c(), m27633e, m27613d);
        int i = 0;
        for (C4415b c4415b : m27629b) {
            i += c4415b.m27628c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C4415b c4415b2 : m27629b) {
            byte[] m27630a = c4415b2.m27630a();
            int m27628c = c4415b2.m27628c();
            m27619a(m27630a, m27628c);
            int i3 = 0;
            while (i3 < m27628c) {
                bArr[i2] = m27630a[i3];
                i3++;
                i2++;
            }
        }
        return C4425d.m27627a(bArr, m27633e, m27613d, map);
    }

    /* renamed from: c */
    public C7158e m27617c(C7155b c7155b, Map<EnumC4399d, ?> map) throws FormatException, ChecksumException {
        ChecksumException e;
        C4414a c4414a = new C4414a(c7155b);
        FormatException formatException = null;
        try {
            return m27618b(c4414a, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c4414a.m27632f();
                c4414a.m27631g(true);
                c4414a.m27633e();
                c4414a.m27634d();
                c4414a.m27636b();
                C7158e m27618b = m27618b(c4414a, map);
                m27618b.m19031m(new C4431i(true));
                return m27618b;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            c4414a.m27632f();
            c4414a.m27631g(true);
            c4414a.m27633e();
            c4414a.m27634d();
            c4414a.m27636b();
            C7158e m27618b2 = m27618b(c4414a, map);
            m27618b2.m19031m(new C4431i(true));
            return m27618b2;
        }
    }
}
