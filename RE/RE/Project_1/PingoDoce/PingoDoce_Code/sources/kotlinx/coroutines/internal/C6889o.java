package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes2.dex */
public final class C6889o<E> {
    /* renamed from: a */
    public static <E> Object m19896a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m19895b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m19896a(obj);
    }

    /* renamed from: c */
    public static final Object m19894c(Object obj, E e) {
        if (!C10539l0.m7720a() || (!(e instanceof List))) {
            if (obj == null) {
                return m19896a(e);
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e);
                return m19896a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            return m19896a(arrayList);
        }
        throw new AssertionError();
    }
}
