$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeaturesAmazon/AddToCart.feature");
formatter.feature({
  "name": "add to cart feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for an Tv Mount",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the result page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionAmazon.AddToCart.user_is_on_the_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  click on the first result",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionAmazon.AddToCart.user_click_on_the_first_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on the buy now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionAmazon.AddToCart.user_can_click_on_the_buy_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeaturesAmazon/SearchForTVMount.feature");
formatter.feature({
  "name": "search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for an Tv Mount",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionAmazon.SearchForTV.user_is_on_the_amazon_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for a Tv Mount",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionAmazon.SearchForTV.user_search_for_a_Tv_Mount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the result page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionAmazon.SearchForTV.the_result_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});