Feature: Testing API using restAssured
#  @tag
  Scenario Outline: Test that existing post can be retrieved with a GET request
    Given Service is up and running
    When I search for "<id>" of a post with a GET method
    Then I should get the correct "<id>", "<title>" and "<body>" returned
    And status code of 200 is returned
    Examples:
      | id | title                                      | body                                                                                                               |
      | 18 | voluptate et itaque vero tempora molestiae | eveniet quo quis\nlaborum totam consequatur non dolor\nut et est repudiandae\nest voluptatem vel debitis et magnam |
      | 11 | et ea vero quia laudantium autem           | delectus reiciendis molestiae occaecati non minima eveniet qui voluptatibus\naccusamus in eum beatae sit\nvel qui neque voluptates ut commodi qui incidunt\nut animi commodi |

#  @tag
  Scenario Outline: 2. Test that posts can be created with the Post request
    Given Service is up and running
    When I create a new post with the following details "<uId>", "<title>" and "<body>"
    And status code of 201 is returned for created post
    Then I should ge the correct "<uId>", "<title>" and "<body>" returned for post request
    Examples:
      | uId  | title                                    | body                                              |
      | 4432   |Leaning API testing with postman           | learning to post API using restAssured |
      | 0221 | second post with restAssured on intellij | learning to automate API                          |

  @tag
    Scenario Outline: 3. Test that existing comment can be retrieved with a GET request
      Given Service is up and running
      When I create a new comment with the following details "<postId>", "<name>", "<email>" and "<body>",
      Then The correct "<postId>", "<name>", "<email>" and "<body>" are returned
      And status code of 201 is returned for successful comment post
      Examples:
        | postId | name              | email                   | body                                                                                                                                                                |
        | 4688 | Comment Post      | Apitest@alysha.tv       | non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati       |
        | 105577 | Using restAssured | restAssured@api.testing | voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis |

#create user story and write the test for get User request (use particular user id = 6)
