![[Pasted image 20230324153138.png]]

The activity for this screen is `TakeAwayCategory`, and its package is `pt.pingodoce.app.data.local.models.takeaway`.

#### TakeAwayCategory (Data Model)


The class for this object is `TakeAwayCategory`, and its package is `pt.pingodoce.app.data.local.models.takeaway`.

Object structure:
```
code - string
name - straing
imageUrl - string
isHighlight - boolean
```



### API Interaction
This is the interface the app uses to interact with the API.

```java
public interface TakeAwayApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders/cancel")
    Object cancelOrder(@Body TakeAwayOrderCancellationRequest takeAwayOrderCancellationRequest, d<? super Response<u>> dVar);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/categories")
    Object categories(@Query("storeId") int i10, @Query("pickUpDate") String str, d<? super Response<List<TakeAwayCategory>>> dVar);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/categories/{id}")
    Object categoryProducts(@Path("id") String str, @Query("storeId") int i10, @Query("pickUpDate") String str2, @Query("pageNumber") int i11, @Query("pageSize") int i12, d<? super Response<List<TakeAwayProduct>>> dVar);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders")
    Object orders(d<? super Response<List<TakeAwayOrder>>> dVar);

    @POST("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders")
    Object placeOrder(@Body TakeAwayOrder takeAwayOrder, d<? super Response<TakeAwayOrderResponse>> dVar);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/status")
    Object status(d<? super Response<TakeAwayStatus>> dVar);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/store/{id}")
    Object takeAwaySchedules(@Path("id") int i10, d<? super Response<Store>> dVar);
}
```

These methods are called elsewhere in the app but the code involved was not understood. It is displayed below as-is:

The method `placeOrder` is invoked in `TakeAwayManager`:

```java
  /* compiled from: TakeAwayManager.kt */  
    @kotlin.coroutines.jvm.internal.f(
    c = "pt.pingodoce.app.data.managers.TakeAwayManager", 
    f = "TakeAwayManager.kt", 
    l = {179}, 
    m = "placeOrder")  

    public static final class h extends kotlin.coroutines.jvm.internal.d {  
        /* synthetic */ Object f15724w;  
        int f15726y;  
        h(bd.d<? super h> dVar) {  
            super(dVar);  
            m1.this = r1;  
        }  
        @Override // kotlin.coroutines.jvm.internal.a  
        public final Object invokeSuspend(Object obj) {  
            this.f15724w = obj;  
            this.f15726y |= Integer.MIN_VALUE;  
            return m1.this.w(null, this);  
        }  
    }
```

and in `TakeAwayService`:

```java
  
    @kotlin.coroutines.jvm.internal.f(
    c = "pt.pingodoce.app.data.remote.services.TakeAwayService$placeOrder$2", 
    f = "TakeAwayService.kt",
    l = {44}, 
    m = "invokeSuspend"
    )  
    /* loaded from: classes2.dex */  
public static final class e extends kotlin.coroutines.jvm.internal.l 
	implements id.l<bd.d<? super Response<TakeAwayOrderResponse>>, Object> {  
  
        /* renamed from: x  reason: collision with root package name */  
        int f23868x;  
  
        /* renamed from: z  reason: collision with root package name */  
        final /* synthetic */ TakeAwayOrder f23870z;  
  
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */  
        e(TakeAwayOrder takeAwayOrder, bd.d<? super e> dVar) {  
            super(1, dVar);  
            this.f23870z = takeAwayOrder;  
        }  
  
        @Override // kotlin.coroutines.jvm.internal.a  
        public final bd.d<yc.u> create(bd.d<?> dVar) {  
            return new e(this.f23870z, dVar);  
        }  
  
        @Override // id.l  
        /* renamed from: d */  
        public final Object invoke(bd.d<? super Response<TakeAwayOrderResponse>> dVar) {  
            return ((e) create(dVar)).invokeSuspend(yc.u.f27252a);  
        }  
  
        @Override // kotlin.coroutines.jvm.internal.a  
        public final Object invokeSuspend(Object obj) {  
            Object d10;  
            d10 = cd.d.d();  
            int i10 = this.f23868x;  
            if (i10 == 0) {  
                yc.n.b(obj);  
                TakeAwayApi takeAwayApi = i0.this.f23856d;  
                TakeAwayOrder takeAwayOrder = this.f23870z;  
                this.f23868x = 1;  
                obj = takeAwayApi.placeOrder(takeAwayOrder, this);  
                if (obj == d10) {  
                    return d10;  
                }  
            } else if (i10 != 1) {  
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");  
            } else {  
                yc.n.b(obj);  
            }  
            return obj;  
        }  
    }
```