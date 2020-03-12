$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SocialNetworkAPITesting.feature");
formatter.feature({
  "line": 1,
  "name": "Testing API using restAssured",
  "description": "",
  "id": "testing-api-using-restassured",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "3. Test that existing comment can be retrieved with a GET request",
  "description": "",
  "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Service is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I create a new comment with the following details \"\u003cpostId\u003e\", \"\u003cname\u003e\", \"\u003cemail\u003e\" and \"\u003cbody\u003e\",",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "The correct \"\u003cpostId\u003e\", \"\u003cname\u003e\", \"\u003cemail\u003e\" and \"\u003cbody\u003e\" are returned",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "status code of 201 is returned for successful comment post",
  "keyword": "And "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;",
  "rows": [
    {
      "cells": [
        "postId",
        "name",
        "email",
        "body"
      ],
      "line": 31,
      "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;;1"
    },
    {
      "cells": [
        "4688",
        "Comment Post",
        "Apitest@alysha.tv",
        "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati"
      ],
      "line": 32,
      "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;;2"
    },
    {
      "cells": [
        "105577",
        "Using restAssured",
        "restAssured@api.testing",
        "voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis"
      ],
      "line": 33,
      "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "3. Test that existing comment can be retrieved with a GET request",
  "description": "",
  "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Service is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I create a new comment with the following details \"4688\", \"Comment Post\", \"Apitest@alysha.tv\" and \"non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati\",",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "The correct \"4688\", \"Comment Post\", \"Apitest@alysha.tv\" and \"non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati\" are returned",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "status code of 201 is returned for successful comment post",
  "keyword": "And "
});
formatter.match({
  "location": "SocialNetworkAPITestingStepDef.java:30"
});
formatter.result({
  "duration": 8812460000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4688",
      "offset": 51
    },
    {
      "val": "Comment Post",
      "offset": 59
    },
    {
      "val": "Apitest@alysha.tv",
      "offset": 75
    },
    {
      "val": "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati",
      "offset": 99
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:102"
});
formatter.result({
  "duration": 2950372500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4688",
      "offset": 13
    },
    {
      "val": "Comment Post",
      "offset": 21
    },
    {
      "val": "Apitest@alysha.tv",
      "offset": 37
    },
    {
      "val": "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati",
      "offset": 61
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:115"
});
formatter.result({
  "duration": 1196498300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 15
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:121"
});
formatter.result({
  "duration": 390800,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "3. Test that existing comment can be retrieved with a GET request",
  "description": "",
  "id": "testing-api-using-restassured;3.-test-that-existing-comment-can-be-retrieved-with-a-get-request;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Service is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I create a new comment with the following details \"105577\", \"Using restAssured\", \"restAssured@api.testing\" and \"voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis\",",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "The correct \"105577\", \"Using restAssured\", \"restAssured@api.testing\" and \"voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis\" are returned",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "status code of 201 is returned for successful comment post",
  "keyword": "And "
});
formatter.match({
  "location": "SocialNetworkAPITestingStepDef.java:30"
});
formatter.result({
  "duration": 265227000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "105577",
      "offset": 51
    },
    {
      "val": "Using restAssured",
      "offset": 61
    },
    {
      "val": "restAssured@api.testing",
      "offset": 82
    },
    {
      "val": "voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis",
      "offset": 112
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:102"
});
formatter.result({
  "duration": 411657100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "105577",
      "offset": 13
    },
    {
      "val": "Using restAssured",
      "offset": 23
    },
    {
      "val": "restAssured@api.testing",
      "offset": 44
    },
    {
      "val": "voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis",
      "offset": 74
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:115"
});
formatter.result({
  "duration": 138942200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 15
    }
  ],
  "location": "SocialNetworkAPITestingStepDef.java:121"
});
formatter.result({
  "duration": 197500,
  "status": "passed"
});
});