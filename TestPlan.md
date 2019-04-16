# Test Plan

*This is the template for your test plan. The parts in italics are concise explanations of what should go in the corresponding sections and should not appear in the final document.*

**Author**: Team Fire Health

## 1 Testing Strategy

### 1.1 Overall strategy

The testing process will be devided to two parts: frontend and backend testing.

### 1.2 Frontend test

Frontend UI, frontend flow of push notifications will be tested manually.

### 1.3 Backend test

FHIR & FDA API intergrations will be tested at the backend
Server <=> Client intergratons will be tested at the backend

### 1.4 Bug Tracking

All bugs and enhancements will be tracked using the Github issues tracker.

### 1.5 Technology

Python and Jenkins for backend testing
Manually test for front end testing


## 2 Test Cases-Front end 

*This section should be the core of this document. You should provide a table of test cases, one per row. For each test case, the table should provide its purpose, the steps necessary to perform the test, the expected result, the actual result (to be filled later), pass/fail information (to be filled later), and any additional information you think is relevant.*

<table>
  <tr>
    <td>Test ID</td>
    <td>Req ID</td>
    <td>Black / White</td>
    <td>Purpose</td>
    <td>Steps</td>
    <td>Expected</td>
    <td>Result</td>
    <td>Pass/Fail</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
    <td>B</td>
    <td>Test valid login</td>
    <td>Login with known user</td>
    <td>Successful login</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>2</td>
    <td>1</td>
    <td>B</td>
    <td>Test invalid login</td>
    <td>Login with non-existent user </td>
    <td>Failed login</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>3</td>
    <td>1</td>
    <td>B</td>
    <td>Create valid user</td>
    <td>Create new user with new information</td>
    <td>User created</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>4</td>
    <td>1</td>
    <td>B</td>
    <td>Create invalid user</td>
    <td>Create new user with same info as another existing user</td>
    <td>User create failed</td>
    <td></td>
    <td>Failed</td>
  </tr>
  <tr>
    <td>5</td>
    <td>1</td>
    <td>B</td>
    <td>Test valid authentication</td>
    <td>Login with good credentials for known user</td>
    <td>Login successful</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>6</td>
    <td>1</td>
    <td>B</td>
    <td>Test wrong credentials</td>
    <td>Login with wrong password for known user</td>
    <td>Auth failed</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>7</td>
    <td>1</td>
    <td>B</td>
    <td>Test authentication for unknown user</td>
    <td>Login with unknown user</td>
    <td>Auth failed</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>8</td>
    <td>2</td>
    <td>B</td>
    <td>Ensure all actions are available</td>
    <td>Landing screen shows</td>
    <td>Landing screen shows</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>9</td>
    <td>3</td>
    <td>B</td>
    <td>Test only for log-out button on landing screen</td>
    <td>Log out user</td>
    <td>User logged out and back to login page</td>
    <td></td>
    <td>Pass</td>
  </tr>
  <tr>
    <td>10</td>
    <td>3</td>
    <td>B</td>
    <td>Test that Pharmacy info is correct</td>
    <td>Pharmacy info is the same as user input at registration</td>
    <td>Pharmacy info is the same as user input at registration</td>
    <td></td>
    <td>Failed</td>
  </tr>
  <tr>
    <td>11</td>
    <td>3</td>
    <td>B</td>
    <td>Test only for edit profile button on landing screen</td>
    <td>Go to edit profile screen</td>
    <td>All fields are displayed</td>
    <td></td>
    <td>Failed</td>
  </tr>
</table>


