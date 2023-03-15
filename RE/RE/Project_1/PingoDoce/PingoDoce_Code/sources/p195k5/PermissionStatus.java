package p195k5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: k5.a */
/* loaded from: classes.dex */
public abstract class PermissionStatus {

    /* compiled from: PermissionStatus.kt */
    /* renamed from: k5.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6594a extends PermissionStatus {

        /* compiled from: PermissionStatus.kt */
        /* renamed from: k5.a$a$a */
        /* loaded from: classes.dex */
        public static final class C6595a extends AbstractC6594a {

            /* renamed from: a */
            private final String f17840a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6595a(String str) {
                super(str, null);
                Intrinsics.isThisObjectNull(str, "permission");
                this.f17840a = str;
            }

            /* renamed from: a */
            public String m20519a() {
                return this.f17840a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C6595a) && Intrinsics.equals(m20519a(), ((C6595a) obj).m20519a());
                }
                return true;
            }

            public int hashCode() {
                String m20519a = m20519a();
                if (m20519a != null) {
                    return m20519a.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Permanently(permission=" + m20519a() + ")";
            }
        }

        /* compiled from: PermissionStatus.kt */
        /* renamed from: k5.a$a$b */
        /* loaded from: classes.dex */
        public static final class C6596b extends AbstractC6594a {

            /* renamed from: a */
            private final String f17841a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6596b(String str) {
                super(str, null);
                Intrinsics.isThisObjectNull(str, "permission");
                this.f17841a = str;
            }

            /* renamed from: a */
            public String m20518a() {
                return this.f17841a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C6596b) && Intrinsics.equals(m20518a(), ((C6596b) obj).m20518a());
                }
                return true;
            }

            public int hashCode() {
                String m20518a = m20518a();
                if (m20518a != null) {
                    return m20518a.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "ShouldShowRationale(permission=" + m20518a() + ")";
            }
        }

        private AbstractC6594a(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC6594a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: PermissionStatus.kt */
    /* renamed from: k5.a$b */
    /* loaded from: classes.dex */
    public static final class C6597b extends PermissionStatus {

        /* renamed from: a */
        private final String f17842a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6597b(String str) {
            super(str, null);
            Intrinsics.isThisObjectNull(str, "permission");
            this.f17842a = str;
        }

        /* renamed from: a */
        public String m20517a() {
            return this.f17842a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C6597b) && Intrinsics.equals(m20517a(), ((C6597b) obj).m20517a());
            }
            return true;
        }

        public int hashCode() {
            String m20517a = m20517a();
            if (m20517a != null) {
                return m20517a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Granted(permission=" + m20517a() + ")";
        }
    }

    /* compiled from: PermissionStatus.kt */
    /* renamed from: k5.a$c */
    /* loaded from: classes.dex */
    public static final class C6598c extends PermissionStatus {

        /* renamed from: a */
        private final String f17843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6598c(String str) {
            super(str, null);
            Intrinsics.isThisObjectNull(str, "permission");
            this.f17843a = str;
        }

        /* renamed from: a */
        public String m20516a() {
            return this.f17843a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C6598c) && Intrinsics.equals(m20516a(), ((C6598c) obj).m20516a());
            }
            return true;
        }

        public int hashCode() {
            String m20516a = m20516a();
            if (m20516a != null) {
                return m20516a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "RequestRequired(permission=" + m20516a() + ")";
        }
    }

    private PermissionStatus(String str) {
    }

    public /* synthetic */ PermissionStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
