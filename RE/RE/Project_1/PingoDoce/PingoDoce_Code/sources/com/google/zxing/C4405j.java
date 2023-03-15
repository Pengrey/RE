package com.google.zxing;

import ec.C5030b;
import gb.C5632c;
import java.util.Map;
import p239mb.C7155b;
import p271ob.C8059b;
import p403vb.C11176b;
import p403vb.C11177b0;
import p403vb.C11179d;
import p403vb.C11182f;
import p403vb.C11184h;
import p403vb.C11186j;
import p403vb.C11188l;
import p403vb.C11191o;
import p403vb.C11197u;
import p488zb.C13747d;

/* renamed from: com.google.zxing.j */
/* loaded from: classes2.dex */
public final class C4405j implements InterfaceC4413q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiFormatWriter.java */
    /* renamed from: com.google.zxing.j$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4406a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11922a;

        static {
            int[] iArr = new int[EnumC4392a.values().length];
            f11922a = iArr;
            try {
                iArr[EnumC4392a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11922a[EnumC4392a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11922a[EnumC4392a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11922a[EnumC4392a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11922a[EnumC4392a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11922a[EnumC4392a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11922a[EnumC4392a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11922a[EnumC4392a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11922a[EnumC4392a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11922a[EnumC4392a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11922a[EnumC4392a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11922a[EnumC4392a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11922a[EnumC4392a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        InterfaceC4413q c11188l;
        switch (C4406a.f11922a[enumC4392a.ordinal()]) {
            case 1:
                c11188l = new C11188l();
                break;
            case 2:
                c11188l = new C11177b0();
                break;
            case 3:
                c11188l = new C11186j();
                break;
            case 4:
                c11188l = new C11197u();
                break;
            case 5:
                c11188l = new C5030b();
                break;
            case 6:
                c11188l = new C11182f();
                break;
            case 7:
                c11188l = new C11184h();
                break;
            case 8:
                c11188l = new C11179d();
                break;
            case 9:
                c11188l = new C11191o();
                break;
            case 10:
                c11188l = new C13747d();
                break;
            case 11:
                c11188l = new C11176b();
                break;
            case 12:
                c11188l = new C8059b();
                break;
            case 13:
                c11188l = new C5632c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC4392a)));
        }
        return c11188l.mo497a(str, enumC4392a, i, i2, map);
    }

    /* renamed from: b */
    public C7155b m27654b(String str, EnumC4392a enumC4392a, int i, int i2) throws WriterException {
        return mo497a(str, enumC4392a, i, i2, null);
    }
}
