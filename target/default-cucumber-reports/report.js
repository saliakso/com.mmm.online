$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login to user Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid Email and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User go to website",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDefinition.user_go_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valide email and Password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_valide_email_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login botton",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_login_botton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});