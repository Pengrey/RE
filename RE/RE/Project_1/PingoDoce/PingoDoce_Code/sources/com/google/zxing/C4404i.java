package com.google.zxing;

import ec.C5029a;
import gb.C5631b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p271ob.C8058a;
import p369tb.C10472a;
import p403vb.C11192p;
import p488zb.C13745b;

/* renamed from: com.google.zxing.i */
/* loaded from: classes2.dex */
public final class C4404i implements InterfaceC4408l {

    /* renamed from: c */
    private static final InterfaceC4408l[] f11919c = new InterfaceC4408l[0];

    /* renamed from: a */
    private Map<EnumC4399d, ?> f11920a;

    /* renamed from: b */
    private InterfaceC4408l[] f11921b;

    /* renamed from: d */
    private C4409m m27657d(C4394c c4394c) throws NotFoundException {
        InterfaceC4408l[] interfaceC4408lArr = this.f11921b;
        if (interfaceC4408lArr != null) {
            for (InterfaceC4408l interfaceC4408l : interfaceC4408lArr) {
                try {
                    return interfaceC4408l.mo516b(c4394c, this.f11920a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.m27700a();
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
        InterfaceC4408l[] interfaceC4408lArr = this.f11921b;
        if (interfaceC4408lArr != null) {
            for (InterfaceC4408l interfaceC4408l : interfaceC4408lArr) {
                interfaceC4408l.mo517a();
            }
        }
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException {
        m27655f(map);
        return m27657d(c4394c);
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException {
        m27655f(null);
        return m27657d(c4394c);
    }

    /* renamed from: e */
    public C4409m m27656e(C4394c c4394c) throws NotFoundException {
        if (this.f11921b == null) {
            m27655f(null);
        }
        return m27657d(c4394c);
    }

    /* renamed from: f */
    public void m27655f(Map<EnumC4399d, ?> map) {
        this.f11920a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(EnumC4399d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC4399d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC4392a.UPC_A) && !collection.contains(EnumC4392a.UPC_E) && !collection.contains(EnumC4392a.EAN_13) && !collection.contains(EnumC4392a.EAN_8) && !collection.contains(EnumC4392a.CODABAR) && !collection.contains(EnumC4392a.CODE_39) && !collection.contains(EnumC4392a.CODE_93) && !collection.contains(EnumC4392a.CODE_128) && !collection.contains(EnumC4392a.ITF) && !collection.contains(EnumC4392a.RSS_14) && !collection.contains(EnumC4392a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C11192p(map));
            }
            if (collection.contains(EnumC4392a.QR_CODE)) {
                arrayList.add(new C5029a());
            }
            if (collection.contains(EnumC4392a.DATA_MATRIX)) {
                arrayList.add(new C8058a());
            }
            if (collection.contains(EnumC4392a.AZTEC)) {
                arrayList.add(new C5631b());
            }
            if (collection.contains(EnumC4392a.PDF_417)) {
                arrayList.add(new C13745b());
            }
            if (collection.contains(EnumC4392a.MAXICODE)) {
                arrayList.add(new C10472a());
            }
            if (z && z2) {
                arrayList.add(new C11192p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C11192p(map));
            }
            arrayList.add(new C5029a());
            arrayList.add(new C8058a());
            arrayList.add(new C5631b());
            arrayList.add(new C13745b());
            arrayList.add(new C10472a());
            if (z2) {
                arrayList.add(new C11192p(map));
            }
        }
        this.f11921b = (InterfaceC4408l[]) arrayList.toArray(f11919c);
    }
}
