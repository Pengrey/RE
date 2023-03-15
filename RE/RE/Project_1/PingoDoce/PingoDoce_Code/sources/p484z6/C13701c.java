package p484z6;

import com.google.android.gms.common.internal.C2597i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.c */
/* loaded from: classes.dex */
public final class C13701c {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: z6.c$a */
    /* loaded from: classes.dex */
    public static final class C13702a {

        /* renamed from: a */
        private final List<String> f34817a;

        /* renamed from: b */
        private final Object f34818b;

        /* synthetic */ C13702a(Object obj, C13727x c13727x) {
            C2597i.m33076j(obj);
            this.f34818b = obj;
            this.f34817a = new ArrayList();
        }

        /* renamed from: a */
        public C13702a m572a(String str, Object obj) {
            List<String> list = this.f34817a;
            C2597i.m33076j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f34818b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f34817a.size();
            for (int i = 0; i < size; i++) {
                sb2.append(this.f34817a.get(i));
                if (i < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m575a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m574b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C13702a m573c(Object obj) {
        return new C13702a(obj, null);
    }
}
