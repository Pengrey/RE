package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: com.facebook.internal.e */
/* loaded from: classes.dex */
public enum EnumC2325e {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    private static final EnumSet ALL;
    public static final C2326a Companion = new C2326a(null);
    private final long value;

    /* compiled from: SmartLoginOption.kt */
    /* renamed from: com.facebook.internal.e$a */
    /* loaded from: classes.dex */
    public static final class C2326a {
        private C2326a() {
        }

        /* renamed from: a */
        public final EnumSet m33984a(long j) {
            EnumSet noneOf = EnumSet.noneOf(EnumC2325e.class);
            Iterator it = EnumC2325e.access$getALL$cp().iterator();
            while (it.hasNext()) {
                EnumC2325e enumC2325e = (EnumC2325e) it.next();
                if ((enumC2325e.getValue() & j) != 0) {
                    noneOf.add(enumC2325e);
                }
            }
            Intrinsics.checkIfNull(noneOf, "result");
            return noneOf;
        }

        public /* synthetic */ C2326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumSet allOf = EnumSet.allOf(EnumC2325e.class);
        Intrinsics.checkIfNull(allOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    EnumC2325e(long j) {
        this.value = j;
    }

    public static final /* synthetic */ EnumSet access$getALL$cp() {
        return ALL;
    }

    public static final EnumSet parseOptions(long j) {
        return Companion.m33984a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
