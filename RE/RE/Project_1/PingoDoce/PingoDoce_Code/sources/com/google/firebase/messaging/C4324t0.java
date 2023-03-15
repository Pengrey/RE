package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: classes.dex */
public final class C4324t0 {

    /* renamed from: a */
    private final SharedPreferences f11730a;

    /* renamed from: e */
    private final Executor f11734e;

    /* renamed from: d */
    private final ArrayDeque<String> f11733d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f11735f = false;

    /* renamed from: b */
    private final String f11731b = "topic_operation_queue";

    /* renamed from: c */
    private final String f11732c = ",";

    private C4324t0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11730a = sharedPreferences;
        this.f11734e = executor;
    }

    /* renamed from: c */
    private boolean m27908c(boolean z) {
        if (!z || this.f11735f) {
            return z;
        }
        m27901j();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4324t0 m27907d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C4324t0 c4324t0 = new C4324t0(sharedPreferences, "topic_operation_queue", ",", executor);
        c4324t0.m27906e();
        return c4324t0;
    }

    /* renamed from: e */
    private void m27906e() {
        synchronized (this.f11733d) {
            this.f11733d.clear();
            String string = this.f11730a.getString(this.f11731b, BuildConfig.VERSION_NAME);
            if (!TextUtils.isEmpty(string) && string.contains(this.f11732c)) {
                String[] split = string.split(this.f11732c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f11733d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m27902i() {
        synchronized (this.f11733d) {
            this.f11730a.edit().putString(this.f11731b, m27903h()).commit();
        }
    }

    /* renamed from: j */
    private void m27901j() {
        this.f11734e.execute(new Runnable() { // from class: com.google.firebase.messaging.s0
            @Override // java.lang.Runnable
            public final void run() {
                C4324t0.this.m27902i();
            }
        });
    }

    /* renamed from: b */
    public boolean m27909b(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f11732c)) {
            return false;
        }
        synchronized (this.f11733d) {
            add = this.f11733d.add(str);
            m27908c(add);
        }
        return add;
    }

    /* renamed from: f */
    public String m27905f() {
        String peek;
        synchronized (this.f11733d) {
            peek = this.f11733d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean m27904g(Object obj) {
        boolean remove;
        synchronized (this.f11733d) {
            remove = this.f11733d.remove(obj);
            m27908c(remove);
        }
        return remove;
    }

    /* renamed from: h */
    public String m27903h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f11733d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f11732c);
        }
        return sb2.toString();
    }
}
