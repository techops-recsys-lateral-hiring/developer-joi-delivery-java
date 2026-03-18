# Welcome to JOI Delivery
JOI Delivery is built for real life. For the young professional who gets home late and doesn’t have the energy to cook. For the student with an exam tomorrow and an empty fridge tonight. These aren’t exceptions — they’re everyday moments. That’s why JOI Delivery brings food and groceries to your door, fast, fresh, and right when you need them.

Customers struggle with:

- Cluttered browsing experiences that don’t understand their preferences.
- Limited customization when ordering meals or groceries.
- Unclear order status or delivery timelines.
- Poor payment experience, or failed checkouts.
- Lack of timely feedback channels to report a bad experience or appreciate a good one.

JOI Delivery was built not just as another delivery app, but as a thoughtful, technology-first platform that reimagines how essentials reach customers in the most seamless way.

# Introducing JOI Delivery

JOI Delivery, launched in 2024, is a hyperlocal delivery app designed to bring food and groceries to your doorstep in under 45 minutes. With the tagline "Speed meets convenience," it connects customers to nearby restaurants and stores through a seamless digital experience. The app solves the hassle of long wait times and limited local options by offering real-time tracking, instant order updates, and a wide network of trusted vendors.

## Business Goals
- Differentiated Value Proposition & Niche Dominance
- Deliver Unmatched Customer Experience & Loyalty
- Superior Operational Efficiency & Cost Advantage
- Robust & Engaged Partner Ecosystem

## Why they need Thoughtworks help
As JOI Delivery continues to grow and serve more neighborhoods, we’re scaling our platform to handle increasing demand, enhance user experience, and support smarter delivery logistics. They're looking for passionate developers to help us build robust, efficient, and scalable solutions that power everything from order placement to real-time tracking.
Your expertise will directly impact how quickly and reliably customers receive their essentials—and how smoothly local vendors and delivery partners operate within our ecosystem.

### Users/Customers
Sample user profiles are available in the repository to support development and testing scenarios.

| UserId   | FirstName | LastName|
|----------|-----------|---------|
| user101  | John      | Doe     |

### Stores
Sample store data seeded for development purposes only.

| StoreId  | OutletName     |
|----------|----------------|
| store101 | Fresh Picks    |
| store102 | Natural Choice |

### Grocery Products
Dummy Products for Stores to sell and users to buy from.

| ProductId  | ProductName | StoreRefId |
|------------|-------------|------------|
| product101 | Wheat Bread | store101   |
| product102 | Spinach     | store101   |
| product103 | Crackers    | store101   |

## API

Below is a list of API endpoints with their respective input and output. Please note that the application needs to be running for the following endpoints to work. For more information about how to run the application, please refer to run the application section above.

### Add Product to Cart
```http
POST /cart/product
Content-Type: application/json
```

Request Body
```json
{
  "userId": "user101",
  "productId": "product101",
  "outletId": "store101"
}
```

Response Body
```json
{
  "cart": {
    "cartId": "cart101",
    "outlet": null,
    "products": [
      {
        "productId": "product103",
        "productName": "Crackers",
        "mrp": 10.5,
        "sellingPrice": null,
        "weight": 500,
        "expiryDate": 0,
        "threshold": 10,
        "availableStock": 30,
        "discount": null,
        "store": {
          "name": "Fresh Picks",
          "description": null,
          "outletId": "store101",
          "inventory": []
        }
      }
    ],
    "user": null
  },
  "product": {
    "productId": "product103",
    "productName": "Crackers",
    "mrp": 10.5,
    "sellingPrice": null,
    "weight": 500,
    "expiryDate": 0,
    "threshold": 10,
    "availableStock": 30,
    "discount": null,
    "store": {
      "name": "Fresh Picks",
      "description": null,
      "outletId": "store101",
      "inventory": []
    }
  },
  "sellingPrice": null
}
```

### View Cart
```http
GET /cart/view?userId=user101
```

Response Body
```json
{
  "cartId": "cart101",
  "outlet": null,
  "products": [],
  "user": null
}
```

### Inventory Health
```http
GET /inventory/health?storeid=<storeid>
```

Response Body 
```json lines
{
    // to be implemented.
}
```

## Tech Requirements
The project requires Java 25. If you have multiple JVMs on your machine, you might want to 
consider using a tool such as [sdkman](https://sdkman.io/) to handle switching between versions.

The project makes use of Gradle and uses the Gradle wrapper, which means you don't need Gradle installed.

### Installing Java

Install java using homeBrew
```console
brew install openjdk@25
```

Installing java on Windows, [refer](https://www.java.com/en/download/help/windows_manual_download.html#xd_co_f=NzA3YTZmNzAtOTEzMS00OWFiLTk2NjUtODg0NjNhMjRhMjkw~)

Other ways to Download and install java, [refer](https://www.oracle.com/in/java/technologies/downloads/#java25).

#### Verify Java Version Installed
```console
java -version
```

### Useful Gradle commands
#### Build the project
Compiles the project, runs the test and then creates an executable JAR file
```bash
$ ./gradlew build
```

#### Run the application
Run the application which will be listening on port ```8080```.
```bash
$ ./gradlew bootRun
```

Run the application using Java and the executable JAR file produced by the Gradle ```build``` task. The application will be listening on port ```8080```.
```bash
$ java -jar  build/libs/joi-delivery-java.jar
```

#### Run the tests
There are two types of tests, the unit tests and the functional tests. These can be executed as follows.

* Run unit tests only
```bash
$ ./gradlew test
```
* Run both unit and functional tests
```bash
$ ./gradlew check
```
#### List all Gradle tasks
List all the tasks that Gradle can run, such as ```build ``` and ```test```.
```bash
$ ./gradlew tasks
```
