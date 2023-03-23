Request:
```json
POST /api/v2/catalog/search/categories HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: 814
Pdapp-Cardnumber: 2446100018213
Pdapp-Lcid: 64147ea7c77762af853639c2
Pdapp-Hid: 5826423315
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTUzNzYsImV4cCI6MTY3OTU5ODk3NiwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiIzZGZkNDcyOC01NmQ2LTQ3MjAtNGRmMS0wOGRiMjZiNWUyMmMiLCJhdXRoX3RpbWUiOjE2Nzk1OTUzNzYsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsib3BlbmlkIiwicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsInBkYXBwLmNoYW5nZV9udW1iZXIiLCJwZGFwcC5mdWxsX2FjY2VzcyIsInBkYXBwLm9uYm9hcmRpbmdfYWNjZXNzIiwicGRhcHAuc21zX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.JXz6cbw81wkeA_GGtI2Ny06uuv0sgxjZ1zaLpupOo30j0XhtZ7QCkYpGGhMj4xtUvWTALETrnIbNHL_jfPnLozR8GLDji366GRpzKsPvkqoSo_vIl03XqZznMGKe3QbrTq8f4PSDy_yDftzL8RbUaibjq69uTzmNbEaOxsvgAWmTLi5c1aFT7JoJPNoBv6xxJ-Fo-MhUD74_BDgHR9pUtmv88wHT_Mjx0GqvvKOC01tu1Lztzxo-jOtwON6J3ZTj-L4YIB3HbjaKwfhJ5RClcWd09RBJH1xKdyvyrEZ2BoIt8kmTw6gz-VOT3z0MHY1OpknL3Zk76OauD1e-RFkXCQ
Accept-Language: en-US
Content-Type: application/json; charset=UTF-8
Content-Length: 31
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"storeId":814,"hasPromo":true}
```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:21:18 GMT
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
Content-Length: 2077

[{"id":0,"title":"Destaque","primaryColor":"#707070","secondaryColor":"#ebebeb","count":29},{"id":1,"title":"Frutas e Vegetais","primaryColor":"#9bba4b","secondaryColor":"#f5f8ed","count":12},{"id":2,"title":"Peixaria","primaryColor":"#536dfe","secondaryColor":"#edf0fe","count":9},{"id":3,"title":"Talho","primaryColor":"#f50057","secondaryColor":"#fee5ee","count":7},{"id":4,"title":"Padaria e Pastelaria","primaryColor":"#f1b108","secondaryColor":"#fdf7e6","count":47},{"id":5,"title":"Comida Fresca","primaryColor":"#b6a33d","secondaryColor":"#f7f5eb","count":1},{"id":6,"title":"Charcutaria","primaryColor":"#8e24aa","secondaryColor":"#f3e9f6","count":26},{"id":7,"title":"Queijos","primaryColor":"#f28d14","secondaryColor":"#fdf3e7","count":31},{"id":8,"title":"Refeições Prontas","primaryColor":"#1f85ad","secondaryColor":"#e8f2f6","count":4},{"id":9,"title":"Congelados","primaryColor":"#558b2f","secondaryColor":"#eef3ea","count":132},{"id":10,"title":"Laticínios","primaryColor":"#d06e4d","secondaryColor":"#faf0ed","count":45},{"id":11,"title":"Iogurtes","primaryColor":"#3e6e9d","secondaryColor":"#ebf0f5","count":115},{"id":12,"title":"Garrafeira","primaryColor":"#c74b72","secondaryColor":"#f9edf0","count":426},{"id":13,"title":"Cervejas","primaryColor":"#ca7620","secondaryColor":"#f9f1e8","count":51},{"id":14,"title":"Bebidas","primaryColor":"#bf360c","secondaryColor":"#f8eae6","count":108},{"id":15,"title":"Mercearia","primaryColor":"#ef6c00","secondaryColor":"#fdf0e5","count":691},{"id":16,"title":"Cuidados e Beleza","primaryColor":"#00b8d4","secondaryColor":"#e5f7fa","count":835},{"id":17,"title":"Parafarmácia","primaryColor":"#d06e4d","secondaryColor":"#faf0ed","count":29},{"id":18,"title":"Cuidados do Lar","primaryColor":"#6a51c9","secondaryColor":"#f0edf9","count":538},{"id":19,"title":"Animais","primaryColor":"#a29497","secondaryColor":"#f5f4f4","count":98},{"id":20,"title":"Bazar","primaryColor":"#7da4c1","secondaryColor":"#f2f5f8","count":396},{"id":-1,"title":"Outros","primaryColor":"#8E8E93","secondaryColor":"#FFFFFF","count":91}]
```