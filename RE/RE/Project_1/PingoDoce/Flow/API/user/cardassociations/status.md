Request:
```json
GET /api/v2/user/cardassociations/status HTTP/1.1
Host: app-proxy.pingodoce.pt
Pdapp-Storeid: -1
Pdapp-Cardnumber: 
Pdapp-Lcid: 64147ea7c77762af853639c2
Pdapp-Hid: 5826423315
Pdapp-Clubs: 
X-App-Version: v-3.1.5 buildType-release flavor-prod
X-Device-Version: Android-29
X-Screen-Density: 3.5
Authorization: Bearer eyJhbGciOiJSUzUxMiIsInR5cCI6ImF0K2p3dCJ9.eyJuYmYiOjE2Nzk1OTUzNzYsImV4cCI6MTY3OTU5ODk3NiwiaXNzIjoiaHR0cHM6Ly9hcHAtcHJveHkucGluZ29kb2NlLnB0LyIsImF1ZCI6InBkYXBwIiwiY2xpZW50X2lkIjoiUERBcHBDbGllbnQiLCJzdWIiOiIzZGZkNDcyOC01NmQ2LTQ3MjAtNGRmMS0wOGRiMjZiNWUyMmMiLCJhdXRoX3RpbWUiOjE2Nzk1OTUzNzYsImlkcCI6ImxvY2FsIiwic2NvcGUiOlsib3BlbmlkIiwicGRhcHAuYW5vbnltb3VzX2FjY2VzcyIsInBkYXBwLmNoYW5nZV9udW1iZXIiLCJwZGFwcC5mdWxsX2FjY2VzcyIsInBkYXBwLm9uYm9hcmRpbmdfYWNjZXNzIiwicGRhcHAuc21zX2FjY2VzcyIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.JXz6cbw81wkeA_GGtI2Ny06uuv0sgxjZ1zaLpupOo30j0XhtZ7QCkYpGGhMj4xtUvWTALETrnIbNHL_jfPnLozR8GLDji366GRpzKsPvkqoSo_vIl03XqZznMGKe3QbrTq8f4PSDy_yDftzL8RbUaibjq69uTzmNbEaOxsvgAWmTLi5c1aFT7JoJPNoBv6xxJ-Fo-MhUD74_BDgHR9pUtmv88wHT_Mjx0GqvvKOC01tu1Lztzxo-jOtwON6J3ZTj-L4YIB3HbjaKwfhJ5RClcWd09RBJH1xKdyvyrEZ2BoIt8kmTw6gz-VOT3z0MHY1OpknL3Zk76OauD1e-RFkXCQ
Accept-Language: en-US
Accept-Encoding: gzip, deflate
User-Agent: okhttp/4.10.0
Connection: close


```

Response:
```json
HTTP/1.1 200 OK
Connection: close
Content-Type: application/json; charset=utf-8
Date: Thu, 23 Mar 2023 18:16:21 GMT
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
Content-Length: 2427

{"cardNumber":"2446100018213","cardType":"PoupaMais","status":"APPROVED","hasRequests":false,"hasNewActiveBenefits":true,"activeBenefits":1,"fuelBenefits":0.0,"benefitsBalance":0.0,"fuelBenefitsPts":0,"totalSaved":0.0,"statusPayload":{"delegateInvite":false,"maskedPhoneNumber":"93*****80","isOwner":true},"benefits":[{"id":"23688","startDate":"2023-03-21T00:00:00","endDate":"2023-03-27T23:59:59","description":"1 Emb. Bol. Belgas Cacau Avelã 100g Pingo Doce","title":"APP","isNew":false,"isExpiring":false,"clubCode":"","ean":0,"moreInfo":"<p><strong><span font-family:calibri,sans-serif;font-size:11pt;\"\"=\"\" style=\"\">Campanha válida em todas as lojas Pingo Doce de Portugal Continental e Madeira numa compra de valor igual ou superior a 20€, valor líquido de promoções. O valor do artigo oferta, não conta para o valor mínimo de compra. Oferta de desconto equivalente ao valor do artigo oferta, líquido de promoções.</span></strong></p><p margin-left:0;margin-right:0;\"\"=\"\" style=\"\"><span font-family:verdana,sans-serif;font-size:8pt;\"\"=\"\" style=\"\">Estão excluídos para o valor da compra os seguintes artigos: Leite infantil 1 e especiais, livros, artigos referentes a ações de fidelização, marca Code, medicamentos (MNSRM e veterinários), Testes de detecção rápida à Covid-19, máscaras de protecção facial, luvas, álcool (etílico, gel e spray), Sushi Daily, Sushi Gourmet, custo de entregas ao domicílio, produtos adquiridos a crédito, Experiências Odisseias, gás e acessórios, lotaria, cartão Presente, cartão Pré-pago NOS, taras, sacos de compras (plástico, papel, ráfia e juta) e embalagens de utilização única, artigos cujo valor reverte para entidades terceiras e cabazes de Natal Pingo Doce.</span> <span font-family:verdana,sans-serif;font-size:8pt;\"\"=\"\" style=\"\">A promoção não é válida nos Restaurantes, espaços Café e Bolos, Outlet, lojas BemEstar, postos de abastecimento Pingo Doce, lojas PD&Go, Nova SBE, plataformas Glovo, bringeat.pt, takeaway.com, serviço de encomendas Take Away e Mercadão.</span></p>","imageUrl":"https://prod-cdn-images-pdapp-jm.azureedge.net/images/benefitTypes/86178335-54e3-48df-af4f-5dd524c24705.png","sortOrder":3000}],"dateUpdated":"2023-03-23T18:16:21","fuelBenefitsToBeExpiredColors":{},"benefitsToBeExpiredColors":{"backgroundColor":"#FAEEEF","titleColor":"#CF5362"},"poupaMaisStatus":"OwnerNoRequests"}
```