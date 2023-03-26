![[Pasted image 20230324144230.png]]

The activity for this screen is `ShoppingListActivity`, and its package is `pt.pingodoce.presentation.shoppingList`.


#### Shopping List (Object)

This object seems to describe a single Shopping List, which are created by the user.
The data structure for shopping lists is the following:
```
description - string
isActive - boolean
products - List of ShoppingListProduct
sharedWith - List of Friend
dateCreated - String  
dateUpdated - String
id - String
clientId - String  
userId - String
name - String
```

This is an average Java Object with getters and setters and methods to, for example, add Friends to `sharedWith`.

#### Shopping List Category (Object)

```
name - string
color - string
sortOrder - int
```

#### Shopping List Product (Object)

```
id - int
category - ShoppingListCategory
name - string
unitLabel - string
badgeUrl - string
badgeDisclaimer - string
showBadgeDisclaimer - bool
badgeDisclaimerTitle - string
promotionCode - string 
priceLabel - string
unitPriceLabel - string
dateUpdated - string
sortOrder - int
manualOrder - int
deleted - bool
timeStamp - long
quantity - int
checked - bool
``` 