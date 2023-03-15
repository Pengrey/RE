package p435x2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: x2.a */
/* loaded from: classes.dex */
public final class C12256a {

    /* renamed from: f */
    private static final Object f32301f = new Object();

    /* renamed from: g */
    private static C12256a f32302g;

    /* renamed from: a */
    private final Context f32303a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C12259c>> f32304b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C12259c>> f32305c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C12258b> f32306d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f32307e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: x2.a$a */
    /* loaded from: classes.dex */
    class HandlerC12257a extends Handler {
        HandlerC12257a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C12256a.this.m3183a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: x2.a$b */
    /* loaded from: classes.dex */
    public static final class C12258b {

        /* renamed from: a */
        final Intent f32309a;

        /* renamed from: b */
        final ArrayList<C12259c> f32310b;

        C12258b(Intent intent, ArrayList<C12259c> arrayList) {
            this.f32309a = intent;
            this.f32310b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: x2.a$c */
    /* loaded from: classes.dex */
    public static final class C12259c {

        /* renamed from: a */
        final IntentFilter f32311a;

        /* renamed from: b */
        final BroadcastReceiver f32312b;

        /* renamed from: c */
        boolean f32313c;

        /* renamed from: d */
        boolean f32314d;

        C12259c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f32311a = intentFilter;
            this.f32312b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f32312b);
            sb2.append(" filter=");
            sb2.append(this.f32311a);
            if (this.f32314d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private C12256a(Context context) {
        this.f32303a = context;
        this.f32307e = new HandlerC12257a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C12256a m3182b(Context context) {
        C12256a c12256a;
        synchronized (f32301f) {
            if (f32302g == null) {
                f32302g = new C12256a(context.getApplicationContext());
            }
            c12256a = f32302g;
        }
        return c12256a;
    }

    /* renamed from: a */
    void m3183a() {
        int size;
        C12258b[] c12258bArr;
        while (true) {
            synchronized (this.f32304b) {
                size = this.f32306d.size();
                if (size <= 0) {
                    return;
                }
                c12258bArr = new C12258b[size];
                this.f32306d.toArray(c12258bArr);
                this.f32306d.clear();
            }
            for (int i = 0; i < size; i++) {
                C12258b c12258b = c12258bArr[i];
                int size2 = c12258b.f32310b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C12259c c12259c = c12258b.f32310b.get(i2);
                    if (!c12259c.f32314d) {
                        c12259c.f32312b.onReceive(this.f32303a, c12258b.f32309a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m3181c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f32304b) {
            C12259c c12259c = new C12259c(intentFilter, broadcastReceiver);
            ArrayList<C12259c> arrayList = this.f32304b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f32304b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c12259c);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C12259c> arrayList2 = this.f32305c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f32305c.put(action, arrayList2);
                }
                arrayList2.add(c12259c);
            }
        }
    }

    /* renamed from: d */
    public boolean m3180d(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C12259c> arrayList2;
        String str2;
        synchronized (this.f32304b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f32303a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C12259c> arrayList3 = this.f32305c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C12259c c12259c = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c12259c.f32311a);
                    }
                    if (c12259c.f32313c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = c12259c.f32311a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c12259c);
                            c12259c.f32313c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C12259c) arrayList5.get(i3)).f32313c = false;
                    }
                    this.f32306d.add(new C12258b(intent, arrayList5));
                    if (!this.f32307e.hasMessages(1)) {
                        this.f32307e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m3179e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f32304b) {
            ArrayList<C12259c> remove = this.f32304b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C12259c c12259c = remove.get(size);
                c12259c.f32314d = true;
                for (int i = 0; i < c12259c.f32311a.countActions(); i++) {
                    String action = c12259c.f32311a.getAction(i);
                    ArrayList<C12259c> arrayList = this.f32305c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C12259c c12259c2 = arrayList.get(size2);
                            if (c12259c2.f32312b == broadcastReceiver) {
                                c12259c2.f32314d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f32305c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
