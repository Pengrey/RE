Request:
```json
POST /api/v2/user/shoppinglists/storemode HTTP/1.1
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
Content-Length: 49
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close

{"listId":"8091f6a7-b07e-4f86-8c7b-55290a6c31ab"}
```

Response:
```json
HTTP/1.1 400 Bad Request
Content-Length: 186
Connection: close
Content-Type: application/json
Date: Thu, 23 Mar 2023 18:22:11 GMT
api-supported-versions: 1,2
X-Powered-By: ASP.NET

{"errors":[{"status":"400","code":"1002","title":"Ocorreu um erro de validaÃ§Ã£o: nÃ£o vazio","detail":"O campo 'Coordinates' nÃ£o pode ser vazio","source":{"parameter":"coordinates"}}]}
```