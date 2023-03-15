package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4391t;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.util.ArrayList;
import p421wa.C11605a;
import sa.C10124h;

/* renamed from: ta.h */
/* loaded from: classes2.dex */
public final class C10416h extends AbstractC4385s<Object> {

    /* renamed from: b */
    public static final InterfaceC4391t f27069b = new C10417a();

    /* renamed from: a */
    private final C4364f f27070a;

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: ta.h$a */
    /* loaded from: classes2.dex */
    class C10417a implements InterfaceC4391t {
        C10417a() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            if (c11605a.m4629c() == Object.class) {
                return new C10416h(c4364f);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: ta.h$b */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C10418b {

        /* renamed from: a */
        static final /* synthetic */ int[] f27071a;

        static {
            int[] iArr = new int[EnumC4389b.values().length];
            f27071a = iArr;
            try {
                iArr[EnumC4389b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27071a[EnumC4389b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27071a[EnumC4389b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27071a[EnumC4389b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27071a[EnumC4389b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27071a[EnumC4389b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C10416h(C4364f c4364f) {
        this.f27070a = c4364f;
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: b */
    public Object mo27782e(C4387a c4387a) throws IOException {
        switch (C10418b.f27071a[c4387a.mo8038o0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c4387a.mo8044a();
                while (c4387a.mo8055H()) {
                    arrayList.add(mo27782e(c4387a));
                }
                c4387a.mo8037v();
                return arrayList;
            case 2:
                C10124h c10124h = new C10124h();
                c4387a.mo8041c();
                while (c4387a.mo8055H()) {
                    c10124h.put(c4387a.mo8042b0(), mo27782e(c4387a));
                }
                c4387a.mo8036y();
                return c10124h;
            case 3:
                return c4387a.mo8039j0();
            case 4:
                return Double.valueOf(c4387a.mo8046W());
            case 5:
                return Boolean.valueOf(c4387a.mo8047R());
            case 6:
                c4387a.mo8040e0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: d */
    public void mo27781f(C4390c c4390c, Object obj) throws IOException {
        if (obj == null) {
            c4390c.mo8031P();
            return;
        }
        AbstractC4385s m27795k = this.f27070a.m27795k(obj.getClass());
        if (m27795k instanceof C10416h) {
            c4390c.mo8029h();
            c4390c.mo8022y();
            return;
        }
        m27795k.mo27781f(c4390c, obj);
    }
}
