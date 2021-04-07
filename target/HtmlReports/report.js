$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureTags/LoginFeature.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with Valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigate to the website",
  "keyword": "When "
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the register page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "12345"
      ]
    },
    {
      "cells": [
        "xyz",
        "12345"
      ]
    },
    {
      "cells": [
        "mohamed",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the website",
  "keyword": "When "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_navigate_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"abc\" and password as \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_enters_abc_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the register page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.the_register_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the website",
  "keyword": "When "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_navigate_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"xyz\" and password as \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_enters_abc_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the register page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.the_register_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Valid credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the website",
  "keyword": "When "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_navigate_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"mohamed\" and password as \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.user_enters_abc_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the register page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FeatureTagsStepDefinition.Login.the_register_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});