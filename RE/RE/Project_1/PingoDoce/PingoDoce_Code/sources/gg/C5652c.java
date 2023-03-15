package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.products.Category;

/* renamed from: gg.c */
/* loaded from: classes2.dex */
public final class C5652c extends HashMapLocalDataProvider {

    /* compiled from: CategoriesLocalDataProvider.kt */
    /* renamed from: gg.c$a */
    /* loaded from: classes2.dex */
    public static final class C5653a {
        private C5653a() {
        }

        public /* synthetic */ C5653a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5653a(null);
    }

    /* renamed from: f */
    public String mo23360f() {
        return "KEY_FOR_CATEGORIES_LIST";
    }

    /* renamed from: l */
    protected Type mo23359l() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, Category.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …ory::class.java\n        )");
        return m27327j;
    }
}
