Request:
```json
POST /api/v2/catalog/search/flyers HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: 451
Pdapp-Cardnumber: 
Pdapp-Lcid: 
Pdapp-Hid: 
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTE3MDAsImV4cCI6MTY3OTU5NTMwMCwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiJkN2YwMjliMi03NWZiLTQxMjItZmU0Yi0wOGRiMmI2ZDI0MTkiLCJhdXRoX3RpbWUiOjE2Nzk1OTE3MDAsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.bcAX9ZYE_gfzb-rAb1O1x92N6qUhW6RQUNMPzO_qfCOFlOc4g0m3-uJGgyGIP5DBjxO175F_tU1nKj6U62fPf-yqxVaoG7m7JMpErMApLlf8m97HwGQop9E8SpJV5mfE-jonrpQhl-Vljr4jUFMngLUlPsnYpNSnXk23Yu3uvrcx2Lxl9A01ZJzYhQ668YTdbuBla5sx4qhyLymLqtskKE5NiMI2GuDnyusxTzVq7RKkW1VbTfmGQ5rFJ-VZkaaFQMBGMKslNGiJIXLJH-YC9iwIzOOhltwYJnSwC_mg0TAp0CFFysZy4VHBEXcx4I_ooGtXT9SlHNHFZkXay9dNQQ
Accept-Language: en-US
Content-Type: application/json; charset=UTF-8
Content-Length: 15
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"storeId":451}
```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:00:13 GMT
Vary: Accept-Encoding
Request-Context: appId=cid-v1:b18b1f5c-1067-4634-a8b5-28282182ef3d
Strict-Transport-Security: max-age=2592000; preload
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
X-Content-Security-Policy: default-src 'self'; object-src 'none'; frame-ancestors 'none'; sandbox allow-forms allow-same-origin allow-scripts; base-uri 'self';
Referrer-Policy: no-referrer
api-supported-versions: 1,2
X-Powered-By: ASP.NET
Content-Length: 2537

[{"id":1206,"title":"Poupe Esta Semana","image":"https://prod-cdn-images-pdapp-jm.azureedge.net/images/flyers/6d723055-0b81-409b-94cf-52d8cee6ba91.png","pdfUrl":"https://folhetos.pingodoce.pt/2023/poupe-esta-semana/continental-lojas-pequenas/s12/","dateStart":"2023-03-21T00:00:00","dateEnd":"2023-03-27T23:00:00","description":"21 a 27 de Março","promotionId":0,"promotionIds":[50007767,50007842],"clubs":[],"storeGroupId":207,"allStores":false,"categories":[{"id":0,"title":"Destaque","primaryColor":"#707070","secondaryColor":"#ebebeb","count":10},{"id":1,"title":"Frutas e Vegetais","primaryColor":"#9bba4b","secondaryColor":"#f5f8ed","count":12},{"id":2,"title":"Peixaria","primaryColor":"#536dfe","secondaryColor":"#edf0fe","count":9},{"id":3,"title":"Talho","primaryColor":"#f50057","secondaryColor":"#fee5ee","count":7},{"id":4,"title":"Padaria e Pastelaria","primaryColor":"#f1b108","secondaryColor":"#fdf7e6","count":43},{"id":5,"title":"Comida Fresca","primaryColor":"#b6a33d","secondaryColor":"#f7f5eb","count":1},{"id":6,"title":"Charcutaria","primaryColor":"#8e24aa","secondaryColor":"#f3e9f6","count":25},{"id":7,"title":"Queijos","primaryColor":"#f28d14","secondaryColor":"#fdf3e7","count":27},{"id":8,"title":"Refeições Prontas","primaryColor":"#1f85ad","secondaryColor":"#e8f2f6","count":4},{"id":9,"title":"Congelados","primaryColor":"#558b2f","secondaryColor":"#eef3ea","count":119},{"id":10,"title":"Laticínios","primaryColor":"#d06e4d","secondaryColor":"#faf0ed","count":43},{"id":11,"title":"Iogurtes","primaryColor":"#3e6e9d","secondaryColor":"#ebf0f5","count":108},{"id":12,"title":"Garrafeira","primaryColor":"#c74b72","secondaryColor":"#f9edf0","count":387},{"id":13,"title":"Cervejas","primaryColor":"#ca7620","secondaryColor":"#f9f1e8","count":38},{"id":14,"title":"Bebidas","primaryColor":"#bf360c","secondaryColor":"#f8eae6","count":98},{"id":15,"title":"Mercearia","primaryColor":"#ef6c00","secondaryColor":"#fdf0e5","count":637},{"id":16,"title":"Cuidados e Beleza","primaryColor":"#00b8d4","secondaryColor":"#e5f7fa","count":749},{"id":17,"title":"Parafarmácia","primaryColor":"#d06e4d","secondaryColor":"#faf0ed","count":29},{"id":18,"title":"Cuidados do Lar","primaryColor":"#6a51c9","secondaryColor":"#f0edf9","count":477},{"id":19,"title":"Animais","primaryColor":"#a29497","secondaryColor":"#f5f4f4","count":86},{"id":20,"title":"Bazar","primaryColor":"#7da4c1","secondaryColor":"#f2f5f8","count":29},{"id":-1,"title":"Outros","primaryColor":"#8E8E93","secondaryColor":"#FFFFFF","count":82}]}]
```