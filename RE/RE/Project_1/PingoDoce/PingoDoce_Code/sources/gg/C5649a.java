package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: gg.a */
/* loaded from: classes2.dex */
public final class C5649a extends HashMapLocalDataProvider {

    /* compiled from: BannersLocalDataProvider.kt */
    /* renamed from: gg.a$a */
    /* loaded from: classes2.dex */
    public static final class C5650a {
        private C5650a() {
        }

        public /* synthetic */ C5650a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5650a(null);
    }

    /* renamed from: f */
    public String mo23360f() {
        return "KEY_FOR_BANNERS";
    }

    /* renamed from: l */
    protected Type mo23359l() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, Banner.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …ner::class.java\n        )");
        return m27327j;
    }
}
