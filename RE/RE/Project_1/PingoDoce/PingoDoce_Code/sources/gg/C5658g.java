package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.clubs.Club;

/* renamed from: gg.g */
/* loaded from: classes2.dex */
public final class C5658g extends ValueLocalDataProvider {

    /* renamed from: g */
    private final long f15911g = 86400;

    /* compiled from: ClubsLocalDataProvider.kt */
    /* renamed from: gg.g$a */
    /* loaded from: classes2.dex */
    public static final class C5659a {
        private C5659a() {
        }

        public /* synthetic */ C5659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5659a(null);
    }

    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_CLUB_LIST";
    }

    /* renamed from: u */
    protected long mo23351u() {
        return this.f15911g;
    }

    /* renamed from: w */
    protected Type mo23350w() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, Club.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …lub::class.java\n        )");
        return m27327j;
    }
}
