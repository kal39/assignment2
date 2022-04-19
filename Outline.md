# Todo

- `PriceCalculator`
- `PaymentInfo`

# Outline

- `com.group57`

  - `menu`

    - `Ingredient`

      ```java
      package com.group57.menu;
      
      public class Ingredient {
      	double price;
          
      	public Ingredient(double price) {}
      }
      ```

    - `MenuItem`

      ```java
      package com.group57.menu;
      
      import java.util.ArrayList;
      
      public class MenuItem {
      	ArrayList<Ingredient> ingredients;
      	
      	public void addIngredient(Ingredient ingredient) {}
      	public ArrayList<Ingredient> getIngredients() {}
      	public double getPrice() {}
      }
      ```

    - `Menu`

      ```java
      package com.group57.menu;
      
      import java.util.ArrayList;
      
      public class Menu {
      	ArrayList<MenuItem> menuItems;
      	
      	public Menu(ArrayList<MenuItem> items) {}
      	public ArrayList<MenuItem> getItems() {}
      }
      ```

      

  - `order_entry`

    - `PriceCalculator` (`Interface`) 

      ```java
      package com.group57.order_entry;
      
      public interface PriceCalculator {
      }
      ```

    - `Order`

      ```java
      package com.group57.order_entry;
      
      import com.group57.menu.MenuItem;
      import java.util.ArrayList;
      
      public class Order {
      	ArrayList<MenuItem> items;
      
      	public void addItem(MenuItem item) {}
      	public ArrayList<MenuItem> getItems() {}
      	public double getPrice(PriceCalculator priceCalculator) {}
      }
      
      ```

    - `PaymentInfo`

      ```java
      package com.group57.order_entry;
      
      public class PaymentInfo {
      }
      ```

    - `WebInterface`

      ```java
      package com.group57.order_entry;
      
      import com.group57.menu.Menu;
      import com.group57.menu.MenuItem;
      
      public class WebInterface {
      	Order order;
      
      	public Menu getMenu() {}
      	public void addItem(MenuItem item) {}
      	public double getCurrentPrice() {}
      	public void placeDeliveryOrder(PaymentInfo paymentInfo) {}
      }
      
      ```

  - `delivery`