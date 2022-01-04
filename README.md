# test-report 
Repo is aimed to investigate different approaches of test result 
reporting under Github actions.

##JUnit test reporters:

**1. EnricoMi/publish-unit-test-result-action**

Pros

* easy to integrate with existing JUnit tests

Cons
 
* report is poor - no views with failed / passed tests, links 
to the tests, etc.
* there are some issues, say, 
[not published on run without commit](https://giters.com/EnricoMi/publish-unit-test-result-action/issues/165)

**2. junit-report-action-demo.yml**
