package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p078e7.InterfaceC5003d;
import p136ha.InterfaceC5882b;
import p157i9.InterfaceC6056a;
import p158ia.InterfaceC6066d;

/* renamed from: com.google.firebase.remoteconfig.internal.d */
/* loaded from: classes.dex */
public class C4347d {

    /* renamed from: a */
    private final InterfaceC6066d f11808a;

    /* renamed from: b */
    private final InterfaceC5882b<InterfaceC6056a> f11809b;

    /* renamed from: c */
    private final Map<String, String> f11810c;

    /* compiled from: ConfigFetchHandler.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.d$a */
    /* loaded from: classes.dex */
    public static class C4348a {
        private C4348a(Date date, int i, C4344c c4344c, String str) {
        }

        /* renamed from: a */
        public static C4348a m27818a(Date date) {
            return new C4348a(date, 1, null, null);
        }

        /* renamed from: b */
        public static C4348a m27817b(C4344c c4344c, String str) {
            return new C4348a(c4344c.m27825c(), 0, c4344c, str);
        }
    }

    static {
        TimeUnit.HOURS.toSeconds(12L);
    }

    public C4347d(InterfaceC6066d interfaceC6066d, InterfaceC5882b<InterfaceC6056a> interfaceC5882b, Executor executor, InterfaceC5003d interfaceC5003d, Random random, C4343b c4343b, ConfigFetchHttpClient configFetchHttpClient, C4350f c4350f, Map<String, String> map) {
        this.f11808a = interfaceC6066d;
        this.f11809b = interfaceC5882b;
        this.f11810c = map;
    }
}
