package pt.pingodoce.app.data.remote.models.response;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;
import pt.pingodoce.app.data.local.models.banners.BannerAction;

/* compiled from: BannerJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class BannerJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f23045a;

    /* renamed from: b */
    private final AbstractC4470f f23046b;

    /* renamed from: c */
    private final AbstractC4470f f23047c;

    /* renamed from: d */
    private final AbstractC4470f f23048d;

    /* renamed from: e */
    private final AbstractC4470f f23049e;

    /* renamed from: f */
    private final AbstractC4470f f23050f;

    /* renamed from: g */
    private volatile Constructor f23051g;

    public BannerJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Set<? extends Annotation> m208b2;
        Set<? extends Annotation> m208b3;
        Set<? extends Annotation> m208b4;
        Set<? extends Annotation> m208b5;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("id", "title", "description", "shortAction", "thumb", "image", "isNew", "color", "action", "shortTitle");
        Intrinsics.checkIfNull(m27461a, "of(\"id\", \"title\", \"descr…, \"action\", \"shortTitle\")");
        this.f23045a = m27461a;
        Class cls = Integer.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "id");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.f23046b = m27366f;
        m208b2 = C13778q0.m208b();
        AbstractC4470f m27366f2 = c4496p.m27366f(String.class, m208b2, "title");
        Intrinsics.checkIfNull(m27366f2, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f23047c = m27366f2;
        m208b3 = C13778q0.m208b();
        AbstractC4470f m27366f3 = c4496p.m27366f(String.class, m208b3, "shortAction");
        Intrinsics.checkIfNull(m27366f3, "moshi.adapter(String::cl…mptySet(), \"shortAction\")");
        this.f23048d = m27366f3;
        Class cls2 = Boolean.TYPE;
        m208b4 = C13778q0.m208b();
        AbstractC4470f m27366f4 = c4496p.m27366f(cls2, m208b4, "isNew");
        Intrinsics.checkIfNull(m27366f4, "moshi.adapter(Boolean::c…mptySet(),\n      \"isNew\")");
        this.f23049e = m27366f4;
        m208b5 = C13778q0.m208b();
        AbstractC4470f m27366f5 = c4496p.m27366f(BannerAction.class, m208b5, "action");
        Intrinsics.checkIfNull(m27366f5, "moshi.adapter(BannerActi…va, emptySet(), \"action\")");
        this.f23050f = m27366f5;
    }

    /* renamed from: k */
    public Banner mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        abstractC4476h.mo27437c();
        int i = -1;
        String str = null;
        BannerAction bannerAction = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (abstractC4476h.mo27427y()) {
            switch (abstractC4476h.mo27436d0(this.f23045a)) {
                case -1:
                    abstractC4476h.mo27432l0();
                    abstractC4476h.mo27431o0();
                    break;
                case 0:
                    num = (Integer) this.f23046b.mo10144b(abstractC4476h);
                    if (num == null) {
                        JsonDataException m10121v = C9712b.m10121v("id", "id", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"id\", \"id\", reader)");
                        throw m10121v;
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str2 == null) {
                        JsonDataException m10121v2 = C9712b.m10121v("title", "title", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"title\", …e\",\n              reader)");
                        throw m10121v2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str3 == null) {
                        JsonDataException m10121v3 = C9712b.m10121v("description", "description", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"descript…   \"description\", reader)");
                        throw m10121v3;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.f23048d.mo10144b(abstractC4476h);
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str5 == null) {
                        JsonDataException m10121v4 = C9712b.m10121v("thumb", "thumb", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"thumb\", …b\",\n              reader)");
                        throw m10121v4;
                    }
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str6 == null) {
                        JsonDataException m10121v5 = C9712b.m10121v("image", "image", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"image\", …e\",\n              reader)");
                        throw m10121v5;
                    }
                    i &= -33;
                    break;
                case 6:
                    bool = (Boolean) this.f23049e.mo10144b(abstractC4476h);
                    if (bool == null) {
                        JsonDataException m10121v6 = C9712b.m10121v("isNew", "isNew", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"isNew\", …w\",\n              reader)");
                        throw m10121v6;
                    }
                    i &= -65;
                    break;
                case 7:
                    str7 = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str7 == null) {
                        JsonDataException m10121v7 = C9712b.m10121v("backgroundColor", "color", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"backgroundColor\", \"color\", reader)");
                        throw m10121v7;
                    }
                    i &= -129;
                    break;
                case 8:
                    bannerAction = (BannerAction) this.f23050f.mo10144b(abstractC4476h);
                    if (bannerAction == null) {
                        JsonDataException m10121v8 = C9712b.m10121v("action", "action", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"action\",…        \"action\", reader)");
                        throw m10121v8;
                    }
                    i &= -257;
                    break;
                case 9:
                    str = (String) this.f23047c.mo10144b(abstractC4476h);
                    if (str == null) {
                        JsonDataException m10121v9 = C9712b.m10121v("shortTitle", "shortTitle", abstractC4476h);
                        Intrinsics.checkIfNull(m10121v9, "unexpectedNull(\"shortTit…    \"shortTitle\", reader)");
                        throw m10121v9;
                    }
                    i &= -513;
                    break;
            }
        }
        abstractC4476h.mo27433h();
        if (i == -1024) {
            int intValue = num.intValue();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            Objects.requireNonNull(bannerAction, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.banners.BannerAction");
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new Banner(intValue, str2, str3, str4, str5, str6, booleanValue, str7, bannerAction, str);
        }
        String str8 = str;
        BannerAction bannerAction2 = bannerAction;
        String str9 = str7;
        Constructor constructor = this.f23051g;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Banner.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, BannerAction.class, String.class, cls, C9712b.f25570c);
            this.f23051g = constructor;
            Intrinsics.checkIfNull(constructor, "Banner::class.java.getDe…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, str2, str3, str4, str5, str6, bool, str9, bannerAction2, str8, Integer.valueOf(i), null);
        Intrinsics.checkIfNull(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (Banner) newInstance;
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Banner banner) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(banner, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("id");
        this.f23046b.mo10143i(abstractC4483m, Integer.valueOf(banner.m13950h()));
        abstractC4483m.mo27417F("title");
        this.f23047c.mo10143i(abstractC4483m, banner.m13945n());
        abstractC4483m.mo27417F("description");
        this.f23047c.mo10143i(abstractC4483m, banner.m13951f());
        abstractC4483m.mo27417F("shortAction");
        this.f23048d.mo10143i(abstractC4483m, banner.m13948j());
        abstractC4483m.mo27417F("thumb");
        this.f23047c.mo10143i(abstractC4483m, banner.m13946m());
        abstractC4483m.mo27417F("image");
        this.f23047c.mo10143i(abstractC4483m, banner.m13949i());
        abstractC4483m.mo27417F("isNew");
        this.f23049e.mo10143i(abstractC4483m, Boolean.valueOf(banner.m13944r()));
        abstractC4483m.mo27417F("color");
        this.f23047c.mo10143i(abstractC4483m, banner.m13952e());
        abstractC4483m.mo27417F("action");
        this.f23050f.mo10143i(abstractC4483m, banner.m13953d());
        abstractC4483m.mo27417F("shortTitle");
        this.f23047c.mo10143i(abstractC4483m, banner.m13947k());
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Banner");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
