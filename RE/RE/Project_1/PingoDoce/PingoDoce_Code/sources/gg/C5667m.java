package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: gg.m */
/* loaded from: classes2.dex */
public final class C5667m extends HashMapLocalDataProvider {

    /* renamed from: f */
    private final long f15921f = 600;

    /* renamed from: g */
    private final long f15922g = 86400;

    /* compiled from: FlyersLocalDataProvider.kt */
    /* renamed from: gg.m$a */
    /* loaded from: classes2.dex */
    public static final class C5668a {
        private C5668a() {
        }

        public /* synthetic */ C5668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5668a(null);
    }

    /* renamed from: f */
    public String mo23360f() {
        return "KEY_FOR_FLYERS";
    }

    /* renamed from: j */
    public long m23371j() {
        return this.f15922g;
    }

    /* renamed from: k */
    public long m23370k() {
        return this.f15921f;
    }

    /* renamed from: l */
    protected Type mo23359l() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, Flyer.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …yer::class.java\n        )");
        return m27327j;
    }
}
