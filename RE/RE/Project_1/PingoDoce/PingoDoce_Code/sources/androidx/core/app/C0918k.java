package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0908j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p301q.C9552b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public class C0918k implements InterfaceC0907i {

    /* renamed from: a */
    private final Context f3160a;

    /* renamed from: b */
    private final Notification.Builder f3161b;

    /* renamed from: c */
    private final C0908j.C0916e f3162c;

    /* renamed from: d */
    private RemoteViews f3163d;

    /* renamed from: e */
    private RemoteViews f3164e;

    /* renamed from: f */
    private final List<Bundle> f3165f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3166g = new Bundle();

    /* renamed from: h */
    private int f3167h;

    /* renamed from: i */
    private RemoteViews f3168i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0918k(C0908j.C0916e c0916e) {
        int i;
        Icon icon;
        List<String> list;
        List<String> m39155e;
        this.f3162c = c0916e;
        this.f3160a = c0916e.f3130a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f3161b = new Notification.Builder(c0916e.f3130a, c0916e.f3118K);
        } else {
            this.f3161b = new Notification.Builder(c0916e.f3130a);
        }
        Notification notification = c0916e.f3126S;
        this.f3161b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0916e.f3138i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0916e.f3134e).setContentText(c0916e.f3135f).setContentInfo(c0916e.f3140k).setContentIntent(c0916e.f3136g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0916e.f3137h, (notification.flags & 128) != 0).setLargeIcon(c0916e.f3139j).setNumber(c0916e.f3141l).setProgress(c0916e.f3149t, c0916e.f3150u, c0916e.f3151v);
        if (i2 < 21) {
            this.f3161b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f3161b.setSubText(c0916e.f3146q).setUsesChronometer(c0916e.f3144o).setPriority(c0916e.f3142m);
            Iterator<C0908j.C0909a> it = c0916e.f3131b.iterator();
            while (it.hasNext()) {
                m39158b(it.next());
            }
            Bundle bundle = c0916e.f3111D;
            if (bundle != null) {
                this.f3166g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (c0916e.f3155z) {
                    this.f3166g.putBoolean("android.support.localOnly", true);
                }
                String str = c0916e.f3152w;
                if (str != null) {
                    this.f3166g.putString("android.support.groupKey", str);
                    if (c0916e.f3153x) {
                        this.f3166g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f3166g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = c0916e.f3154y;
                if (str2 != null) {
                    this.f3166g.putString("android.support.sortKey", str2);
                }
            }
            this.f3163d = c0916e.f3115H;
            this.f3164e = c0916e.f3116I;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f3161b.setShowWhen(c0916e.f3143n);
        }
        if (i3 >= 19 && i3 < 21 && (m39155e = m39155e(m39153g(c0916e.f3132c), c0916e.f3129V)) != null && !m39155e.isEmpty()) {
            this.f3166g.putStringArray("android.people", (String[]) m39155e.toArray(new String[m39155e.size()]));
        }
        if (i3 >= 20) {
            this.f3161b.setLocalOnly(c0916e.f3155z).setGroup(c0916e.f3152w).setGroupSummary(c0916e.f3153x).setSortKey(c0916e.f3154y);
            this.f3167h = c0916e.f3122O;
        }
        if (i3 >= 21) {
            this.f3161b.setCategory(c0916e.f3110C).setColor(c0916e.f3112E).setVisibility(c0916e.f3113F).setPublicVersion(c0916e.f3114G).setSound(notification.sound, notification.audioAttributes);
            if (i3 < 28) {
                list = m39155e(m39153g(c0916e.f3132c), c0916e.f3129V);
            } else {
                list = c0916e.f3129V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f3161b.addPerson(str3);
                }
            }
            this.f3168i = c0916e.f3117J;
            if (c0916e.f3133d.size() > 0) {
                Bundle bundle2 = c0916e.m39190c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < c0916e.f3133d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), C0919l.m39150b(c0916e.f3133d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                c0916e.m39190c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f3166g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = c0916e.f3128U) != null) {
            this.f3161b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f3161b.setExtras(c0916e.f3111D).setRemoteInputHistory(c0916e.f3148s);
            RemoteViews remoteViews = c0916e.f3115H;
            if (remoteViews != null) {
                this.f3161b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = c0916e.f3116I;
            if (remoteViews2 != null) {
                this.f3161b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = c0916e.f3117J;
            if (remoteViews3 != null) {
                this.f3161b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f3161b.setBadgeIconType(c0916e.f3119L).setSettingsText(c0916e.f3147r).setShortcutId(c0916e.f3120M).setTimeoutAfter(c0916e.f3121N).setGroupAlertBehavior(c0916e.f3122O);
            if (c0916e.f3109B) {
                this.f3161b.setColorized(c0916e.f3108A);
            }
            if (!TextUtils.isEmpty(c0916e.f3118K)) {
                this.f3161b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<C0920m> it2 = c0916e.f3132c.iterator();
            while (it2.hasNext()) {
                this.f3161b.addPerson(it2.next().m39138h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f3161b.setAllowSystemGeneratedContextualActions(c0916e.f3124Q);
            this.f3161b.setBubbleMetadata(C0908j.C0915d.m39194a(c0916e.f3125R));
        }
        if (i6 >= 31 && (i = c0916e.f3123P) != 0) {
            this.f3161b.setForegroundServiceBehavior(i);
        }
        if (c0916e.f3127T) {
            if (this.f3162c.f3153x) {
                this.f3167h = 2;
            } else {
                this.f3167h = 1;
            }
            this.f3161b.setVibrate(null);
            this.f3161b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f3161b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f3162c.f3152w)) {
                    this.f3161b.setGroup("silent");
                }
                this.f3161b.setGroupAlertBehavior(this.f3167h);
            }
        }
    }

    /* renamed from: b */
    private void m39158b(C0908j.C0909a c0909a) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f3165f.add(C0919l.m39146f(this.f3161b, c0909a));
                return;
            }
            return;
        }
        IconCompat m39209e = c0909a.m39209e();
        if (i >= 23) {
            builder = new Notification.Action.Builder(m39209e != null ? m39209e.m38893q() : null, c0909a.m39205i(), c0909a.m39213a());
        } else {
            builder = new Notification.Action.Builder(m39209e != null ? m39209e.m38900j() : 0, c0909a.m39205i(), c0909a.m39213a());
        }
        if (c0909a.m39208f() != null) {
            for (RemoteInput remoteInput : C0923n.m39127b(c0909a.m39208f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (c0909a.m39210d() != null) {
            bundle = new Bundle(c0909a.m39210d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0909a.m39212b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(c0909a.m39212b());
        }
        bundle.putInt("android.support.action.semanticAction", c0909a.m39207g());
        if (i2 >= 28) {
            builder.setSemanticAction(c0909a.m39207g());
        }
        if (i2 >= 29) {
            builder.setContextual(c0909a.m39203k());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(c0909a.m39204j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c0909a.m39206h());
        builder.addExtras(bundle);
        this.f3161b.addAction(builder.build());
    }

    /* renamed from: e */
    private static List<String> m39155e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C9552b c9552b = new C9552b(list.size() + list2.size());
        c9552b.addAll(list);
        c9552b.addAll(list2);
        return new ArrayList(c9552b);
    }

    /* renamed from: g */
    private static List<String> m39153g(List<C0920m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0920m c0920m : list) {
            arrayList.add(c0920m.m39139g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m39152h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.InterfaceC0907i
    /* renamed from: a */
    public Notification.Builder mo39159a() {
        return this.f3161b;
    }

    /* renamed from: c */
    public Notification m39157c() {
        Bundle m39214a;
        RemoteViews m39161f;
        RemoteViews m39163d;
        C0908j.AbstractC0917f abstractC0917f = this.f3162c.f3145p;
        if (abstractC0917f != null) {
            abstractC0917f.mo39165b(this);
        }
        RemoteViews m39162e = abstractC0917f != null ? abstractC0917f.m39162e(this) : null;
        Notification m39156d = m39156d();
        if (m39162e != null) {
            m39156d.contentView = m39162e;
        } else {
            RemoteViews remoteViews = this.f3162c.f3115H;
            if (remoteViews != null) {
                m39156d.contentView = remoteViews;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && abstractC0917f != null && (m39163d = abstractC0917f.m39163d(this)) != null) {
            m39156d.bigContentView = m39163d;
        }
        if (i >= 21 && abstractC0917f != null && (m39161f = this.f3162c.f3145p.m39161f(this)) != null) {
            m39156d.headsUpContentView = m39161f;
        }
        if (i >= 16 && abstractC0917f != null && (m39214a = C0908j.m39214a(m39156d)) != null) {
            abstractC0917f.mo39166a(m39214a);
        }
        return m39156d;
    }

    /* renamed from: d */
    protected Notification m39156d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f3161b.build();
        }
        if (i >= 24) {
            Notification build = this.f3161b.build();
            if (this.f3167h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f3167h == 2) {
                    m39152h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3167h == 1) {
                    m39152h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f3161b.setExtras(this.f3166g);
            Notification build2 = this.f3161b.build();
            RemoteViews remoteViews = this.f3163d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3164e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3168i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3167h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f3167h == 2) {
                    m39152h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3167h == 1) {
                    m39152h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f3161b.setExtras(this.f3166g);
            Notification build3 = this.f3161b.build();
            RemoteViews remoteViews4 = this.f3163d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3164e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3167h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f3167h == 2) {
                    m39152h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f3167h == 1) {
                    m39152h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> m39151a = C0919l.m39151a(this.f3165f);
            if (m39151a != null) {
                this.f3166g.putSparseParcelableArray("android.support.actionExtras", m39151a);
            }
            this.f3161b.setExtras(this.f3166g);
            Notification build4 = this.f3161b.build();
            RemoteViews remoteViews6 = this.f3163d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f3164e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i >= 16) {
            Notification build5 = this.f3161b.build();
            Bundle m39214a = C0908j.m39214a(build5);
            Bundle bundle = new Bundle(this.f3166g);
            for (String str : this.f3166g.keySet()) {
                if (m39214a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            m39214a.putAll(bundle);
            SparseArray<Bundle> m39151a2 = C0919l.m39151a(this.f3165f);
            if (m39151a2 != null) {
                C0908j.m39214a(build5).putSparseParcelableArray("android.support.actionExtras", m39151a2);
            }
            RemoteViews remoteViews8 = this.f3163d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f3164e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f3161b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m39154f() {
        return this.f3160a;
    }
}
