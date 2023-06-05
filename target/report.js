$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Flipkart.feature");
formatter.feature({
  "name": "Product Search on Flipkart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launching the website through url",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductSearch_Stepdefinition.launching_the_website_through_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login page is handled",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearch_Stepdefinition.login_page_is_handled()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching a Product on Flipkart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "entering a product name in search bar",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearch_Stepdefinition.entering_a_product_name_in_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get price of a product in search results",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearch_Stepdefinition.get_price_of_a_product_in_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});