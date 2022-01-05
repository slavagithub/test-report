# test-report 
Repo is aimed to investigate different approaches of test result 
reporting under Github actions.

##JUnit test reporters:

**1. EnricoMi/publish-unit-test-result-action**

https://github.com/slavagithub/test-report/runs/4705487203?check_suite_focus=true

**2. junit-report-action-demo.yml**

https://github.com/slavagithub/test-report/runs/4705632201?check_suite_focus=true

Pros (for both)

* easy to integrate with existing JUnit tests

Cons (for both)
 
* report is poor - no views with failed / passed tests, links 
to the tests, etc.
* there are some issues, say, 
[not published on run without commit](https://giters.com/EnricoMi/publish-unit-test-result-action/issues/165)


  
**3. test-reporter**
https://github.com/slavagithub/test-report/runs/4705769552?check_suite_focus=true

To check:
- https://blogs.oracle.com/developers/post/adventures-in-cicd-3-running-tests-publishing-test-reports
